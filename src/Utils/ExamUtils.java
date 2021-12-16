package Utils;
import java.io.File;

public class ExamUtils {
    /**
     *
     * @param filePath
     * @return boolean
     * This method checks if the exam file exists.
     */
    public static boolean FileExists(String filePath) {
        File tempFile = new File(filePath);
        return tempFile.exists();
    }

}
