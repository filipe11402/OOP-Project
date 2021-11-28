package Models;
import Abstract.Answer;

public class QuestionModel {
    private String question;
    private Answer[] answers;
    private boolean isOpen;
    private int questionNumber;


    public QuestionModel(String question, Answer[] answers, boolean isOpen, int questionNumber) {
        this.question = question;
        this.answers = answers;
        this.isOpen = isOpen;
        this.questionNumber = questionNumber;
    }

    public QuestionModel(){}

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }



}
