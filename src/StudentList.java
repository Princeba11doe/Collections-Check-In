import java.util.ArrayList;
import java.util.Collections;



public class StudentList {
    // Instance variable to store the list of students
    private ArrayList<String> students;

    // Constructor to initialize the ArrayList
    public StudentList() {
        students = new ArrayList<>();
    }
    // Use a default constructor

    // Method to add student names to the list
    public void addStudents() {
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        students.add("Eve");
    }

    // Method to print the list of students
    public void printStudents() {
        System.out.println("List of students: " + students);
    }

    // Method to remove a student by name
    public void removeStudent(String name) {
        students.remove(name);
        System.out.println("Updated list after removing " + name + ": " + students);
    }

    // Method to sort the list alphabetically
    public void sortStudents() {
        Collections.sort(students);
        System.out.println("Sorted list of students: " + students);
    }
}

