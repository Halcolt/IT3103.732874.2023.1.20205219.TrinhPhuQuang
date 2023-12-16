module hust.soict.dsai {
    requires javafx.controls;
    //requires javafx.swing;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;
    requires javafx.swing;


    opens hust.soict.dsai.javafx to javafx.fxml;
    exports hust.soict.dsai.javafx;
    exports hust.soict.dsai.aims;
}