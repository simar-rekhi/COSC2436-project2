//Part 4
/* class StudentManager{
    -> As soon a Student account is loaded, this rushes to call classifyPerformance() method of the Predictor class
    -> classifyPerformance() immediately returns output upon loading/ adding a new Student to the system.
    -> creates tagPrevStudent() method which tags a user of type Student with the StudentManager.
    -> creates tagNewStudent() method which tags a NEW user.
*/

import java.io.Serializable;

public class StudentManager {
    //adding attributes for the class
    private Predictor predictor = new Predictor(); //obj of Predictor type
    private LinkedList<Student> students; //generic list that runs common through the entire program -- can be changed later

    public StudentManager() {
        students = new LinkedList<>();
    }
    //defining methods
    //tagPrevStudent() for previously loaded students
    public void tagPrevStudents() {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            String tag = predictor.classifyPerformance(s); 
            s.setPerformanceLabel(tag);
        }
    }

    //tagNewStudent() for new additions
    public void tagNewStudent(Student s) {
        String tag = predictor.classifyPerformance(s);
        s.setPerformanceLabel(tag);
        students.insertAtTail(s);
        System.out.println("Performance: " + tag);
    }

    public void displayAll() {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s + " | Performance: " + s.getPerformanceLabel());
        }
    }

    public LinkedList<Student> getStudents() {
        return students;
    }
}