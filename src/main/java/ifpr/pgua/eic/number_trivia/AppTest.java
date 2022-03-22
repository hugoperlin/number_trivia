package ifpr.pgua.eic.number_trivia;

import ifpr.pgua.eic.number_trivia.daos.INumberTriviaDAO;
import ifpr.pgua.eic.number_trivia.daos.JsonNumberTriviaDAO;
import ifpr.pgua.eic.number_trivia.failures.Failure;
import ifpr.pgua.eic.number_trivia.models.NumberTrivia;
import ifpr.pgua.eic.number_trivia.repositories.ImplNumberTriviaRepository;

public class AppTest {
    

    public static void main(String[] args) throws Exception{


        INumberTriviaDAO triviaDao = new JsonNumberTriviaDAO();

        ImplNumberTriviaRepository repository = new ImplNumberTriviaRepository(triviaDao);

        NumberTrivia ret = repository.getTrivia(10);

        
        System.out.println(ret.getNumber());
        

    }
}
