module com.example.eksempel2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eksempel2 to javafx.fxml;
    exports com.example.eksempel2;
}