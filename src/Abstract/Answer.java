package Abstract;

public abstract class Answer {
    public float quotation;

    public Answer(float quotation) {
        this.quotation = quotation;
    }

    public Answer() {}

    public float getQuotation() {
        return quotation;
    }

    public void setQuotation(float quotation) {
        this.quotation = quotation;
    }
}
