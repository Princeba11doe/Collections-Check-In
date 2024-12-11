
        public class Main {
            public static void main(String[] args) {
                // Create an object of StudentList with the class, object, and constructor
                StudentList displayList = new StudentList();

                // Call the Add students method
                displayList.addStudents();

                // Print the original list of students
                displayList.printStudents();

                // Remove a student from the list with removeStudent method
                displayList.removeStudent("Charlie");

                // Call the sortStudent method to sort out the list of students
                displayList.sortStudents();
            }
        }