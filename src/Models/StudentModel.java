package Models;
import java.util.HashMap;

public class StudentModel {
    private String studentName;
    private HashMap<Integer, String> answers;
    private double totalScore;

    /**
     *
     * @param studentName
     * @param answers
     * @param totalScore
     */
    public StudentModel(String studentName, HashMap<Integer, String> answers, double totalScore) {
        this.studentName = studentName;
        this.answers = answers;
        this.totalScore = totalScore;
    }

    public StudentModel(){}

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public HashMap<Integer, String> getAnswers() { return answers; }

    public void setAnswers(HashMap<Integer, String> answers) {
        this.answers = answers;
    }

    public double getTotalScore() {
        return totalScore;
    }

    /**
     *
     * @param valueToIncrease
     * This method will increase student score value based on the parameter that is given
     */
    public void increaseTotalScore(double valueToIncrease) { this.totalScore = this.totalScore + valueToIncrease; }

    public void setTotalScore(double totalScore) {
        this.totalScore = totalScore;
    }
}
