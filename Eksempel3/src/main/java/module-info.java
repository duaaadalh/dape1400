module com.example.eksempel3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eksempel3 to javafx.fxml;
    exports com.example.eksempel3;
}