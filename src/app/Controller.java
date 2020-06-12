package app;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.*;
import java.util.*;


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
    public void initialize() {

    }

    @FXML
    public LinkedHashMap<String, Integer> mapWords() {
        final LinkedHashMap<String, Integer> result = new LinkedHashMap<>();

        return result;
    }

    @FXML
    public void calc() {

    }

    @FXML
    public void save() {

    }
}
