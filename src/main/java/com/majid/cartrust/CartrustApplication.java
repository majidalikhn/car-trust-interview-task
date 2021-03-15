package com.majid.cartrust;

import com.majid.cartrust.application.CarTrustDemo;
import com.majid.cartrust.application.observable.CarRegisteryObservable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CartrustApplication {

    private static CarTrustDemo carTrustDemo;

    @Autowired
    public void setCarTrustDemo(CarTrustDemo carTrustDemo){
        CartrustApplication.carTrustDemo = carTrustDemo;
    }

    public static void main(String[] args) {
        SpringApplication.run(CartrustApplication.class, args);
        carTrustDemo.addObservers();
    }

}

