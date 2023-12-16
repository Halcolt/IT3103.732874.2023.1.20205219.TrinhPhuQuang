package hust.soict.dsai.Controller;

import hust.soict.dsai.aims.Main;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;


public class MainController {

    @FXML
    private void viewStore() {
            Main.loadScene("ViewStore.fxml");
    }

    @FXML
    private void updateStore() {

        Main.loadScene("UpdateStore.fxml");
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
