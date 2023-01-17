module com.example.netologyhomework122 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.netologyhomework122 to javafx.fxml;
    exports com.example.netologyhomework122;
}