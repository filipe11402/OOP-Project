package Exceptions;

/**
 *
 * Custom exception for exame files not beeing found
 */
public class ExamNotFoundException extends Exception{
    public ExamNotFoundException(){}

    /**
     *
     * @param message
     */
    public ExamNotFoundException(String message){ super(message); }
}
