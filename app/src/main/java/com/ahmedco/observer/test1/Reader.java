package com.ahmedco.observer.test1;

public class Reader implements Observer{

    private String article ;
    private Subject sub ;

    public Reader(Subject blog) {
        article = "" ;
        sub = blog ;
        sub.addObserver(this);
    }

    @Override
    public void Update() {
        article = sub.getUpdate();
        System.out.println("You :"+article);
    }

}
