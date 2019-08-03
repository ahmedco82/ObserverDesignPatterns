package com.ahmedco.observer.test1;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject{
    private List<Observer> observers;

    String article;

    public Publisher() {
        observers = new ArrayList<>();
    }
    @Override
    public void addObserver(Observer o){
        observers.add(o);
    }
    @Override
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    @Override
    public void notifyObservers(){
        for(Observer ob:observers)
            ob.Update();
    }
    @Override
    public String getUpdate(){
        return article;
    }
    @Override
    public void setUpdate(String article){
        this.article = article ;
        notifyObservers();
    }
}