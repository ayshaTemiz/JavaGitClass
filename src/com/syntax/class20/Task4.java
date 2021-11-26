package com.syntax.class20;

public class Task4 {
    //create one class with a private method that has 3 overloaded forms.
    //then call each overloaded method with specific arguments and observe result

    private void mult(int a){
        System.out.println(a*a);
    }

    private void mult(int a ,int b){
        System.out.println(a*b);
    }

    private void mult(int a, int b,int c){
        System.out.println(a*b*c);
    }

    public static void main(String[] args) {
        Task4 obj=new Task4();
        obj.mult(5);
        obj.mult(5,10);
        obj.mult(4,5,1);
    }
}
