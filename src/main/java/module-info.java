module com.example.laba6barabashclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.laba6barabashclient to javafx.fxml;
    exports com.example.laba6barabashclient;
}