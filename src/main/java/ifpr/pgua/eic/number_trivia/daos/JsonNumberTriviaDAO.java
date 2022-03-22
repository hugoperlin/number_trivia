package ifpr.pgua.eic.number_trivia.daos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

import ifpr.pgua.eic.number_trivia.models.NumberTrivia;

public class JsonNumberTriviaDAO implements INumberTriviaDAO{

    private static final String NUMBERS_URL = "http://numbersapi.com/";


    @Override
    public NumberTrivia getTrivia(int number) throws Exception {
        //TODO
        return null;
    }

    @Override
    public NumberTrivia getRandomTrivia() throws Exception {
        //TODO
        return null;
    }
    
}
