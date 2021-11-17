package Abstract;

import Models.QuestionModel;

import java.util.HashMap;

public interface ScoreStrategy {
    double calculateScore(HashMap<Integer, String>[] answers, QuestionModel questions);
}
