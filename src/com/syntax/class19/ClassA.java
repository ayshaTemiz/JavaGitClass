package com.syntax.class19;

class ClassA {
    //write a program to inherit class A that has method printF which is static
    //and call and reuse that method inside class B

    static void printF(){
        System.out.println("I am printF");
    }
}

class ClassB extends ClassA{

}



