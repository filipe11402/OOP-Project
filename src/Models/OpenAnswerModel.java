package Models;
import Abstract.Answer;

public class OpenAnswerModel implements Answer {

    private float cotation;

    public OpenAnswerModel(float cotation) {
        this.cotation = cotation;
    }

    public float getCotation() {
        return cotation;
    }

    public void setCotation(float cotation) {
        this.cotation = cotation;
    }

}
