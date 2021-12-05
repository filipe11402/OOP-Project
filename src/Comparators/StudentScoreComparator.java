package Comparators;

import Models.StudentModel;

import java.util.Comparator;

public class StudentScoreComparator implements Comparator<StudentModel> {
    @Override
    public int compare(StudentModel student, StudentModel studentToCompare){
        if (student.getTotalScore() == studentToCompare.getTotalScore()) return 0;

        if (student.getTotalScore() < studentToCompare.getTotalScore()) return 1;

        else return -1;
    }
}
