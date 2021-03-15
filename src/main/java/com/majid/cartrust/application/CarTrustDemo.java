package com.majid.cartrust.application;

import com.majid.cartrust.application.observable.CarRegisteryObservable;
import com.majid.cartrust.application.observers.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarTrustDemo {

    private CarRegisteryObservable carRegisteryObservable;
    private BankObserver bankObserver;
    private InsuranceObserver insuranceObserver;
    private MechanicServiceObserver mechanicServiceObserver;
    private NumberPlateObserver numberPlateObserver;
    private PoliceObserver policeObserver;
    private TaxObserver taxObserver;

    @Autowired
    public CarTrustDemo(CarRegisteryObservable carRegisteryObservable, BankObserver bankObserver,
                        InsuranceObserver insuranceObserver, MechanicServiceObserver mechanicServiceObserver,
                        NumberPlateObserver numberPlateObserver, PoliceObserver policeObserver, TaxObserver taxObserver) {
        this.carRegisteryObservable = carRegisteryObservable;
        this.bankObserver = bankObserver;
        this.insuranceObserver = insuranceObserver;
        this.mechanicServiceObserver = mechanicServiceObserver;
        this.numberPlateObserver = numberPlateObserver;
        this.policeObserver = policeObserver;
        this.taxObserver = taxObserver;
    }

    public void addObservers(){
        carRegisteryObservable.addObserver(bankObserver);
        carRegisteryObservable.addObserver(insuranceObserver);
        carRegisteryObservable.addObserver(mechanicServiceObserver);
        carRegisteryObservable.addObserver(numberPlateObserver);
        carRegisteryObservable.addObserver(policeObserver);
        carRegisteryObservable.addObserver(taxObserver);
        carRegisteryObservable.registry();
    }


}
