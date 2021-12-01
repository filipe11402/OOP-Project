package Models;
import Abstract.Answer;

public class ClosedAnswerModel extends Answer {
    private String indent;

    public ClosedAnswerModel(String indent, float quotation){
        super(quotation);
        this.indent = indent;
    }

    public String getIndent() { return indent; }

    public void setIndent(String indent) { this.indent = indent; }

}