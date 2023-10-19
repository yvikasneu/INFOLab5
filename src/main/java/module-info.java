module com.example.infolab5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.infolab5 to javafx.fxml;
    exports com.example.infolab5;
}