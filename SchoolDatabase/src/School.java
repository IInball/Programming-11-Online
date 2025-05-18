import java.util.ArrayList;

public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

    // Fields
    private String schoolName;
    private String principalName;
    private String schoolAddress;

    // Constructor
    public School(String schoolName, String principalName, String schoolAddress) {
        this.schoolName = schoolName;
        this.principalName = principalName;
        this.schoolAddress = schoolAddress;
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }
    // Getters and setters

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    //Add Methods
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    //Delete Methods
    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    //Print Methods
    public void printAllTeachers() {
        System.out.println("Teachers:");
        for (Teacher t : teachers) {
            System.out.println(t);
        }
    }
    public void printAllStudents() {
        System.out.println("Students:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

