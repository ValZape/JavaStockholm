package poly.Poly2;

public class Receptionist extends Employee {

    int age;
    double bonus;

    public Receptionist(String name, double Salary, int age) {

        super(name, Salary);
        this.age = age;

    }
    
    
    public double bonus(){
    
    bonus = employeeBonusBase + age*30;
    
    return bonus;
    }

}
