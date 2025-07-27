//Parts 1 and 2:: Ayro Escrobar
// Parts 3 and 5: Atrin Shahroudi
// Part 4: Simar Rekhi


// PRELIMINARY TESTING WINDOW -------------------
public class Main {
    public static void main(String[] args) {
        // Testing linked list with Student objects
        LinkedList<Student> studentList = new LinkedList<>();

        Student s1 = new UndergraduateStudent("U001", "Alice", "CS", 3.6, 35);
        Student s2 = new GraduateStudent("G001", "Bob", "AI", 2.9, 20);
        Student s3 = new UndergraduateStudent("U002", "Charlie", "Math", 1.8, 28);

        studentList.insertAtTail(s1);
        studentList.insertAtTail(s2);
        studentList.insertAtTail(s3);

        System.out.println("Original Student List:");
        studentList.display();

        // Sorting & Displaying
        studentList.selectionSort();
        System.out.println("\nAfter Selection Sort:");
        studentList.display();

        // Searching
        int index = studentList.linearSearch(s2);
        System.out.println("\nIndex of Bob: " + index);

        // Classification
        System.out.println("\n--- Performance Predictions ---");
        for (int i = 0; i < studentList.size(); i++) {
            Student s = studentList.get(i);
            Predictor predictor = new Predictor();
            String performance = predictor.classifyPerformance(s);
            System.out.println(s.getName() + " - " + performance);
        }

        // Display test
        Student testNew = new UndergraduateStudent("U009", "Daisy", "Biology", 3.9, 31);
        Predictor predictor = new Predictor();
        String pred = predictor.classifyPerformance(testNew);
        System.out.println("\nNew student classification (Daisy): " + pred);
    }
}
