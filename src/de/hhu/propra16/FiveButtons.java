package de.hhu.propra16;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtons extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane root = FXMLLoader.load(getClass().getResource("/five_buttons" +
                ".fxml"));
        Button button3 = new Button("button3");
        button3.setOnAction(event -> {
            ((Button)(event.getSource())).getScene().getWindow().hide();
        });
        root.add(button3, 1, 2);
        primaryStage.setTitle("Five Buttons");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }
}
