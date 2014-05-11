package com.personal.pattern.observer.subject;

import com.personal.pattern.observer.observer.Observer;

/**
 *
 * @author ashoksrirampandian
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void notifyObserver();
    public void removeObserver(Observer o);
}
