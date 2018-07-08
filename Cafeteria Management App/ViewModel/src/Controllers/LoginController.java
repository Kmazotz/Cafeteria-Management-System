package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

public class LoginController implements Initializable
{
    @FXML
    public Button minimizeButton;
    @FXML
    public Button closeButton;

    HashMap<String, String> users = new HashMap<>();
    @FXML
    private Label UidErrorLabel;

    @FXML
    private Label PwdErrorLabel;

    @FXML
    private TextField userTxtField;

    @FXML
    private PasswordField passwordTxtField;


    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        LoadImages();
        users.put("ADMIN", "1234");
        users.put("GUEST", "none");
    }

    @FXML
    public void MinimizeWindow(javafx.event.ActionEvent event)
    {
        var stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }


    @FXML
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

    @FXML
    private void LoadSesion(javafx.event.ActionEvent event) throws IOException
    {
        if (userTxtField.getText() != null && passwordTxtField != null)
        {

            if (users.containsKey(userTxtField.getText()))
            {
                if (users.get(userTxtField.getText()).equals(passwordTxtField.getText()))
                {
                    try
                    {
                        MainWindowController userName = new MainWindowController();
                        userName.user = userTxtField.getText();
                        System.out.println("Welcome :   " + userName.user);

                        Object window = FXMLLoader.load(getClass().getResource("/Views/Windows/MainWindow.fxml"));

                        Scene scene = new Scene((Parent) window, 960, 600);
                        Stage stage = new Stage(StageStyle.TRANSPARENT);
                        stage.setScene(scene);
                        stage.show();
                        ((Node) (event.getSource())).getScene().getWindow().hide();
                    }
                    catch (IOException e)
                    {
                        System.out.println("Ocurrio un error al iniciar sesion.");
                        System.out.println(userTxtField.getText());
                        System.out.println(passwordTxtField.getText());
                    }
                }
                else
                {
                    PwdErrorLabel.setText("Contraseña incorrecta");
                    UidErrorLabel.setText("");
                }

            }
            else
            {
                UidErrorLabel.setText("Usuario no valido.");
            }


        }
        else
        {
            UidErrorLabel.setText("Ingrese un usuario");
            if (passwordTxtField.getText() == null) { PwdErrorLabel.setText("Ingrese la contraseña");}
        }
    }

}
