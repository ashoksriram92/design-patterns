package com.personal.pattern.observer;

import com.personal.pattern.observer.observer.CurrentConditions;
import com.personal.pattern.observer.observer.StatisticsDisplay;
import com.personal.pattern.observer.subject.WeatherData;


/**
 *
 * @author ashoksrirampandian
 */
/*
    Observer Pattern
    Defines a 1:n dependency between objects so that when one object changes state,
    all it's dependents are notified an updated automatically

    Designs principles in play
        1. Strive for loosely coupled designs between objects that interact
        2. Loosely coupled objects can interact without knowing much about each other
*/
public class Main {
    public static void main(String[] args) {
         WeatherData w = new WeatherData();
        CurrentConditions c =   new CurrentConditions(w);
        StatisticsDisplay s =   new StatisticsDisplay(w);
    
        w.setMeasurements(80f, 65f , 30.4f);
    }
}
