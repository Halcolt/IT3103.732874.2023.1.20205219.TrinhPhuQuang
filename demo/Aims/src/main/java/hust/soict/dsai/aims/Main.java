package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private static Stage primaryStage;
    private static Cart anOrder = new Cart();
    private static Store store = new Store();

    @Override
    public void start(Stage primaryStage) {
        Main.primaryStage = primaryStage; // Assign the primaryStage to the static field
        
        //init item in store
        DigitalVideoDisc disc1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc disc2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        store.addMedia(disc1);
        store.addMedia(disc2);
        System.out.println("Media added to the store.");

        loadScene("main.fxml");
    }

    public static void loadScene(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource(fxmlFile));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void BackToMain(){
        Stage currentStage = (Stage) primaryStage.getScene().getWindow();
        currentStage.close();

        Main.loadScene("main.fxml");
    }

    public static Stage getPrimaryStage() {
        return primaryStage;
    }
    public static Cart getAnOrder() {
        return anOrder;
    }

    public static Store getStore() {
        return store;
    }
    public static void main(String[] args) {
        launch(args);
    }
}

