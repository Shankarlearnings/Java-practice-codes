package org.example.shankar;

// This class models a Student with encapsulated fields, validation, and grade calculation
public class Student {

    // Private fields: can't be accessed directly from outside the class
    private String studentId;
    private int marks;
    private String name;

    // Constructor: initializes a new Student object
    public Student(String studentId, String name, int marks) {
        this.studentId = studentId;       // Assigns student ID
        this.name = name;                 // Assigns name
        setMarks(marks);                 // Use setter to apply validation when setting marks
    }

    // Getter method for marks
    public int getMarks() {
        return marks;
    }

    // Setter method for marks with validation
    public void setMarks(int marks) {
        // Only allow marks between 0 and 100
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Must be between 0 and 100.");
        }
    }

    // Getter method for student ID (read-only)
    public String getStudentId() {
        return studentId;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name (allows updating name)
    public void setName(String name) {
        this.name = name;
    }

    // Method to calculate grade based on marks
    public String getGrade() {
        if (marks >= 90) return "A";     // Grade A: 90 to 100
        else if (marks >= 75) return "B"; // Grade B: 75 to 89
        else if (marks >= 60) return "C"; // Grade C: 60 to 74
        else return "F";                  // Grade F: below 60
    }

    // Method to print all student details
    public void displayStudentInfo() {
        System.out.println("Student Id: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + getGrade()); // Calculate grade based on current marks
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Create a Student object with initial values
        Student s1 = new Student("47", "shankar", 80);

        // Display student info: should show Grade B
        s1.displayStudentInfo();

        // Update marks using setter
        s1.setMarks(45); // Invalid marks will be rejected by validation

        // Display updated info: should show Grade F if marks were accepted
        s1.displayStudentInfo();
    }
}
