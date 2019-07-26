
package poly;


 public class InheritanceEx {
     
     public static void main(String[] args) {
         
         
         Employee employee1 = new Employee();
         
         employee1.setName("Ida");
         employee1.setAge(25);
         employee1.setAdress("Goteborg, Linnvagen");
         employee1.setSalary(25000);
         
         Athlete athlete1 = new Athlete();
         
         athlete1.setName("Magnus");
         athlete1.setAge(25);
         athlete1.setAmountOfMedals(2);
         athlete1.setAdress("Goteborg, linngatan 7");
         
         
         Person student1 = new Student();
         
         student1.setName("ida");
         student1.setAge(25);
         student1.setAdress("Goteorg, stockholsbagen");
         ((Student) student1).setProgram("Java utveckling");
         ((Student) student1).addGrade(20);
         ((Student) student1).calculateAverageGrade();
         Student.setSchoolName("KTH"); // OBS STUDENT reference object is STUDENT not
         
         // Why would we want to create a student
         //with Person reference just to cast it back to Student when needed.
         // WHNE WE WORK WITH ARRAYS AND ARRYALIST.
         

         
     }
     
    
}
