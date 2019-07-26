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
public class Poly2 {
    
    
    public static void main(String[] args) {
        
        
        ArrayList<Animal> myAnimals = new ArrayList<>();
        
        Bird bird1 = new Bird();
        
        Fish fish1 = new Fish();
        
        myAnimals.add(bird1);
        myAnimals.add(fish1);
        
        for(Animal a: myAnimals){
        
        a.move();
        
        
//        for( Animal a: myAnimals) {
//            
//            if ( a instanceof Fish){
//                
//            ((Fish)a).move();
//            } else if (a instanceof Bird){
//            
//            ((Bird) a).move();
//            }
        
        }
        
        
        
    }
    
}
