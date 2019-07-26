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
public class InheritanceConstructorsAndToString {
    
    public static void main(String[] args) {
        
        Singer singer1 = new Singer(30, "Urban", "Bebe", 11);
        
        System.out.println(singer1);
        
//        System.out.println("Professional Singer: " + singer1.getName() + " Music type: "+ singer1.getTypeOfMusic()+
//        " Number of Songs: " + singer1.getNumberOfSongs() + " Years of Experience: " + singer1.getYearsOfExperience());
//        
//        singer1.setName("Bebe");
//        singer1.setTypeOfMusic("Urban");
//        singer1.setNumberOfSongs(30);
//        singer1.setYearsOfExperience(11);
    }
    
}
