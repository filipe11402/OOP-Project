import Models.ExamModel;
import Models.ScoreBoardModel;
import Models.StudentModel;
import Parsers.FileParser;
import Strategies.ExamScoreStrategy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        var fileParser = new FileParser(new File("C://Users/filip/Desktop/OOP-Project/src/Formulario.txt"));

        int totalQuestions = fileParser.getTotal();

        ExamModel exam = new ExamModel(totalQuestions,
                                       fileParser.getQuestions(totalQuestions),
                                       fileParser.getStudents(fileParser.getTotal(), totalQuestions)
        );

        ExamScoreStrategy exam2 = new ExamScoreStrategy(exam);

        ScoreBoardModel studentScoreBoard = exam2.getScores();

        studentScoreBoard.sortScores();

        for (StudentModel student: exam.getStudents()) {
            System.out.println(student.getStudentName() + " " + student.getTotalScore());
        }
        //studentScoreBoard.showStudents();
    }
}