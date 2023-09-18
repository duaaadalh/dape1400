module com.example.eksempel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eksempel to javafx.fxml;
    exports com.example.eksempel;
}