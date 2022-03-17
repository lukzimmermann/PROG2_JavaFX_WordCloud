package ch.zhaw.prog2.application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainWindowController {

    @FXML
    private Button btnAddText;

    @FXML
    private Button btnDeleteText;

    @FXML
    private Label lblTitel;

    @FXML
    private TextField tbTextInput;

    @FXML
    private TextArea tfHistory;

    @FXML
    void addText(ActionEvent event) {
        if(tfHistory.getText().equals("")){
            tfHistory.setText(tbTextInput.getText());
        } else {
            tfHistory.setText(tfHistory.getText()+"\n"+tbTextInput.getText());
        }
        tbTextInput.clear();
        tbTextInput.requestFocus();
    }

    @FXML
    void deleteText(ActionEvent event) {
        tfHistory.clear();
    }

    @FXML
    void pressOnKey(ActionEvent event){
        var x = tbTextInput.getOnKeyPressed();
        System.out.println("hallo");
    }

    public void connectProperties(){
        tbTextInput.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                lblTitel.setText(newValue + oldValue);
            }
        });
    }
}
