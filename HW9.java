package edu.neu.mgen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Define class "student"
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

  // Getting stundent ID
  public int getStudentId() {
      return studentId;
  }

  // Getting first name
  public String getFirstName() {
      return firstName;
  }

  // Getting last name
  public String getLastName() {
      return lastName;
  }

  // Getting studen info.
  public String toString() {
    return "ID: " + studentId + ", Name: " + firstName + " " + lastName;
  }
}

// Define class "EngClass"
class EngClass {
  private List<Student> students;

  // Constructor
  public EngClass() {
      students = new ArrayList<>();
  }

  // Add a student to the class
  public void addStudent(Student student) {
      students.add(student);
      System.out.println("Student with name " + student.getFirstName() + " " + student.getLastName() + " added.");
  }

  // Delete a student by student ID
  public void deleteStudent(int studentId) {
      Iterator<Student> iterator = students.iterator();
      while (iterator.hasNext()) {
          Student student = iterator.next();
          if (student.getStudentId() == studentId) {
              iterator.remove();
              System.out.println("Student with name " + student.getFirstName() + " " + student.getLastName() + " removed.");
              return;
          }
      }
      System.out.println("Student with ID " + studentId + " not found.");
  }

  // Print all students
  public void listStudents() {
      if (students.isEmpty()) {
          System.out.println("No students in the class.");
      } else {
          System.out.println("List of students in EngClass:");
          for (Student student : students) {
              System.out.println(student);
          }
      }
  }
}

public class HW9 {
  public static void main(String[] args) {
        // Creating an instance of EngClass
        EngClass engClass = new EngClass();

        // Adding students
        Student student1 = new Student(1101, "Jason", "Blazie");
        Student student2 = new Student(1102, "Jerry", "Sung");
        engClass.addStudent(student1);
        engClass.addStudent(student2);

        // Listing students
        engClass.listStudents();

        // Deleting a student
        engClass.deleteStudent(1101);

        // Listing students after deletion
        engClass.listStudents();
    }
}
