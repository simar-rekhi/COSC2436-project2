public class UndergraduateStudent extends Student {
    private static final long serialVersionUID = 1L;
    private String major;

    public UndergraduateStudent(String studentId, String name, String major) {
        super(studentId, name);

        if (!studentId.matches("U\\d+")) {
            throw new IllegalArgumentException("Invalid Undergraduate ID format. Must be 'U' followed by numbers (e.g., U12345).");
        }

        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String getStudentType() {
        return "Undergraduate";
    }

    @Override
    public String toString() {
        return super.toString() + ", Major: " + major;
    }
}
