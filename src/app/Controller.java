package app;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.HashMap;

public class Controller {
    @FXML
    TextArea inputField;
    @FXML
    Label outputLbl;
    @FXML
    Button calcBtn;
    @FXML
    Button saveBtn;

    @FXML
    public HashMap<String,Integer> mapWords () {
        return new HashMap<String,Integer>();
    }

    @FXML
    public void calc() {

    }

    @FXML
    public void save() {

    }
}
