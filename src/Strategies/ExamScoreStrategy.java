package Strategies;
import Abstract.Answer;
import Abstract.ScoreStrategy;
import Models.*;
import java.util.ArrayList;
import java.util.*;

public class ExamScoreStrategy implements ScoreStrategy {
    private ExamModel exam;

    /**
     *
     * @param exam
     */
    public ExamScoreStrategy(ExamModel exam){
        this.exam = exam;
    }

    /**
     *
     * @return ScoreBoardModel
     * This method will return us a ScoreBoardModel with the calculated scores of all the students.
     */
    public ScoreBoardModel calculateScores(){
        ArrayList<QuestionModel> questions = this.exam.getQuestions();
        List<String> rightClosedAnswers = new ArrayList<String>();
        List<Float> rightOpenAnswers = new ArrayList<Float>();

        int rightAnswersCounter = 0;
        int rightClosedAnswerCounter = 0;

          questions.forEach((question) -> {
             for (Answer answer: question.getAnswers()) {
                 if (answer instanceof ClosedAnswerModel) {
                     ClosedAnswerModel closedAnswer = (ClosedAnswerModel) answer;
                     if(closedAnswer.getQuotation() == 1.0){
                         rightClosedAnswers.add(closedAnswer.getIndent());
                     }
                 }
                 if(answer instanceof OpenAnswerModel){
                     OpenAnswerModel openAnswer = (OpenAnswerModel) answer;
                     rightOpenAnswers.add(openAnswer.getQuotation());
                 }
             }});

            for (QuestionModel question: this.exam.getQuestions()) {
                for (StudentModel student: this.exam.getStudents()) {
                    rightClosedAnswerCounter = 0;
                    rightAnswersCounter = 0;

                    if(question.isOpen()){
                        Float answer = student.getAnswers().get(question.getQuestionNumber()).equals("-") ? 0 : Float.parseFloat(student.getAnswers().get(question.getQuestionNumber()));
                        student.increaseTotalScore(answer);

                        rightAnswersCounter++;
                    }

                    if(!question.isOpen()){
                        String answer = student.getAnswers().get(question.getQuestionNumber());

                        Boolean exists = answer.equals(rightClosedAnswers.get(rightClosedAnswerCounter));

                        student.increaseTotalScore(answer.equals("-") ? 0 : exists ? 1 : -0.25);

                        rightClosedAnswerCounter++;
                    }
                }
            }

        return new ScoreBoardModel(this.exam.getStudents());
    }
}
