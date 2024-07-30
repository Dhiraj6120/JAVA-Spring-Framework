package com.spring.core;

public class Traveller {

//    Car car = null;
//    Bike bike = null;
//    Bus bus;
    Vehicle vehicle;
    public Traveller(Vehicle vehicle){
//        this.car = new Car();
//        this.bike = new Bike();
//        this.bus = new Bus();
        this.vehicle = vehicle;
    }

    public void startJourney(){
//        this.car.move();
//        this.bike.move();
//        this.bus.move();
        this.vehicle.move();
    }
}
