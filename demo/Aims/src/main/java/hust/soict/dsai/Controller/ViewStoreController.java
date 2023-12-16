package hust.soict.dsai.Controller;

import hust.soict.dsai.aims.Main;

import hust.soict.dsai.aims.store.Store;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class ViewStoreController {

    private Store store = Main.getStore();

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
    private ListView<String> StorelistView;

    @FXML
    private ListView<String> CartlistView;

    @FXML
    private void Back() {
        Main.BackToMain();
    }

    @FXML
    private void initialize() {
        // You can perform initialization here if needed
        updateListView();
        store.displayItemsInStore();
    }

    private void updateListView() {
        StorelistView.getItems().clear();
        store.getItemsInStore().forEach(media -> StorelistView.getItems().add(media.toString()));
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
