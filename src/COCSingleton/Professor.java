package COCSingleton;

import java.util.ArrayList;
import java.util.Iterator;
import Main.*;

public class Professor implements GradeHandler{
    String name;
    GradeHandler handler;
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Course> courses = new ArrayList<Course>();
    
    public Professor(String name){
        this.name = name;
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
        ArrayList<Grade> newGrades = new ArrayList<Grade>();
        double average = 0;
        int marked = 0;
        while(grades.hasNext()){
            Grade next = grades.next();
            if(next.getGrade() < 90){
                average += next.getGrade();
                marked += 1;
            }else{
                newGrades.add(next);
                while(grades.hasNext()){
                    newGrades.add(grades.next());
                }
                marked += 1;
                average += handler.calculateAverage(newGrades);
                break;
            }
        }
        if(marked > 1) average /= marked;
        return average;
    }
}
