package ifpr.pgua.eic.number_trivia.repositories;

import ifpr.pgua.eic.number_trivia.failures.Failure;
import ifpr.pgua.eic.number_trivia.models.NumberTrivia;

public interface INumberTriviaRepository {
    
    NumberTrivia getTrivia(int number);
    NumberTrivia getRandomTrivia();
}
