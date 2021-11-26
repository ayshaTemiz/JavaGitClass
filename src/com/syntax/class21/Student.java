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
//        Student[] obj={new CollegeStudent(),new SchoolStudent(),new SyntaxStudent()};
//
//        for(Student  x:obj){
//            x.study();
//            x.takeNote();
//        }

        Student obj1 = new SchoolStudent();
        SchoolStudent sch = (SchoolStudent) obj1;
        sch.missingClass();
        sch.study();
        sch.takeNote();
    }
}