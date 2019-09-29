package State;
import Main.*;

public class Failed extends State{
    public Failed(Grade grade){
        super(grade);
    }
    
    public Failed(State source){
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
        return false;
    }
}
