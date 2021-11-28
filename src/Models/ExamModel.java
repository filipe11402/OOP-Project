package Models;
import java.util.ArrayList;

public class ExamModel {
    private int totalQuestions;
    private ArrayList<QuestionModel> questions;
    private ArrayList<StudentModel> students;

    public ExamModel(int totalQuestions, ArrayList<QuestionModel> questions, ArrayList<StudentModel> students) {
        this.totalQuestions = totalQuestions;
        this.questions = questions;
        this.students = students;
    }

    public ExamModel() {}

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public ArrayList<QuestionModel> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<QuestionModel> questions) {
        this.questions = questions;
    }

    public ArrayList<StudentModel> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<StudentModel> students) {
        this.students = students;
    }

}
