import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class App extends Application
{

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException
    {

        Object root = FXMLLoader.load(getClass().getResource("Views/Windows/Login.fxml"));

        Scene scene = new Scene((Parent) root, 350, 600);
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);

        stage.show();

    }
}
