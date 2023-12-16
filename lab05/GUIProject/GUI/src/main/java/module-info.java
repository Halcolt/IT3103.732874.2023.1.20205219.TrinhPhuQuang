module hust.soict.dsai {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;


    opens hust.soict.dsai.javafx to javafx.fxml;
    exports hust.soict.dsai.javafx;
}