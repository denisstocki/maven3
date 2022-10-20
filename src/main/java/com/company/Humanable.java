package com.company;

public interface Humanable {
    void scream();
    void eat();
    void drink();
    void run();
    void jump();
    void sleep();
    default String papugize(String mg){
        return "You told me to say: " + mg;
    }
}
