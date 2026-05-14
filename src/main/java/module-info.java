module com.example.projecttest {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.projecttest to javafx.fxml;
    exports com.example.projecttest;
}