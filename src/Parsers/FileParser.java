package Parsers;
import Abstract.Answer;
import Models.ClosedAnswerModel;
import Models.OpenAnswerModel;
import Models.QuestionModel;
import Models.StudentModel;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
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

    public String getTotalQuestions(){
        return this.fileScanner.nextLine();
    }

    private String getQuestionString(){
        return fileScanner.nextLine();
    }

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
                        closedAnswer[i] = new ClosedAnswerModel(Float.parseFloat(closedAnswerStrings[i].split(" ")[2]));
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

    public StudentModel[] getStudents(){ return null; }

   // public QuestionModel[] getQuestions(){

    //}

  /*  private String ReadFile(int startLine, int endLine){

    }

     QuestionModel GetQuestion(){
        if(ExamUtils.FileExists("path")){
            return null;
        }


    }
      try {
        File myObj = new File("filename.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }*/
}