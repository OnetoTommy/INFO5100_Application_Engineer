package edu.neu;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class HW09_Code {
  
    public static void main(String[] args) {
        // Creating an instance of EngClass
        EngClass engClass = new EngClass();

        // Adding students
        Student student1 = new Student(1, "John", "Doe");
        Student student2 = new Student(2, "Jane", "Smith");
        engClass.addStudent(student1);
        engClass.addStudent(student2);

        // Listing students
        engClass.listStudents();

        // Deleting a student
        engClass.deleteStudent(1);

        // Listing students after deletion
        engClass.listStudents();
    }

}

class Student {
  private int studentId;
  private String firstName;
  private String lastName;

  // Constructor
  public Student(int studentId, String firstName, String lastName) {
      this.studentId = studentId;
      this.firstName = firstName;
      this.lastName = lastName;
  }

  // Getters
  public int getStudentId() {
      return studentId;
  }

  public String getFirstName() {
      return firstName;
  }

  public String getLastName() {
      return lastName;
  }

  public String toString() {
    return "ID: " + studentId + ", Name: " + firstName + " " + lastName;
  }
}

class EngClass {
  private List<Student> students;

  // Constructor
  public EngClass() {
      students = new ArrayList<>();
  }

  // Add a student to the class
  public void addStudent(Student student) {
      students.add(student);
      System.out.println("Student " + student.getFirstName() + " " + student.getLastName() + " added.");
  }

  // Delete a student by student ID
  public void deleteStudent(int studentId) {
      Iterator<Student> iterator = students.iterator();
      while (iterator.hasNext()) {
          Student student = iterator.next();
          if (student.getStudentId() == studentId) {
              iterator.remove();
              System.out.println("Student " + student.getFirstName() + " " + student.getLastName() + " removed.");
              return;
          }
      }
      System.out.println("Student with ID " + studentId + " not found.");
  }

  // List all students in the class
  public void listStudents() {
      if (students.isEmpty()) {
          System.out.println("No students in the class.");
      } else {
          System.out.println("List of students in the engineering class:");
          for (Student student : students) {
              System.out.println(student);
          }
      }
  }
}

