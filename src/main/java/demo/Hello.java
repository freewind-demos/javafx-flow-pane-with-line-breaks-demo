package demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Hello extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello");
        FlowPane root = new FlowPane() {{
            for (int i = 0; i < 20; i++) {
                getChildren().add(new Button("Hello" + i));
            }
        }};
        primaryStage.setScene(new Scene(root, 200, 350));
        primaryStage.show();
    }
}