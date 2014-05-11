package com.personal.pattern.observer.subject;

import com.personal.pattern.observer.observer.CurrentConditions;
import com.personal.pattern.observer.observer.Observer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ashoksrirampandian
 */
/*
    Implements the Subject interface which has methods for registering, removing and notifying an observer
*/
public class WeatherData implements Subject {
    private List<Observer> oList;
    
    private float temperature, humidity, pressure;

    /*
        Constructor creates a list of observers
    */
    public WeatherData() {
        oList = new ArrayList<>();
    }

    public void setMeasurements(double t, double h, double p) {
        temperature     =   (float) t;
        humidity        =   (float) h;
        pressure        =   (float) p;
        this.measurementsChanged();
    }
    
    public void measurementsChanged() {
        this.notifyObserver();
    }
    
    /*
        Calls the update method of all the observers which have registered for listening
    */
    @Override
    public void notifyObserver() {
        oList.stream().forEach((o) -> {
            o.update(this);
        });
    }

    @Override
    public void removeObserver(Observer o) {
        oList.remove(o);
    }


    @Override
    public void registerObserver(Observer o) {
        oList.add(o);
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
