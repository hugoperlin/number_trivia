package ifpr.pgua.eic.number_trivia.daos;

import ifpr.pgua.eic.number_trivia.models.NumberTrivia;

public interface INumberTriviaDAO{

    NumberTrivia getTrivia(int number) throws Exception;
    NumberTrivia getRandomTrivia() throws Exception;

}