module com.example.aims {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens hust.soict.dsai.Controller to javafx.fxml;
    exports hust.soict.dsai.aims;
}