package Comparators;

import Models.StudentModel;

import java.util.Comparator;

public class StudentScoreComparator implements Comparator<StudentModel> {
    @Override
    public int compare(StudentModel student, StudentModel studentToCompare){
        return Double.compare(student.getTotalScore(), studentToCompare.getTotalScore());
    }
}
