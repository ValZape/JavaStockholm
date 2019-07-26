/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.Poly2;

/**
 *
 * @author NASA
 */
public class Technician extends Employee {
    
    int numbersOfServerCrashes = 0;
    
    public Technician(String name, double Salary){
    
    super(name, Salary);
    }
    
    
    public double bonus(){
    
    double bonus = employeeBonusBase - numbersOfServerCrashes;
    return bonus;
    
    }
    
    public void anotherServerCrash(){
    
    numbersOfServerCrashes =+1;
    }
    
    
    
}
