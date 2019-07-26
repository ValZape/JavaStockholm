
package poly.Poly2;


public abstract class Employee {
    
    private String name;
    private double salary;
    protected final double employeeBonusBase;
    
    public abstract double bonus();
    
    public Employee (String a, double c){
        this.employeeBonusBase = 3000;
        this.name = a;
        this.salary = c;
    
    }
  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
}
