module duaa.oslomet {
    requires javafx.controls;
    requires javafx.fxml;


    opens duaa.oslomet to javafx.fxml;
    exports duaa.oslomet;
}