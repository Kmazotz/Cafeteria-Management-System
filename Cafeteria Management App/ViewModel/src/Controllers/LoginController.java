package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable
{

    @FXML
    public Button minimizeButton;
    public Button closeButton;

    @FXML
    private Label ErrorDataText;
    @FXML
    private Label DataText;

    @FXML
    private TextField user;
    @FXML
    private PasswordField password;



    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        LoadImages();
    }

    public void MinimizeWindow(javafx.event.ActionEvent event)
    {
        var stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }

    public void closeWindow(javafx.event.ActionEvent event)
    {
        var stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    private void LoadImages()
    {
        URL close = getClass().getResource("/Resources/close.png");
        Image closeImg = new Image(close.toString(), 24, 24, false, true);
        closeButton.setGraphic(new ImageView(closeImg));

        URL minimize = getClass().getResource("/Resources/Min.png");
        Image MinimizeImg = new Image(minimize.toString(), 24, 24, false, true);
        minimizeButton.setGraphic(new ImageView(MinimizeImg));
    }

    private void LoadSesion(javafx.event.ActionEvent event)
    {

        if (user.getText().equals("ADMIN") && password.getText().equals("123456"))
        {

        }

        else if (user.getText().equals("") && password.getText().equals(""))
        {
            DataText.setText("Ingrese una dirección de correo electrónico o un nombre de usuario valido.");
        }

        else
        {
            ErrorDataText.setText("Su usuario o contraseña son invalidos o no existen.");
        }
    }
}