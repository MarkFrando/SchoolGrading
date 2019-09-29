package State;
import Main.*;

public class Pending extends State{
    
    public Pending(Grade grade){
        super(grade);
    }
    
    public Pending(State source){
        super(source);
    }
    
    public State transitionState(){
        double grade = getContext().getGrade();
        if(grade >= 50){
            getContext().setState(new Passed(this));
        }else{
            getContext().setState(new Failed(this));
        }
        return getContext().getState();
    }
}
