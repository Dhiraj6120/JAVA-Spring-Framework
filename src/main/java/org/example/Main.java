package org.example;

import com.spring.core.Bike;
import com.spring.core.Bus;
import com.spring.core.Car;
import com.spring.core.Traveller;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Bus bus = new Bus();
        Traveller traveller = new Traveller(bike);
        traveller.startJourney();
    }
}