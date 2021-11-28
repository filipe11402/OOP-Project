package Models;

import Abstract.Answer;

public class ExamModel {
    private int totalQuestions;
    private QuestionModel[] questions;
    private int totalAnswers;
    private Answer[] answers;

    public ExamModel(int totalQuestions, QuestionModel[] questions, int totalAnswers, Answer[] answers) {
        this.totalQuestions = totalQuestions;
        this.questions = questions;
        this.totalAnswers = totalAnswers;
        this.answers = answers;
    }

    public ExamModel(){}

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public QuestionModel[] getQuestions() {
        return questions;
    }

    public void setQuestions(QuestionModel[] questions) {
        this.questions = questions;
    }

    public int getTotalAnswers() {
        return totalAnswers;
    }

    public void setTotalAnswers(int totalAnswers) {
        this.totalAnswers = totalAnswers;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }
}
