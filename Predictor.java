//Part 4
/* class Predictor{
    -> analyzes student's performance and based on GPA & credit ranges, dumps it into one out of
        Honor Roll, On Track, High Risk
    -> Uses String classifyPerformance(Student s) method for the purpose of comparison
    }
*/

public class Predictor {
    
    String classifyPerformance(Student s) {
        if (s.getGpa() >= 3.5 && s.getCredits() >= 30){
            return "Honor Roll";
        }
        else if (s.getGpa() < 2.0){
            return "High Risk";
        }
        else {
            return "On Track";
        }
    }
}