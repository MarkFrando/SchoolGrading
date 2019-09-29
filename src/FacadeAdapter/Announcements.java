package FacadeAdapter;

import java.util.ArrayList;

public class Announcements extends CourseInformation{
    ArrayList<String> announcements;
    
    public Announcements(){
        announcements = new CourseInformation().getInformation();
    }
    
    public void addAnnouncement(String announcement){
        addInformation(announcement);
    }
    
    public void removeAnnoucement(String announcement){
        removeInformation(announcement);
    }
    
    public ArrayList<String> getannouncements(){
        return getInformation();
    }
    
    public void printAnnouncementss(){
        printInformation();
    }
}
