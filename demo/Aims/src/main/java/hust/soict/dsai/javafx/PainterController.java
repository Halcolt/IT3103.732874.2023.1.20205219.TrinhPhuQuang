package hust.soict.dsai.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class PainterController {

    @FXML
    private VBox drawingAreaPane;
    
    @FXML
    private Pane drawingArea;

    @FXML
    // implement clear action when press 'clear' button
    void clearButtonPressed(ActionEvent event) {
    	drawingArea.getChildren().clear();
    }

    @FXML
    // implement draw action
    void drawingAreaMouseDragged(MouseEvent event) {
    	Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
    	drawingArea.getChildren().add(newCircle);
    }
}
