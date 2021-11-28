import Models.ExamModel;
import Parsers.FileParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Usar Spliters para validações do tipo pergunta
public class Main {
    public static void main(String[] args){
        try {
            var fileParser = new FileParser(new File("c://Users/Dimi/Desktop/JavaProjects/POO/src/Formulario.txt"));
            /*ExamModel examData = new ExamModel(
                fileParser.getTotalQuestions(),

            );*/


            var totalQuestions = fileParser.getTotalQuestions();
            //System.out.println(fileParser.getQuestionType());

           var testes = fileParser.getQuestions(Integer.parseInt(totalQuestions));
            testes.forEach((data) -> System.out.println(data.getQuestion()));
        } catch (FileNotFoundException e) {
            System.out.println("There is no file in that path");
        }

    }
}