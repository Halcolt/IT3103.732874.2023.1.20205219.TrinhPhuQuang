package hust.soict.dsai.Controller;

import hust.soict.dsai.aims.Main;
import hust.soict.dsai.aims.store.Store;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class UpdateStoreController {

    private Store store = Main.getStore();

    @FXML
    private Text updateStoreText;

    @FXML
    private ListView<String> listView;

    @FXML
    private ComboBox<String> categoryComboBox;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField priceTextField;

    @FXML
    private void initialize() {
        // You can perform initialization here if needed
        updateListView();
        categoryComboBox.getItems().addAll("DVD", "Book", "CD");
        store.displayItemsInStore();
    }

    private void updateListView() {
        listView.getItems().clear();
        store.getItemsInStore().forEach(media -> listView.getItems().add(media.toString()));
    }

    @FXML
    private void deleteAction() {
        // Implement the logic for delete button
    }

    @FXML
    private void addToStoreAction() {
        // Implement the logic for add to store button
    }

    @FXML
    private void backAction() {
        Main.BackToMain();
    }
}
