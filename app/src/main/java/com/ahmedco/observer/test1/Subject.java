package com.ahmedco.observer.test1;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
    public void setUpdate(String article);
    public String getUpdate();
}
