package Example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class AppExample extends Application
{

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException
    {
        HBox root = (HBox) FXMLLoader.load(getClass().getResource("FirstDocument.fxml"));
        Scene scene = new Scene(root, 300, 80);
        stage.setScene(scene);
        stage.show();
    }
}
