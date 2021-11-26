package com.syntax.class21;

public class Student {

    void study() {
        System.out.println("Students must study");
    }

    void takeNote() {
        System.out.println("Students must take a note during class");
    }
}

class SyntaxStudent extends Student {
    @Override
    void study() {
        super.study();
    }
}

class CollegeStudent extends Student {
    @Override
    void study() {
        super.study();
    }

    void payTutionFee() {
        System.out.println("College Student must pay tution fee");
    }
}

class SchoolStudent extends Student {
    @Override
    void study() {
        super.study();
    }

    void missingClass() {
        System.out.println();
    }
}

class Testing {
    public static void main(String[] args) {
        Student[] obj = {new CollegeStudent(), new SchoolStudent(), new SyntaxStudent()};

        for (Student x : obj) {
            x.study();
            x.takeNote();
            //eger ortak olmayan methodu da (sadece CollegeStudent icinde olan methodu da) yazdirmak istuyorsam if kullanmaliyim
            if (x instanceof CollegeStudent) {
                ((CollegeStudent) x).payTutionFee();
            }

        }


    }
}