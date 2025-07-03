package org.example.shankar.abstraction;

abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Regular method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
        myDog.eat();
    }
}
/*
📝 Explanation:

sound() is an abstract method defined in Animal.

Dog provides the implementation.

Main uses abstraction to interact with the Animal reference.*/

