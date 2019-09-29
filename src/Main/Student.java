package Main;



import java.util.ArrayList;

public class Student {
    String name;
    double average = 0;
    ArrayList<Grade> grades = new ArrayList<Grade>();
    ArrayList<Course> courses = new ArrayList<Course>();
    
    public Student(String name){
        this.name = name;
    }
    
    public ArrayList<Grade> getGrades(){
        return grades;
    }
    
    public void addGrade(Grade newGrade){
        grades.add(newGrade);
    }
    
    public void removeGrade(Grade oldGrade){
        grades.remove(oldGrade);
    }
}
