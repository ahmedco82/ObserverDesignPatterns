package com.ahmedco.observer.test2;

import com.ahmedco.observer.test2.Observer;
import com.ahmedco.observer.test2.Subject;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }


    @Override
    public void update() {
        // toOctalString
        System.out.println( "Hex String: " + subject.getState());
        //System.out.println( "Binary String: " + Integer.toBinaryString(subject.getState()));
      // System.out.println( "Binary String: " + Integer.toOctalString(subject.getState()));
    }
}
