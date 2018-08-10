package demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class Hello extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello");
        FlowPane root = new FlowPane() {{
            for (int i = 0; i < 5; i++) {
                getChildren().add(new Button("Hello" + i));
                if (i == 2) {
                    this.getChildren().add(lineBreak());
                }
            }
        }};
        primaryStage.setScene(new Scene(root, 400, 200));
        primaryStage.show();
    }

    private Region lineBreak() {
        return new Region() {{
            setPrefSize(Double.MAX_VALUE, 0.0);
        }};
    }
}