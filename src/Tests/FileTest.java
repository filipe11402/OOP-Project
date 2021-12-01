package Tests;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import Parsers.FileParser;
import Utils.ExamUtils;
import org.junit.Rule;
import org.junit.Test;
import java.io.File;
import java.io.IOException;

public class FileTest {

    @Test
    public void testFileExist() {
        assertEquals(ExamUtils.FileExists("c://Users/Dimi/Desktop/JavaProjects/POO/src/Formulario.txt"), true);
    }

    @Test
    public void testGetTotal(){
            File file = new File("c://Users/Dimi/Desktop/JavaProjects/POO/src/Formulario.txt");
            FileParser fileParser = new FileParser(file);
            var total = fileParser.getTotal();
            assertEquals(String.valueOf(total), "4");

    }

    @Test
    public void tests(){
    }
}
