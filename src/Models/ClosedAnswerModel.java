package Models;
import Abstract.Answer;

public class ClosedAnswerModel implements Answer {
    private String indent;
    private float cotation;

    public ClosedAnswerModel(String indent, float cotation) {
        this.indent = indent;
        this.cotation = cotation;
    }

    public float getCotation() {
        return cotation;
    }

    public void setCotation(float cotation) {
        this.cotation = cotation;
    }

    public String getIndent() { return indent; }

    public void setIndent(String indent) { this.indent = indent; }

}