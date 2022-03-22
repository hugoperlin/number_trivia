package ifpr.pgua.eic.number_trivia.controls;

import ifpr.pgua.eic.number_trivia.failures.Failure;
import ifpr.pgua.eic.number_trivia.models.NumberTrivia;
import ifpr.pgua.eic.number_trivia.repositories.INumberTriviaRepository;
import ifpr.pgua.eic.number_trivia.repositories.ImplNumberTriviaRepository;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Label txtTrivia;

    @FXML
    private TextField tfNumber;

    @FXML
    private Label lbError;


    private INumberTriviaRepository repository;

    public PrimaryController(INumberTriviaRepository repository){
        this.repository = repository;
    }

    @FXML
    private void getTrivia(){

        hideError();

        String sNumber = tfNumber.getText();
        String error="";
        try{
            int number = Integer.valueOf(sNumber);

            NumberTrivia ret = repository.getTrivia(number);

            txtTrivia.setText(ret.getText());
            return;
            
        }catch(NumberFormatException e){
            error = "Invalid number!";
        }catch(Failure e){
            error = e.getMessage();
        }
        
        showError(error);

    }

    @FXML
    private void getRandTrivia(){

    }
    
    private void hideError(){
        lbError.setVisible(false);
    }

    private void showError(String message){
        lbError.setText(message);
        lbError.setVisible(true);
    }


}
