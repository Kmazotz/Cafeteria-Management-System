package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable
{

    @FXML
    public Button minimizeButton;
    public Button maximizeButton;
    public Button closeButton;
    public Button homeButton;
    public Button UserProperty;
    String user;
    @FXML
    private Label SessionName;

    @FXML
    public void initialize(URL location, ResourceBundle resources)
    {
        Loadimages();
        SessionName.setText(user);
    }

    public void MinimizeWindow(javafx.event.ActionEvent event)
    {
        var stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    private void MaximizeWindow(ActionEvent e)
    {
        var stage = (Stage) maximizeButton.getScene().getWindow();
        stage.setMaximized(true);
    }

    @FXML
    public void CloseWindow(javafx.event.ActionEvent event)
    {
        var stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void Loadimages()
    {
        URL close = getClass().getResource("/Resources/close.png");
        Image closeImg = new Image(close.toString(), 24, 24, false, true);
        closeButton.setGraphic(new ImageView(closeImg));

        URL open = getClass().getResource("/Resources/Maxi.png");
        Image MaximizeImg = new Image(open.toString(), 24, 24, false, true);
        maximizeButton.setGraphic(new ImageView(MaximizeImg));

        URL minimize = getClass().getResource("/Resources/Min.png");
        Image MinimizeImg = new Image(minimize.toString(), 24, 24, false, true);
        minimizeButton.setGraphic(new ImageView(MinimizeImg));

        URL home = getClass().getResource("/Resources/Home.png");
        Image HomeImg = new Image(home.toString(), 24, 24, false, true);
        homeButton.setGraphic(new ImageView(HomeImg));

        URL chevron = getClass().getResource("/Resources/Chevron-Down.png");
        Image DownImg = new Image(chevron.toString(), 24, 24, false, true);
        UserProperty.setGraphic(new ImageView(DownImg));

    }
}
