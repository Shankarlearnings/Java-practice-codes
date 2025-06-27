package org.example.shankar.inheritance;

// Employee class extends Person class to reuse common attributes like name and age
public class Employee extends Person {

    // Specific attribute of Employee
    String jobTitle;

    // Method that defines the work behavior of an employee
    public void work() {
        // 'name' is inherited from the Person class
        System.out.println(name + " is working as a " + jobTitle);
    }

    // Main method to test the Employee class functionality
    public static void main(String[] args) {
        // Creating an object of Employee class
        Employee emp = new Employee();

        // Setting values to inherited fields from Person
        emp.name = "Alice";           // 'name' is inherited from Person
        emp.age = 30;                 // 'age' is inherited from Person

        // Setting Employee-specific field
        emp.jobTitle = "Software Developer";

        // Calling the introduce method from the Person class
        emp.introduce();              // Output: Hi, my name is Alice and I am 30 years old.

        // Calling the work method defined in Employee class
        emp.work();                   // Output: Alice is working as a Software Developer
    }
}
/*

📘 What is Inheritance in Java?
Inheritance is a core concept in Object-Oriented Programming (OOP) that allows a class (child/subclass) to acquire properties and behaviors (fields and methods) from another class (parent/superclass).

It promotes code reuse, modularity, and helps establish a hierarchical relationship between classes.

🧠 Key Concepts of Inheritance:
Term	Description
Superclass (Parent)	The class whose members are inherited.
Subclass (Child)	The class that inherits from another class.
        extends keyword	Used to declare inheritance.
Reusability	Reuse fields and methods of existing classes.
Method Overriding	Subclass can redefine a method from the parent.
        super keyword	Used to call the parent class's constructor or method.
*/

/*package org.example.shankar.inheritance;

** If I want to   write encapsulation to this the below is the code with encapsulation

public class Employee extends Person {
    String jobTitle;

    public void work() {
        // Accessing name using getName() because name is private in Person
        System.out.println(getName() + " is working as a " + jobTitle);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        // Setting private fields using setters
        emp.setName("Alice");
        emp.setAge(30);

        emp.jobTitle = "Software Developer";

        emp.introduce();  // Still works, it uses internal access
        emp.work();       // Uses getName() to access private name
    }
}*/



