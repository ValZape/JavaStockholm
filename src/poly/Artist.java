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
public class Artist {
    
    private String name;
    private int yearsOfExperience;
    
    public Artist ( String name, int yearsOfExperience){
    
    this.name = name;
    this.yearsOfExperience = yearsOfExperience;
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    
    @Override
    public String toString(){
    
    return "Profession: Artist " + " Name:" + name+ " yearsOFExperience: " + yearsOfExperience + " ";
    }
    
}
