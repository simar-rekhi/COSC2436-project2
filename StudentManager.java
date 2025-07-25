//Part 4
/* class StudentManager{
    -> As soon a Student account is loaded, this rushes to call classifyPerformance() method of the Predictor class
    -> classifyPerformance() immediately returns output upon loading/ adding a new Student to the system.
    -> creates tagPrevStudent() method which tags a user of type Student with the StudentManager.
    -> creates tagNewStudent() method which tags a NEW user.
*/

public class StudentManager {
    //adding attributes for the class
    private Predictor predictor = new Predictor(); //obj of Predictor type
    private LinkedList<Student> students; //generic list that runs common through the entire program -- can be changed later


    //defining methods
    //tagPrevStudent() 
    public void tagPrevStudent() {
        //using range-based for loop
        for(Student s : students) {
            String tag = predictor.classifyPerformance(s);
            s.setPerformanceLabel(tag); //needs to be changed as per part 3 --> based on what Atrin adds
        }
    }

    //tagNewStudent()
    public void tagNewStudent() {
        String tag = predictor.classifyPerformance(s);
        s.setPerformanceLabel(tag);
        //also adds new data to the linked list 
        students.add(s);
        System.out.println("Performance: " + tag);
    }
}