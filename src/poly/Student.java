
package poly;

import java.util.ArrayList;

public class Student extends Person {
    
    private static String schoolName;
    private String program;
    ArrayList<Double> grades = new ArrayList<>();
    
    public void addGrade(double grade) {
    
    grades.add(grade);
    }
    
    public double calculateAverageGrade() {
    
        double sum = 0;
        
        for (Double grade : grades) {
         
            sum = sum + grade;
            
        }
     return sum / grades.size();
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
 
    
    
    
    
}
