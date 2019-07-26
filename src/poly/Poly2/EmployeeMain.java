/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.Poly2;

import java.util.ArrayList;

/**
 *
 * @author NASA
 */
public class EmployeeMain {

    public static void main(String[] args) {

        ArrayList<Employee> empl = new ArrayList<>();

        Technician t1 = new Technician("Karl", 10000);
        Programmer p1 = new Programmer("Mats", 12000);
        Receptionist r1 = new Receptionist("Linda", 10000, 30);

        empl.add(t1);
        empl.add(p1);
        empl.add(r1);

        double totBonus = 0;
        
        for (Employee currentEmployee : empl) {

            totBonus += currentEmployee.bonus();
        }

//
//        for (int i = 0; i < empl.size(); i++) {
//            
//            totBonus += currentEmployee.bonus();
//            
//        }
        System.out.println(totBonus);

    
    }
    

    }

//        public static double sumBonus(ArrayList<Employee> emp) {
//            double totBonus = 0;
//
//            for (Employee currentEmployee : emp) {
//                if (currentEmployee instanceof Technician) {
//                    totBonus += ((Technician) currentEmployee).bonus();
//                } else if (currentEmployee instanceof Programmer) {
//
//                    totBonus += ((Programmer) currentEmployee).bonus();
//                } else if (currentEmployee instanceof Receptionist) {
//
//                    totBonus += ((Receptionist) currentEmployee).bonus();
//
//                }
//            }
//            return totBonus;
//        }



