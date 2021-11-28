package Models;

public class ScoreBoardModel {

    private StudentModel[] students;

    public ScoreBoardModel(StudentModel[] students) {
        this.students = students;
    }

    public StudentModel[] getStudents() {
        return students;
    }

    public void setStudents(StudentModel[] students) {
        this.students = students;
    }

}
