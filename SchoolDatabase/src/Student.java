public class Student {
    // Fields
    private String firstName;
    private String lastName;
    private int grade;
    private final int studentNumber;

    // Assign unique student numbers
    static int nextStudentNumber = 1;

    // Constructor
    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = nextStudentNumber;
        nextStudentNumber++;
    }

    // Getters and setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    // Getter only for StudentNumber

    public int getStudentNumber() {
        return studentNumber;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + " Grade: " + grade + " Student Number: " + studentNumber;
    }
    // needed when removing a student
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student other = (Student) o;
        return this.firstName.equals(other.firstName) &&
                this.lastName.equals(other.lastName) &&
                this.grade == other.grade;
    }
}
