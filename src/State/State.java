package State;
import Main.*;

public class State {
    private Grade context;
    
    public State(State source){
        setContext(source.getContext());
    }
    
    public State(Grade grade){
        setContext(grade);
    }
    
    public static State initialState(Grade grade){
        return new Pending(grade);
    }
    
    public Grade getContext(){
        return context;
    }
    
    public void setContext(Grade newGrade){
        context = newGrade;
    }
    
    public State transitionState(){
        return null;
    }
    
    public boolean passed(){
        return false;
    }
}
