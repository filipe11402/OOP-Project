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

    /**
     *
     * @param exam
     * This method prints the students.
     */
    public void showStudents( ExamModel exam)
    {
        for (StudentModel student: exam.getStudents()) {
            System.out.println(student.getStudentName() + " " + student.getTotalScore());
        }
    }

}
