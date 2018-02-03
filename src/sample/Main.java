package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Konwerter temperatur");
        primaryStage.setScene(new Scene(root, 600, 375));
        primaryStage.setX(0);
        primaryStage.setY(0);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
