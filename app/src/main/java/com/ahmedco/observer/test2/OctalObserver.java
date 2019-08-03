package com.ahmedco.observer.test2;

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(){
        System.out.println( "Hex String: " + subject.getState());
      //  System.out.println( "Octal String: " + Integer.toOctalString(subject.getState()));
    }
}