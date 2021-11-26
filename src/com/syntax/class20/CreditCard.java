package com.syntax.class20;

public class CreditCard {
//    Create a class CreditCard and define variable balance and interest.
//    Create an instance method that will calculate interest based on the given balance.
//    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
//    Call the method by creating an object of each of the three classes.

    double balance;
    double interest;

    CreditCard(double balance) {
        this.balance = balance;
    }


    void calculateInterest() {
        interest = balance * 0.15;
        System.out.println(interest);
        System.out.println(balance);
    }

}

class Visa extends CreditCard {

    Visa(double balance) {
        super(balance);
    }
}

class AX extends CreditCard {
    AX(double balance) {
        super(balance);
    }

    @Override
    void calculateInterest() {
        super.calculateInterest();
    }
}

class Testing {
    public static void main(String[] args) {

        CreditCard obj1 = new CreditCard(100);
        obj1.calculateInterest();
        AX obj2 = new AX(200);
        obj2.calculateInterest();
        Visa obj3 = new Visa(300);
        obj3.calculateInterest();

    }
}

