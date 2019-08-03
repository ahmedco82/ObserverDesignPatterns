package com.ahmedco.observer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ahmedco.observer.test1.Publisher;
import com.ahmedco.observer.test1.Reader;
import com.ahmedco.observer.test2.BinaryObserver;
import com.ahmedco.observer.test2.HexaObserver;
import com.ahmedco.observer.test2.OctalObserver;
import com.ahmedco.observer.test2.Subject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Test1();
        Test2();
       // Test3();
    }


    private void Test3(){
        //https://howtodoinjava.com/design-patterns/behavioral/observer-design-pattern/
        MessageSubscriberOne s1 = new MessageSubscriberOne();
        MessageSubscriberTwo s2 = new MessageSubscriberTwo();
        MessageSubscriberThree s3 = new MessageSubscriberThree();
        MessagePublisher p = new MessagePublisher();
        // MessagePublisher.List MessageSubscriberOne() &&  MessageSubscriberTwo()
        p.attach(s1);
        p.attach(s2);
       /*
       // MessagePublisher.List MessageSubscriberOne().update{
       m
       }
        MessagePublisher.List  MessageSubscriberTwo().update{
         m
        }
        &&  MessageSubscriberTwo()
         */
        p.notifyUpdate(new Message("First Message"));
        // s1 and s2 will receive the update ...........
        p.detach(s1);
        p.attach(s3);
        p.notifyUpdate(new Message("Second Message"));

        //  s2 and s3 will receive the update
    }






    private void Test2(){
//https://www.tutorialspoint.com/design_pattern/observer_pattern
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);

        /*
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
        */
    }


    private void Test1() {
        // https://3alam.pro/3zcs/articles/observer-design-pattern
        // TODO code application logic here
        Publisher pup = new Publisher();
        new Reader(pup);
        pup.setUpdate("Art1");
        pup.setUpdate("Art2");
        pup.setUpdate("Art3");
    }
}
