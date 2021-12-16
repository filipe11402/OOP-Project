package Comparators;

import Models.StudentModel;

import java.util.Comparator;

public class StudentScoreComparator implements Comparator<StudentModel> {
    /**
     *
     * @param student
     * @param studentToCompare
     * @return 0 , 1 or -1
     * This method will compare two students.
     */

    @Override
    public int compare(StudentModel student, StudentModel studentToCompare){
        if (student.getTotalScore() == studentToCompare.getTotalScore()) return 0;

        if (student.getTotalScore() < studentToCompare.getTotalScore()) return 1;

        else return -1;
    }
}
