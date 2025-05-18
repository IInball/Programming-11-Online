public class Teacher {
    // Fields
    private String firstName;
    private String lastName;
    private String subject;

    // Constructor
    public Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // toString Method
    // Returns the teacher's full name and subject in the specified format
    public String toString() {
        return "Name: " + firstName + " " + lastName + " Subject: " + subject;
    }
   // needed when removing a teacher
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;

        Teacher other = (Teacher) o;
        return this.firstName.equals(other.firstName) &&
                this.lastName.equals(other.lastName) &&
                this.subject.equals(other.subject);
    }

}

