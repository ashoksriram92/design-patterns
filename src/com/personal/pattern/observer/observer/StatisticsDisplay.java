package com.personal.pattern.observer.observer;

import com.personal.pattern.observer.subject.Subject;
import com.personal.pattern.observer.subject.WeatherData;

/**
 *
 * @author ashoksrirampandian
 */
public class StatisticsDisplay extends Display implements Observer {
    float temperature, humidity, pressure;
    Subject weatherData;

    
    public StatisticsDisplay(Subject weatherData) {
        this.weatherData    =   weatherData;
        weatherData.registerObserver(this);
    }
    
    public void display() {
        System.out.println("Statistics Display : Temperature : " + this.temperature);
    }
    
    @Override
    public void update(WeatherData wd) {
        this.temperature    =   wd.getTemperature();
        this.pressure       =   wd.getPressure();
        this.humidity       =   wd.getHumidity();
        
        this.display();
    }

}
