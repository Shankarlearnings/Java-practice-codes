package org.example.shankar.abstraction;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }
}

public class AbstractEx2 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.stop();
    }
}

/*📝 Explanation:

Vehicle interface hides the implementation.

Car implements the interface.

Main uses only the Vehicle type.*/
