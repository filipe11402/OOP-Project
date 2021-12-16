package Models;
import Comparators.StudentScoreComparator;
import java.util.ArrayList;
import java.util.Collections;

public class ScoreBoardModel {
    private ArrayList<StudentModel> students;

    /**
     *
     * @param students
     */
    public ScoreBoardModel(ArrayList<StudentModel> students) {
        this.students = students;
    }

    /**
     * This method will sort the scores
     */
    public void sortScores(){
        Collections.sort(this.students, new StudentScoreComparator());
    }
}
