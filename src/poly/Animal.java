/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

/**
 *
 * @author NASA
 */
public class Animal {
    
   public Animal() {
        
        System.out.println("Hello from COnstructor in Animal class");
    }
   
   public void sleep() {
       
       System.out.println("An Animal sleeps.....");
   
   }
   
   public void eat(){
   
       System.out.println("An Animal eats.....");
       
   }
   
   public void makeNoise(){
   
       System.out.println("DEFAULT NOISE.....");
   }
    
    public static void main(String[] args) {
        
//        System.out.println(" NOw we creat an animal");
        Animal animal = new Animal();
        
        Animal horse = new Horse();
        
//        System.out.println("\n and Now we creat A CAT");
//        Cat cat = new Cat();
        
        animal.eat();
        animal.sleep();
        
        horse.sleep();
        horse.eat();
        horse.makeNoise();
        
        if(horse instanceof Horse){
            
        (Horse)horse).makeNoise();
        }
        
        
        
        }
//        cat.eat();
//        cat.sleep();
//       
       
        
        
    }
}
