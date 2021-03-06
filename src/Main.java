import Exceptions.ExamNotFoundException;
import Models.ExamModel;
import Models.ScoreBoardModel;
import Parsers.FileParser;
import Strategies.ExamScoreStrategy;
import Utils.ExamUtils;
import java.io.File;
import java.nio.file.FileSystems;

public class Main {
    public static void main(String[] args){
        try {
            boolean fileExists = ExamUtils.FileExists(FileSystems.getDefault().getPath("src").toAbsolutePath() + "\\Formulario.txt");

            if(!fileExists){ throw new ExamNotFoundException("Exam doesnt exist"); }

            var fileParser = new FileParser(new File(FileSystems.getDefault().getPath("src").toAbsolutePath() + "\\Formulario.txt"));

            int totalQuestions = fileParser.getTotal();

            ExamModel exam = new ExamModel(totalQuestions,
                    fileParser.getQuestions(totalQuestions),
                    fileParser.getStudents(fileParser.getTotal(), totalQuestions)
            );

            ExamScoreStrategy examScore = new ExamScoreStrategy(exam);

            ScoreBoardModel studentScoreBoard = examScore.calculateScores();

            studentScoreBoard.sortScores();

            studentScoreBoard.showStudents(exam);
        }
        catch(ExamNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
