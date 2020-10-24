package com.company;

public class Animal {
    Double weight;

    void feed(Double fooWeight) {
        if (this.weight <= 0) {
            System.out.println("Too late");
        } else {
            this.weight += fooWeight;
            System.out.println("Thx for my weight is now " + this.weight);
        }

    }
}
