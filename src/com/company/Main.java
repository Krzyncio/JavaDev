package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal();
	    dog.weight = 20.00;

        System.out.println(dog.weight);

        Auto car = new Auto();
        car.capacity = 1900.00;
        System.out.println(car.capacity);
}
}
