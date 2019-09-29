package FacadeAdapter;

import java.util.ArrayList;

public class DueDates {
    ArrayList<String> dates = new ArrayList<String>();
    
    public DueDates(){
        
    }
    
    public void addDate(String date){
        dates.add(date);
    }
    
    public void removeDate(String date){
        dates.remove(date);
    }
    
    public ArrayList<String> getDates(){
        return dates;
    }
    
    public void printDates(){
        for(String date : dates){
            System.out.println(date);
        }
    }
}
