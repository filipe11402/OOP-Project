package Parsers;
import Abstract.Answer;
import Models.ClosedAnswerModel;
import Models.OpenAnswerModel;
import Models.QuestionModel;
import Models.StudentModel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class FileParser {
    private Scanner fileScanner;

    public FileParser(File file) throws FileNotFoundException{
        try {
            this.fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("There is no file in that path");
        }
    }

    public int getTotal(){ return Integer.parseInt(this.fileScanner.nextLine()); }

    private String getQuestionString(){ return fileScanner.nextLine(); }

    public ArrayList<QuestionModel> getQuestions(int totalQuestions){
        ArrayList<QuestionModel> questions = new ArrayList<QuestionModel>();

        int questionCounter = 0;

        while (questionCounter < totalQuestions){
            var questionString = this.getQuestionString();
            String questiontype = questionString.substring(2,3);

            switch (questiontype){
                case "A":
                    QuestionModel returnData = new QuestionModel();
                    returnData.setOpen(true);
                    returnData.setQuestionNumber(Integer.parseInt(questionString.substring(0,1)));

                    returnData.setQuestion(String.join(" ", Arrays.copyOfRange(questionString.split(" "), 2, questionString.split(" ").length)));

                    var answerStrings = this.getAnswers(true);
                    Answer[] answer =  {new OpenAnswerModel(Float.parseFloat(answerStrings[0]))};
                    returnData.setAnswers(answer);

                    questions.add(returnData);
                    questionCounter++;
                    break;
                    
                case "F":
                    Answer[] closedAnswer = new Answer[4];
                    returnData = new QuestionModel();
                    returnData.setOpen(false);
                    returnData.setQuestionNumber(Integer.parseInt(questionString.substring(0,1)));
                    returnData.setQuestion(String.join(" ", Arrays.copyOfRange(questionString.split(" "), 2, questionString.split(" ").length)));

                    var closedAnswerStrings = this.getAnswers(false);
                    for (int i = 0; i < 4; i++){
                        closedAnswer[i] = new ClosedAnswerModel(closedAnswerStrings[i].split(" ")[0], Float.parseFloat(closedAnswerStrings[i].split(" ")[2]));
                    }

                    returnData.setAnswers(closedAnswer);

                    questions.add(returnData);

                    questionCounter++;
                    break;    
            }
        }

        return questions;
    }

    private String[] getAnswers(boolean isOpen){
        String[] answers = isOpen ? new String[1] : new String[4];

        if (isOpen){
            answers[0] = this.fileScanner.nextLine();

            return answers;
        }

        for (int i = 0;i < 4;i++){
            answers[i] = fileScanner.nextLine();
        }

        return answers;
    }

    public ArrayList<StudentModel> getStudents(int totalStudents, int totalQuestions){
        ArrayList<StudentModel> students = new ArrayList<StudentModel>();

        int studentsCounter = 0;

        while (studentsCounter < totalStudents){
            HashMap<Integer, String> answersList = new HashMap<Integer, String>();
            StudentModel student = new StudentModel();
            var studentName = fileScanner.nextLine();
            student.setStudentName(studentName);

            for (int i = 0; i < totalQuestions; i++){
                String answers = fileScanner.nextLine();
                String[] splittedFileAnswers = answers.split(" ");
                answersList.put(Integer.parseInt(splittedFileAnswers[0]), splittedFileAnswers[1]);
            }

            student.setAnswers(answersList);
            students.add(student);
            studentsCounter += 1;
        }

        return students;
    }
}