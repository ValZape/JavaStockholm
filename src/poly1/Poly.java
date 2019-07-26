package poly1;

import java.util.ArrayList;

public class Poly {

    public static void main(String[] args) {

        ArrayList<Animal> myAnimals = new ArrayList<>();
        
        
        Bird bird1 = new Bird();
        Bird bird2 = new Bird();
        
        Fish fish1 = new Fish();
        Fish fish2 = new Fish();
        
        
        myAnimals.add(fish1);
        myAnimals.add(bird1);
        
        for(Animal a: myAnimals){
        
            
            a.move();
        }
        
        

    }

}
