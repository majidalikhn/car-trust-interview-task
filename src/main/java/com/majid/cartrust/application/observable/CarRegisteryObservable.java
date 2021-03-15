package com.majid.cartrust.application.observable;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Observable;


@Component
public class CarRegisteryObservable extends Observable {

    public void registry() {
        String[] cars = {"VW Gold", "Audi A8", "Mazda RX7"};
        Arrays.stream(cars).forEach(this::updateObservers);
    }

    private void updateObservers(String s) {
        setChanged();
        //notifying observers for the change
        notifyObservers(s);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("Progress stopped, error occurred");
        }
    }

}
