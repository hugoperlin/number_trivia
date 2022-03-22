package ifpr.pgua.eic.number_trivia.failures;

public class Failure extends RuntimeException{
    
    private String message;

    public Failure(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

}
