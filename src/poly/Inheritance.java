
package poly;

import java.util.ArrayList;


public class Inheritance {
    
    public static void main(String[] args) {
        
        Student student1 = new Student();
        Employee employee1 = new Employee();
        Athlete athlete1 = new Athlete ();
        
        student1.setName("Valle");
        employee1.setName("Kalle");
        athlete1.setName("Salle");
        
        
        ArrayList<Person> peopleOfTown = new ArrayList<>();
        
        peopleOfTown.add(student1);
        peopleOfTown.add(employee1);
        peopleOfTown.add(athlete1);
                
                //all elements in arraylistare automatically casted to the 
                // type of the arrayList tht is   Person
                
                for ( Person p : peopleOfTown) {
                    
                    if( p instanceof Student){
                        System.out.println("Student name" + p.getName()+ "and average grade is" +((Student) p).calculateAverageGrade());
                    }
                    if ( p instanceof Athlete) {
                        System.out.println("eMPLYEES NAME:" + p.getName()+ "number of medals" + ((Athlete) p).getAmountOfMedals());
                    }
                    if ( p instanceof Employee) {
                        System.out.println("eMPLYEES NAME:" + p.getName()+ "has the salary" + ((Employee) p).getSalary());
                    }
            
            
        }
    }
    
}
