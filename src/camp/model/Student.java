package camp.model;

import java.util.List;

public class Student {
    private String studentId;
    private String studentName;
    private Status status;

    public Student(String studentId, String studentName, Status status) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.status = status;
    }

    // Getter
    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public Status getStatus() { return status; }

    public void setStatus(Status status) { this.status = status; }

}
