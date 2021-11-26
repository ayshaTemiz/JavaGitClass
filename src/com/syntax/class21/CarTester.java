package com.syntax.class21;

public class CarTester {
    public static void main(String[] args) {
        /* BMW bmw=new BMW();
        bmw.start();
        bmw.stop();
        bmw.park();
        Tesla tesla=new Tesla();
        tesla.start();
        tesla.stop();
        tesla.park();
        Toyota toyota=new Toyota();
        toyota.start();
        toyota.stop();
        toyota.park();*/

        //instead of writing like above, type like below in a short way;
        //parent class collects all the child classes creating an car type array .elements are child classes objects
        Car[] cars = {new BMW(), new Tesla(), new Toyota()};
        for (Car car : cars) {
            car.start();
            car.stop();
            car.park();
        }

    }
}

