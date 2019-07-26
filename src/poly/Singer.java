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
public class Singer extends Artist {
    
    
    private int numberOfSongs;
    private String TypeOfMusic;
    
    public Singer ( int numberOfSongs, String TypeOfMusic, String name, int yearsOfExperience)
    {
     super(name, yearsOfExperience);
     this.numberOfSongs = numberOfSongs;
     this.TypeOfMusic = TypeOfMusic;
    
    }

    public int getNumberOfSongs() {
        return numberOfSongs;
    }

    public void setNumberOfSongs(int numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }

    public String getTypeOfMusic() {
        return TypeOfMusic;
    }

    public void setTypeOfMusic(String TypeOfMusic) {
        this.TypeOfMusic = TypeOfMusic;
    }
    
    @Override
    public String toString() {
    
    return super.toString() + "Experience: Singer " + "NumberOfSongs: "+ numberOfSongs + " TypeOfMusic: " + TypeOfMusic ;
    
    }
    
    
}
