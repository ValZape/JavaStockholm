
package poly.Poly2;


public class Programmer extends Employee{
    
    int numberOfapplications;
    
    public Programmer(String name, double Salary){
    
    super(name,Salary);
    
    }
    
    
    public double bonus() {
    
        double bonus = employeeBonusBase * numberOfapplications;
        
        return bonus;
    
    }
    
    public void anOtherApplication(){
        
        numberOfapplications +=1;
    
    }
    
}
