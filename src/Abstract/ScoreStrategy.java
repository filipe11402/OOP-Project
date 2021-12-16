package Abstract;
import Models.ScoreBoardModel;

public interface ScoreStrategy {
    /**
     *
     * The calculateScores method will calculate the score for each student
     */
    ScoreBoardModel calculateScores();
}
