import java.io.Serializable;

public abstract class Student implements Comparable<Student>, Serializable {
    private static final long serialVersionUID = 1L;
    private String performanceLabel; 
    protected String studentId;
    protected String name;

    @Override
    public int compareTo(Student other) {
        return this.studentId.compareTo(other.studentId);
    }

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

    public void setPerformanceLabel(String label) {
    this.performanceLabel = label;
}

    public String getPerformanceLabel() {
    return performanceLabel;
}

    public abstract double getGpa();
    public abstract int getCredits();

}
