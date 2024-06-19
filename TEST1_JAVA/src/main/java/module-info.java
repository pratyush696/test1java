module com.example.test1_java {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.test1_java to javafx.fxml;
    exports com.example.test1_java;
}