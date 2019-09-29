package Main;

import COCSingleton.Teacher;
import COCSingleton.Principal;
import COCSingleton.Professor;
import COCSingleton.Assistant;
import java.util.Random;

public class School {
    Assistant assistant;
    Teacher teacher;
    Professor professor;
    Principal principal;
    public static void main(String[] args) {
        School school = new School();
        school.createAuthorizationFlow();
        Student s1 = new Student("Mark");
        Student s2 = new Student("Ali");
        Student s3 = new Student("Tyler");
        Student s4 = new Student("Steven");
        Student s5 = new Student("Ashraf");
        Student s6 = new Student("Harpreet");
        s1 = school.setGrades(s1);
        s2 = school.setGrades(s2);
        s3 = school.setGrades(s3);
        s4 = school.setGrades(s4);
        s5 = school.setGrades(s5);
        s6 = school.setGrades(s6);
        System.out.println(s1.name + " Average: " + school.assistant.calculateAverage(s1.getGrades()));
        System.out.println(s1.name + " Average: " + school.assistant.calculateAverage(s2.getGrades()));
        System.out.println(s1.name + " Average: " + school.assistant.calculateAverage(s3.getGrades()));
        System.out.println(s1.name + " Average: " + school.assistant.calculateAverage(s4.getGrades()));
        System.out.println(s1.name + " Average: " + school.assistant.calculateAverage(s5.getGrades()));
        System.out.println(s1.name + " Average: " + school.assistant.calculateAverage(s6.getGrades()));
    }
    
    public Student setGrades(Student student){
        Student newStudent = student;
        Random r = new Random();
        int rndGrd;
        Course c1 = new Course("Programming");
        Course c2 = new Course("Medicine");
        Course c3 = new Course("Engineering");
        Course c4 = new Course("Agriculture");
        Course c5 = new Course("Philosophy");
        Course c6 = new Course("Physical Education");
        rndGrd = r.nextInt(100) + 1;
        newStudent.addGrade(new Grade(c1, rndGrd));
        rndGrd = r.nextInt(100) + 1;
        newStudent.addGrade(new Grade(c2, rndGrd));
        rndGrd = r.nextInt(100) + 1;
        newStudent.addGrade(new Grade(c3, rndGrd));
        rndGrd = r.nextInt(100) + 1;
        newStudent.addGrade(new Grade(c4, rndGrd));
        rndGrd = r.nextInt(100) + 1;
        newStudent.addGrade(new Grade(c5, rndGrd));
        rndGrd = r.nextInt(100) + 1;
        newStudent.addGrade(new Grade(c6, rndGrd));
        return newStudent;
    }
    
    public void createAuthorizationFlow() {
        assistant = new Assistant("Assistant");
        teacher = new Teacher("Teacher");
        professor = new Professor("Professor");
        principal = Principal.getInstance("Principal");
        assistant.setNextHandler(teacher);
        teacher.setNextHandler(professor);
        professor.setNextHandler(principal);
    }
}
