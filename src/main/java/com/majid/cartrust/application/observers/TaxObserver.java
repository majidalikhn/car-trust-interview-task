package com.majid.cartrust.application.observers;

import org.springframework.stereotype.Component;

import java.util.Observable;
import java.util.Observer;

@Component
public class TaxObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Tax office was informed about new " + (String) arg + " car");

    }
}
