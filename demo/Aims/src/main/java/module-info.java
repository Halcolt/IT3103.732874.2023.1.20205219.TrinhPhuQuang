module com.example.aims {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens hust.soict.dsai.Controller to javafx.fxml;
    exports hust.soict.dsai.aims;
}