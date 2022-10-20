package com.company;

public class Main {

    public static void main(String[] args) {

        Lecturer lecturer1 = new Lecturer("Karol", "Pawlak", Level.GOOD);
        Lecturer student1 = new Lecturer("Tomek", "Janusz", Level.BAD);
        Humanable student2 = new Lecturer("Jan", "Wita", Level.GOD);
        Humanable student3 = new Lecturer("Rafal", "Tomczyk", Level.USELESS);

        System.out.println("student1 == student2: " + (student1 == student2));
        System.out.println("student1.equals(student2): " + (student1.equals(student2)));
        System.out.println();

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println();

        System.out.println(lecturer1.papugize("I am your lecturer and you have to listen to me !!!"));
        lecturer1.scream();
        System.out.println();

        student1.scream();
        student2.drink();
        student3.sleep();
        student3.scream();
        System.out.println();

        System.out.println(student2.papugize("I passed an exam !"));
        System.out.println();

        lecturer1.destroyTheStudents(student1);
        lecturer1.destroyTheStudents(student3);
        System.out.println();

        System.out.println("Studies are finished !");
        System.out.println();
    }
}
