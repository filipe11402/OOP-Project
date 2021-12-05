package Models;
import Comparators.StudentScoreComparator;
import java.util.ArrayList;
import java.util.Collections;

public class ScoreBoardModel {
    private ArrayList<StudentModel> students;

    public ScoreBoardModel(ArrayList<StudentModel> students) {
        this.students = students;
    }

    public void sortScores(){
        Collections.sort(this.students, new StudentScoreComparator());
    }
}
