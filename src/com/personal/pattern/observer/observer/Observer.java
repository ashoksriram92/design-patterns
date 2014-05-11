package com.personal.pattern.observer.observer;

import com.personal.pattern.observer.subject.WeatherData;

/**
 *
 * @author ashoksrirampandian
 */
public interface Observer {
    public void update(WeatherData wd);
}
