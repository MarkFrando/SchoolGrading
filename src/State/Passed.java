package State;
import Main.*;

public class Passed extends State{
    public Passed(Grade grade){
        super(grade);
    }
    
    public Passed(State source){
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
    
    public boolean passed(){
        return true;
    }
}
