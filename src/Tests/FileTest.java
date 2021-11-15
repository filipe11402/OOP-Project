package Tests;
import static org.junit.Assert.*;

import Utils.ExamUtils;
import org.junit.Test;

public class FileTest {
    @Test
    public void testFileExist(){
        assertEquals(ExamUtils.FileExists("c://Users/Dimi/Desktop/teste.txt"),true);
    }
}
