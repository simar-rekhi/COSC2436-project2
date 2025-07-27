public class GraduateStudent extends Student {
    private static final long serialVersionUID = 1L;
    private String thesisTopic;
    private double gpa;
    private int credits;

    public GraduateStudent(String studentId, String name, String thesisTopic, double gpa, int credits) {
        super(studentId, name);
        if (!studentId.matches("G\\d+")) {
            throw new IllegalArgumentException("Invalid Graduate ID...");
        }
        this.thesisTopic = thesisTopic;
        this.gpa = gpa;
        this.credits = credits;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    @Override
    public String getStudentType() {
        return "Graduate";
    }

    @Override
    public String toString() {
        return super.toString() + ", Thesis: " + thesisTopic;
    }

    @Override
    public double getGpa() {
        return gpa;
    }

    @Override
    public int getCredits() {
        return credits;
    }
}
