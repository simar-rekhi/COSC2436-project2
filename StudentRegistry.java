import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRegistry {
    private List<Student> students;
    private static final String FILENAME = "students.dat";

    public StudentRegistry() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }
    
    public void printStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }
        System.out.println("--- Student Roster ---");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("----------------------");
    }

    public void saveToFile() {
        System.out.println("\nAttempting to save student records to " + FILENAME + "...");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            oos.writeObject(students);
            System.out.println("✅ Records saved successfully!");
        } catch (IOException e) {
            System.err.println("🚨 Error: Could not save file. " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void loadFromFile() {
        System.out.println("\nAttempting to load student records from " + FILENAME + "...");
        File file = new File(FILENAME);
        if (!file.exists()) {
            System.out.println("Info: No existing student file found. Starting with an empty list.");
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME))) {
            students = (List<Student>) ois.readObject();
            System.out.println("✅ Records loaded successfully!");
        } catch (FileNotFoundException e) {
            System.err.println("🚨 Error: File not found. " + e.getMessage());
        } catch (IOException e) {
            System.err.println("🚨 Error: Could not read from file. " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("🚨 Error: The class structure has changed. Cannot load data.");
        }
    }

    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();

        System.out.println("--- Creating Students ---");
        try {
            registry.addStudent(new UndergraduateStudent("U101", "Alice Smith", "Computer Science", 3.6, 30));
            registry.addStudent(new GraduateStudent("G202", "Bob Johnson", "AI Ethics", 3.0, 20));
            registry.addStudent(new UndergraduateStudent("U103", "Charlie Brown", "Physics", 2.5, 28));

            System.out.println("\nAttempting to create a student with an invalid ID...");
            registry.addStudent(new GraduateStudent("GRAD-404", "David Dame", "Quantum Computing", 3.2, 25));

        } catch (IllegalArgumentException e) {
            System.err.println("🚨 Creation Failed! " + e.getMessage());
        }
        
        System.out.println();
        registry.printStudents();
        
        registry.saveToFile();

        registry.students.clear();
        System.out.println("\nCleared the current student list in memory.");
        registry.printStudents();

        registry.loadFromFile();
        registry.printStudents();
    }
}
