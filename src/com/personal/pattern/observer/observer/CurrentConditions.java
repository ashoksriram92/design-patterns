package com.personal.pattern.observer.observer;

import com.personal.pattern.observer.subject.Subject;
import com.personal.pattern.observer.subject.WeatherData;

/**
 *
 * @author ashoksrirampandian
 */
public class CurrentConditions extends Display implements Observer {
    
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;
    
    public CurrentConditions(Subject weatherData) {
        this.weatherData = weatherData;        
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Temperature : " + this.temperature + " Pressure : " + this.pressure);
    }
    
    @Override
    public void update(WeatherData wd) {
        this.humidity       =   wd.getHumidity();
        this.pressure       =   wd.getPressure();
        this.temperature    =   wd.getTemperature();
        this.display();
                
    }
    
}
