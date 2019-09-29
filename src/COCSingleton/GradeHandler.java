package COCSingleton;



import Main.Grade;
import java.util.ArrayList;

public interface GradeHandler {
    void setNextHandler(GradeHandler handler);
    double calculateAverage(ArrayList<Grade> grades);
}
