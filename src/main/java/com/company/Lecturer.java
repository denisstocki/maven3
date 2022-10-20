package com.company;

import java.util.Objects;

public class Lecturer implements Humanable{

    private final String name;
    private final String surname;
    private final Level level;

    public Lecturer(String name, String surname, Level level) {
        this.name = name;
        this.surname = surname;
        this.level = level;
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
    public String toString() {
        final StringBuffer sb = new StringBuffer("Lecturer{");
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
        Lecturer lecturer = (Lecturer) o;
        return Objects.equals(name, lecturer.name) && Objects.equals(surname, lecturer.surname) && level == lecturer.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, level);
    }

    @Override
    public void scream() {
        System.out.println("I am a screaming lecturer !");
    }

    @Override
    public void eat() {
        System.out.println("I am an eating lecturer !");
    }

    @Override
    public void drink() {
        System.out.println("I am a drinking lecturer !");
    }

    @Override
    public void run() {
        System.out.println("I am a running lecturer !");
    }

    @Override
    public void jump() {
        System.out.println("I am a jumping lecturer !");
    }

    @Override
    public void sleep() {
        System.out.println("I am a sleeping lecturer !");
    }

    public void destroyTheStudents(Humanable student){
        System.out.println("I remove you: " + student.toString());
    }
}
