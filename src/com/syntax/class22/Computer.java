package com.syntax.class22;

public class Computer {
    //    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//    Define common behavior within and some fields in parent class and override some of the methods in child classes
//    Define some methods specific to child classes
//    Create objects of child classes and store them into array. Loop through each object and execute available methods.
    String model;
    int modelYear;

    Computer(String model, int modelYear) {
        this.model = model;
        this.modelYear = modelYear;
    }

    void store() {
        System.out.println(model + " is created in " + modelYear);
    }
}

class Apple extends Computer {
    Apple(String model, int modelYear) {
        super(model, modelYear);
    }

    @Override
    void store() {
        super.store();
    }

    void speed(String model) {
        this.model = model;
        System.out.println(model + "works fast");
    }

}

class Lenovo extends Computer {

    Lenovo(String model, int modelYear) {
        super(model, modelYear);
    }

    @Override
    void store() {
        super.store();
    }
}

class HP extends Computer {

    HP(String model, int modelYear) {
        super(model, modelYear);
    }

    @Override
    void store() {
        super.store();
    }
}

class Dell extends Computer {

    Dell(String model, int modelYear) {
        super(model, modelYear);
    }

    @Override
    void store() {
        super.store();
    }
}

class ComputerTest {

    public static void main(String[] args) {
        Computer[] obj = {new Apple("Apple", 2020), new HP("HP", 1995), new Dell("Dell", 2012), new Lenovo("lenovo", 1997)};
        for (Computer x : obj) {
            x.store();


        }


    }

}