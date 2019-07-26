package poly;

import java.util.ArrayList;

public class Inheritence1 {

    public static void main(String[] args) {

        System.out.println("\n ANd now we create a Cat");

        Cat cat = new Cat();

        System.out.println("\n And now we create a horse");

        Horse horse = new Horse();

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(horse);
        animals.add(cat);

        for (Animal an : animals){
        
        an.makeNoise();
        }
        
       
        
        


    }

}
