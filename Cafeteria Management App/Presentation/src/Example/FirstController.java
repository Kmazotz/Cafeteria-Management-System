package Example;/*
 * (C) Packt Publishing Ltd, 2017-2018
 */

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author sgrinev
 */
public class FirstController implements Initializable
{

    @FXML
    private Button button;

    @FXML
    private TextField text;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
    }

}
