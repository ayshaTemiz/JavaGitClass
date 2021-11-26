package com.syntax.class20;

public class Task3 {
//create 1 class with a static method that has 3 overloaded froms.
// Then call each overloaded method with specific arguments and observe result

    static void print(boolean rain){
        System.out.println(1);
    }

    static void print(String bol){
        System.out.println(2);
    }

    static void print(double bol){
        System.out.println(5);
    }


    public static void main(String[] args) {
       print(true);
       print("java");
       print(33.5);

    }
}
