package org.example.shankar.inheritance;

// This is the base (parent) class named Person
public class Person {

    // Fields to store the name and age of a person
    String name;
   int age;

    // Method to introduce the person using their name and age
    public void introduce() {
        // Prints a simple introduction message
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old");
    }
}
/*
** If I want to write encapsulation to this the below is the code with encapsulation
package org.example.shankar.inheritance;

public class Person {
    // Fields are now private (data hiding)
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Introduce method using getters
    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old");
    }
}
*/

