package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.*;
import java.awt.*;

public class Main extends Application {

    public void start(Stage primaryStage) throws Exception{
        BorderPane layout;
        Scene scene;

        layout = new BorderPane();
        scene = new Scene(layout,450,250);
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Canvas");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.centerOnScreen();
    }

    public static void main(String[] args) {launch(args);}
}
