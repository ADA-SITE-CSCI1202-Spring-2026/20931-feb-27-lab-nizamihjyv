public class Student extends Person {

    private String studentId;

    public Student() {}

    public Student(String firstName, String lastName, String gender,
                   String studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String toString() {
        return super.toString() + ", Student ID: " + studentId;
    }

    // equals method that compares all fields. (it is in all classes too)
    public boolean equals(Student s) {
        return super.equals(s) &&
               studentId.equals(s.studentId);
    }
}