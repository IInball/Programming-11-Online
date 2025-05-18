public class Main {
    public static void main(String[] args) {
        //Create school object
        School DSS = new School("Delta Secondary School", "Mr. Vasconcelos", "4615 51 St, Delta");

        //Add 10 students
        DSS.addStudent(new Student("Olivia", "Rodrigo", 12));
        DSS.addStudent(new Student("Rihanna", "Fenty", 11));
        DSS.addStudent(new Student("Sabrina", "Carpenter", 12));
        DSS.addStudent(new Student("Dua", "Lipa", 10));
        DSS.addStudent(new Student("Adele", "Adkins", 11));
        DSS.addStudent(new Student("Justin", "Bieber", 12));
        DSS.addStudent(new Student("Selena", "Gomez", 10));
        DSS.addStudent(new Student("Ariana", "Grande", 11));
        DSS.addStudent(new Student("Taylor", "Swift", 12));
        DSS.addStudent(new Student("John", "Mayer", 10));

        //Add 3 teachers
        DSS.addTeacher(new Teacher("Mr.", "Mendes", "Math"));
        DSS.addTeacher(new Teacher("Mr.", "The Weeknd", "Science"));
        DSS.addTeacher(new Teacher("Mr.", "Styles", "Music"));

        //Display both lists
        System.out.println("=== Initial Student List ===");
        DSS.printAllStudents();

        System.out.println("\n=== Initial Teacher List ===");
        DSS.printAllTeachers();

        //Remove 2 students
                Student targetStudent1 = new Student("Olivia", "Rodrigo", 12);
        // Check if targetStudent appears in the list
        for (int i = 0; i < DSS.students.size(); i++) {
            if (DSS.students.get(i).equals(targetStudent1)) {
                //System.out.println("Student found at index " + i);
                // Example: Remove the student
                DSS.students.remove(i);
                break;  // Stop after removing the first match
            }
        }
        Student targetStudent2 = new Student("Selena", "Gomez", 10);
        // Check if targetStudent appears in the list
        for (int i = 0; i < DSS.students.size(); i++) {
            if (DSS.students.get(i).equals(targetStudent2)) {
                //System.out.println("Student found at index " + i);
                // Example: Remove the student
                DSS.students.remove(i);
                break;  // Stop after removing the first match
            }
        }

        //Remove 1 teacher
        Teacher targetTeacher = new Teacher("Mr.", "The Weeknd", "Science");
        // Check if targetTeacher appears in the list
        for (int i = 0; i < DSS.teachers.size(); i++) {
            if (DSS.teachers.get(i).equals(targetTeacher)) {
                //System.out.println("Teacher found at index " + i);
                // Example: Remove the teacher
                DSS.teachers.remove(i);
                break;  // Stop after removing the first match
            }
        }

        //Display both lists again
        System.out.println("\n=== Updated Student List ===");
        DSS.printAllStudents();

        System.out.println("\n=== Updated Teacher List ===");
        DSS.printAllTeachers();
    }
}

