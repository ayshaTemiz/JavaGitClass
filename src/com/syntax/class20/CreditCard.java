package com.syntax.class20;

public class CreditCard {
//    Create a class CreditCard and define variable balance and interest.
//    Create an instance method that will calculate interest based on the given balance.
//    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
//    Call the method by creating an object of each of the three classes.

    int balance;
    double interest;

    double calculateInterest(){
        return (balance*interest)/100;
    }
}

class Visa extends CreditCard{

}

class AX extends CreditCard{
    @Override
    double calculateInterest() {
        return super.calculateInterest();
    }
}
