package com.vodvlad.testjfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ControllerComplete {

    @FXML
    private Button completebtn;

    @FXML
    private Text error_text;


    public void handleBtn() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        Stage window = (Stage) completebtn.getScene().getWindow();
        window.setScene(new Scene(root,700,400));
    }

}
