package COCSingleton;

import java.util.ArrayList;
import java.util.Iterator;
import Main.*;

public class Principal implements GradeHandler{
    String name;
    GradeHandler handler;
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Course> courses = new ArrayList<Course>();
    private static Principal principal;
    
    public Principal(String name){
        this.name = name;
    }
    
    public static Principal getInstance(String name){
        if (principal == null){
            principal = new Principal(name);
        }
        return principal;
    }
    
    public ArrayList<Course> getCourses() {
        return courses;
    }
    
    public void addCourse(Course newCourse){
        courses.add(newCourse);
    }
    
    public void removeCourse(Course oldCourse){
        courses.remove(oldCourse);
    }
    
    public ArrayList<Student> getStudents(){
        return students;
    }
    
    public void addStudent(Student newStudent){
        students.add(newStudent);
    }
    
    public void removeStudent(Student oldStudent){
        students.remove(oldStudent);
    }
    
    public void setNextHandler(GradeHandler newHandler){
        handler = newHandler;
    }
    
    public double calculateAverage(ArrayList<Grade> gradesList){
        Iterator<Grade> grades = gradesList.iterator();
        double average = 0;
        int marked = 0;
        while(grades.hasNext()){
            Grade next = grades.next();
            average += next.getGrade();
            marked += 1;
        }
        if(marked > 0) average /= marked;
        return average;
    }
}
