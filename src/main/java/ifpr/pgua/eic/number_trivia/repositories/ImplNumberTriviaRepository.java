package ifpr.pgua.eic.number_trivia.repositories;

import ifpr.pgua.eic.number_trivia.daos.INumberTriviaDAO;
import ifpr.pgua.eic.number_trivia.failures.Failure;
import ifpr.pgua.eic.number_trivia.models.NumberTrivia;


public class ImplNumberTriviaRepository implements INumberTriviaRepository{
    
    private INumberTriviaDAO triviaDAO;

    public ImplNumberTriviaRepository(INumberTriviaDAO triviaDAO){
        this.triviaDAO = triviaDAO;
    }

    public NumberTrivia getTrivia(int number){

        if(number < 0){
            throw new Failure("Invalid number!");
        }

        try{
            NumberTrivia trivia = triviaDAO.getTrivia(number);
            return trivia;
        }catch(Exception e){
            throw new Failure(e.getMessage());
        }
    } 

    public NumberTrivia getRandomTrivia(){
        throw new Failure("TODO");
    }

    

}
