package com.syntax.class22;

public class Parent {
    final double GRAVITY;

    Parent(double gravity) {
        this.GRAVITY = gravity;
    }

    final void printGravityValue() {
        // gravity=10.2;
        System.out.println(GRAVITY);
    }
}

class Child extends Parent {
    double gravity = 10.2;

    Child(double gravity) {
        super(gravity);
    }
   /* void printGravityValue(){
    }*/
}


class FinalDemo {
}
