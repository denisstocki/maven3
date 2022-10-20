package com.company;

import java.util.Objects;

public class Student implements Humanable{

    private final String name;
    private final String surname;
    private final Level level;

    public Student(String name, String surname, Level level) {
        this.name = name;
        this.surname = surname;
        this.level = level;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", level=").append(level);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && level == student.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, level);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Level getLevel() {
        return level;
    }

    @Override
    public void scream() {
        System.out.println("I am a screaming student !");
    }

    @Override
    public void eat() {
        System.out.println("I am an eating student !");
    }

    @Override
    public void drink() {
        System.out.println("I am a drinking student !");
    }

    @Override
    public void run() {
        System.out.println("I am a running student !");
    }

    @Override
    public void jump() {
        System.out.println("I am a jumping student !");
    }

    @Override
    public void sleep() {
        System.out.println("I am a sleeping student !");
    }

    public void endStudies(){
        System.out.println("I throw studies, I am done :(");
    }
}
