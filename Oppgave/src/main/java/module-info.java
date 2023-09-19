module com.example.oppgave {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oppgave to javafx.fxml;
    exports com.example.oppgave;
}