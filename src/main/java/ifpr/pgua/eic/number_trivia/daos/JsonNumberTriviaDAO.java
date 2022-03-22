package ifpr.pgua.eic.number_trivia.daos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

import ifpr.pgua.eic.number_trivia.models.NumberTrivia;

public class JsonNumberTriviaDAO implements INumberTriviaDAO{

    private static final String NUMBERS_URL = "http://numbersapi.com/";


    private String get(String pUrl) throws Exception{
        URL url = new URL(pUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP Error code : "
                        + conn.getResponseCode());
        }
        InputStreamReader in = new InputStreamReader(conn.getInputStream());
        BufferedReader br = new BufferedReader(in);

        String output = "";
        String linha;
        while ((linha = br.readLine()) != null) {
            output += linha;
        }
        
        
        conn.disconnect();

        return output;

    }


    @Override
    public NumberTrivia getTrivia(int number) throws Exception {
        
        String url = NUMBERS_URL+number+"?json";
        
        Gson gson = new Gson();
        return gson.fromJson(get(url), NumberTrivia.class);
    }

    @Override
    public NumberTrivia getRandomTrivia() throws Exception {
        String url = NUMBERS_URL+"random/trivia?json";
        
        Gson gson = new Gson();
        return gson.fromJson(get(url), NumberTrivia.class);
    }
    
}
