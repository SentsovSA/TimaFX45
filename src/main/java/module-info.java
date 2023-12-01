module com.example.timafx45 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.timafx45 to javafx.fxml;
    exports com.example.timafx45;
}