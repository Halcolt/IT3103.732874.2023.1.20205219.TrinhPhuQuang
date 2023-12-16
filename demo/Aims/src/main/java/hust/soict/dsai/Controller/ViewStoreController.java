package hust.soict.dsai.Controller;

import hust.soict.dsai.aims.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class ViewStoreController {

    @FXML
    private void MediaDetails() {
        showAlert("Media Details", "Implement the logic to see media details");
    }

    @FXML
    private void AddToCart() {
        showAlert("Update Store", "Implement the logic to add media to cart");
    }

    @FXML
    private void DeleteFromCart() {
        showAlert("See Current Cart", "Implement the logic to play a media");
    }

    @FXML
    private void Back() {
        Main.BackToMain();
    }


    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
