package com.github.vasiljeu95.tmslesson6;

public class Lesson6Class1 {
    public static void main(String[] args) {
        Car volkswagen = new Car("volkswagen");
        boolean n = volkswagen.isHigher(60);
        System.out.println(n);

        Car toyota = new Car(120);
        System.out.println(toyota.isHigher(60));
    }
}

class Car {
    int maxSpeed;
    String model;

    Car (String model) {
        this.model = model;
        maxSpeed = 100;
    }

    Car (int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    boolean isHigher (int avSpeed) {
        return maxSpeed > avSpeed;
    }
}