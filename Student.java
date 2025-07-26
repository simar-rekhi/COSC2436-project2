import java.io.Serializable;

public abstract class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    protected String studentId;
    protected String name;

    public Student(String studentId, String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be empty.");
        }
        this.name = name;
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public abstract String getStudentType();

    @Override
    public String toString() {
        return "ID: " + studentId + ", Name: " + name + ", Type: " + getStudentType();
    }
}
