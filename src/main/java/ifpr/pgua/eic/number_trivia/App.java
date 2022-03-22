package ifpr.pgua.eic.number_trivia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import ifpr.pgua.eic.number_trivia.controls.PrimaryController;
import ifpr.pgua.eic.number_trivia.daos.INumberTriviaDAO;
import ifpr.pgua.eic.number_trivia.daos.JsonNumberTriviaDAO;
import ifpr.pgua.eic.number_trivia.repositories.ImplNumberTriviaRepository;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {

        INumberTriviaDAO dao = new JsonNumberTriviaDAO();
        ImplNumberTriviaRepository repository = new ImplNumberTriviaRepository(dao);

        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        fxmlLoader.setControllerFactory(aClass -> new PrimaryController(repository));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}