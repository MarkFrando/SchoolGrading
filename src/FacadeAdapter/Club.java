package FacadeAdapter;

import java.util.ArrayList;

public class Club {
    String clubName;
    
    public Club(String clubName){
        this.clubName = clubName;
    }
    
    public String getClub(){
        return clubName;
    }
    
    public void setClub(String clubname){
        this.clubName = clubName;
    }
    
    public void printClub(){
        System.out.println("Club Name: " + clubName);
    }
}
