package com.majid.cartrust.application.observers;

import org.springframework.stereotype.Component;

import java.util.Observable;
import java.util.Observer;

@Component
public class PoliceObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Data about new " + (String) arg + " car was added into Police records");
    }
}
