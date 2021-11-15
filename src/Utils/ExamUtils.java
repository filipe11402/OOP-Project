package Utils;
import java.io.File;

public class ExamUtils {
    public static boolean FileExists(String filePath) {
        File tempFile = new File(filePath);
        return tempFile.exists();
    }

}
