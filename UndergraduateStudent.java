public class UndergraduateStudent extends Student {
    private static final long serialVersionUID = 1L;
    private String major;
    private double gpa;
    private int credits;

    public UndergraduateStudent(String studentId, String name, String major, double gpa, int credits) {
    super(studentId, name);
    if (!studentId.matches("U\\d+")) {
        throw new IllegalArgumentException("Invalid Undergraduate ID...");
    }
    this.major = major;
    this.gpa = gpa;
    this.credits = credits;
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

    @Override
public double getGpa() {
    return gpa;
}

@Override
public int getCredits() {
    return credits;
}
}
