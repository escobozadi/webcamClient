module com.example.webcamclient {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.webcamclient to javafx.fxml;
    exports com.example.webcamclient;
}