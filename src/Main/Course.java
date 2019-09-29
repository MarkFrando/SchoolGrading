package Main;

import FacadeAdapter.*;

public class Course {
    String name;
    CourseInformation corInfo;
    Announcements ann;
    DueDates dates;
    Club club;

    public Course(String name) {
        this.name = name;
        corInfo = new CourseInformation();
        club = new Club(name + " Club");
        ann = new Announcements();
        dates = new DueDates();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Announcements getAnnouncements(){
        return ann;
    }
    
    public CourseInformation getInformation(){
        return corInfo;
    }
    
    public DueDates getDates(){
        return dates;
    }
    
    public Club getClub(){
        return club;
    }
}
