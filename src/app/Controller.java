package app;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.HashMap;
import java.util.LinkedHashMap;

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
        outputLbl.setWrapText(true);
    }

    @FXML
    public LinkedHashMap<String, Integer> mapWords() {
        final LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        String input = inputField.getText();

        for (String word : input.split(" ")) {
            if (!result.containsKey(word)) { // Create new entry
                result.put(word, 1);
            } else { // Increment value of existing key
                result.put(word, result.get(word) + 1);
            }
        }
        return result;
    }

    @FXML
    public void calc() {
        outputLbl.setText(mapWords().toString());
    }

    @FXML
    public void save() {

    }
}