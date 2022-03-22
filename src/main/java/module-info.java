module ifpr.pgua.eic.number_trivia {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    opens ifpr.pgua.eic.number_trivia.models to com.google.gson;
    opens ifpr.pgua.eic.number_trivia.controls to javafx.fxml;
    exports ifpr.pgua.eic.number_trivia;
}
