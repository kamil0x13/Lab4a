package pl.lublin.wsei.java.cwiczenia;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("gusInfoGraphic.fxml"));
        Parent root =loader.load();
        Controller controller = loader.getController();
        controller.setHostServices(this.getHostServices());
        controller.setStage(primaryStage);

        primaryStage.setTitle("gusInfoGraphic");
        primaryStage.setScene(new Scene(root, 800, 700));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}