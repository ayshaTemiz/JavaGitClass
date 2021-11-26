package com.syntax.class21;

public class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " eating");
    }

    void performDailyTasks() {
        System.out.println("Eat sleep repeat");
    }
}

class Employee extends Person {
    Employee(String name) {
        super(name);
    }

    void performDailyTasks() {
        System.out.println("Working all the day in office and reading emails at night");
    }

}

class Studentss extends Person {
    Studentss(String name) {
        super(name);
    }

    void performDailyTasks() {
        System.out.println("Attending the classes at day reading at night");
    }
}

class Teacher extends Person {
    Teacher(String name) {
        super(name);
    }

    void performDailyTasks() {
        System.out.println("Giving homeworks a day party at night");
    }

    void designClasses() {
        System.out.println("Create repls and design new classes");
    }
}

class PersonTester {
    public static void main(String[] args) {
        /* Person person=new Teacher("Asghar");
        person.eat();*/
        // Teacher teacher=new Person("Person");
        //break till 8:53
        Person person1 = new Studentss("Mykl");
        Person[] persons = {new Studentss("Farhad"), new Employee("Naiya"), new Teacher("Asel")};

        for (Person person2 : persons) {
            person2.performDailyTasks();

            if (person2 instanceof Teacher) {
                ((Teacher) person2).designClasses();
            }
        }
    }
}