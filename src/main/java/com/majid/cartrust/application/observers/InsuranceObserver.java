package com.majid.cartrust.application.observers;

import org.springframework.stereotype.Component;

import java.util.Observable;
import java.util.Observer;

@Component
public class InsuranceObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Insurance office knows about the registration of the new " + (String) arg + " car");
    }
}
