package hust.soict.dsai.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class MainController {

    @FXML
    private void viewStore() {
        // Implement the logic to view the store
        showAlert("View Store", "Implement the logic to view the store");
    }

    @FXML
    private void updateStore() {
        // Implement the logic to update the store
        showAlert("Update Store", "Implement the logic to update the store");
    }

    @FXML
    private void seeCurrentCart() {
        // Implement the logic to see the current cart
        showAlert("See Current Cart", "Implement the logic to see the current cart");
    }

    @FXML
    private void exit() {
        System.exit(0);
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
