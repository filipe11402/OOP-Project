package Tests;
import Models.QuestionModel;
import Parsers.FileParser;
import org.junit.Test;
import java.io.File;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
public class FileParserTests {

    @Test
    public void testGetTotal() {
        FileParser parser = new FileParser(new File("c://Users/Dimi/Desktop/JavaProjects/POO/src/Formulario.txt"));
        assertEquals(String.valueOf(parser.getTotal()),"4");
    }

    @Test
    public void testGetQuestions() {
        FileParser parser = new FileParser(new File("c://Users/Dimi/Desktop/JavaProjects/POO/src/Formulario.txt"));

        var totalQuestions = parser.getTotal();

        var questions = parser.getQuestions(totalQuestions);

        assertEquals(String.valueOf(questions.size()), String.valueOf(totalQuestions));
    }

    @Test
    public void testGetStudents() {
        FileParser parser = new FileParser(new File("c://Users/Dimi/Desktop/JavaProjects/POO/src/Formulario.txt"));

        int totalQuestions = parser.getTotal();
        ArrayList<QuestionModel> questions = parser.getQuestions(totalQuestions);
        int totalStudents = parser.getTotal();

        var students = parser.getStudents(totalStudents,totalQuestions);

        assertEquals(String.valueOf(students.size()), String.valueOf(totalStudents));
    }
}
