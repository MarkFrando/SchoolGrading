package FacadeAdapter;

import java.util.ArrayList;

public class CourseInformation {
    ArrayList<String> information = new ArrayList<String>();
    
    public CourseInformation(){
        information = new ArrayList<String>();
    }
    
    public void addInformation(String info){
        information.add(info);
    }
    
    public void removeInformation(String info){
        information.remove(info);
    }
    
    public ArrayList<String> getInformation(){
        return information;
    }
    
    public void printInformation(){
        for(String info : information){
            System.out.println(info);
        }
    }
}
