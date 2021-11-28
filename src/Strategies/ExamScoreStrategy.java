package Strategies;
import Abstract.ScoreStrategy;
import Models.ExamModel;
import Models.ScoreBoardModel;

public class ExamScoreStrategy implements ScoreStrategy {
    private ExamModel exam;

    public ExamScoreStrategy(ExamModel exam){
        this.exam = exam;
    }

    public ScoreBoardModel getScores(){
        //To validate the question answer
        //we need to compare the question answer that is the right one, by looking at its quotation with the answer that the student gave to that answer
        //after that we just make calculations
        //if it´s an open question we just check if the student answer it's not -, if it isnt just add 1
        //to be implemented
        return null;
    }
}
