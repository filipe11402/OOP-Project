package Models;

import Comparators.StudentScoreComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ScoreBoardModel {
    private ArrayList<StudentModel> students;

    public ScoreBoardModel(ArrayList<StudentModel> students) {
        this.students = students;
    }

    public void sortScores(){
        Collections.sort(this.students, new StudentScoreComparator());
    }
}
