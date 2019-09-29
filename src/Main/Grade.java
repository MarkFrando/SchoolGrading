package Main;

import State.*;

public class Grade {
    Course course;
    double grade;
    State state;
    
    public Grade(Course course, double grade){
        this.course = course;
        this.grade = grade;
        state = State.initialState(this);
    }
    
    public Course getCourses() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    public void setState(State newState){
        state = newState;
    }
    
    public State getState(){
        return state;
    }
    
    public boolean passed(){
        state.transitionState();
        return state.passed();
    }
}
