package ifpr.pgua.eic.number_trivia.models;

public class NumberTrivia {
    private int number;
    private String text;
    
    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }


    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}
