package Models;
import Abstract.Answer;

public class ClosedAnswerModel implements Answer {

    private float cotation;

    public ClosedAnswerModel(float cotation) {
        this.cotation = cotation;
    }

    public float getCotation() {
        return cotation;
    }

    public void setCotation(float cotation) {
        this.cotation = cotation;
    }

}