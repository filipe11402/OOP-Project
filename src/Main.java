import Models.ExamModel;
import Parsers.FileParser;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args){
        try {
            var fileParser = new FileParser(new File("c://Users/Dimi/Desktop/JavaProjects/POO/src/Formulario.txt"));

            int totalQuestions = fileParser.getTotal();

            ExamModel exam = new ExamModel(totalQuestions,
                                           fileParser.getQuestions(totalQuestions),
                                           fileParser.getStudents(fileParser.getTotal(), totalQuestions)
            );

            System.out.println("asdasd");
        } catch (FileNotFoundException e) {
            System.out.println("There is no file in that path");
        }
    }
}