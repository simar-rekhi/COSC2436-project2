public class GraduateStudent extends Student {
    private static final long serialVersionUID = 1L;
    private String thesisTopic;

    public GraduateStudent(String studentId, String name, String thesisTopic) {
        super(studentId, name);
        
        if (!studentId.matches("G\\d+")) {
            throw new IllegalArgumentException("Invalid Graduate ID format. Must be 'G' followed by numbers (e.g., G54321).");
        }
        
        this.thesisTopic = thesisTopic;
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
}
