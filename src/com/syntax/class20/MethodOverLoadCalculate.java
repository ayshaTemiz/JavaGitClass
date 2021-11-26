package com.syntax.class20;

public class MethodOverLoadCalculate {

     void calculateArea(double length,double width ){
        System.out.println(length*width);
    }

    void calculateArea(double length,double width,double heigth){
        System.out.println(length*width*heigth);
    }

    public static void main(String[] args) {
        MethodOverLoadCalculate obj=new MethodOverLoadCalculate();
        obj.calculateArea(10,20);
        obj.calculateArea(3,5,10);
    }

}
