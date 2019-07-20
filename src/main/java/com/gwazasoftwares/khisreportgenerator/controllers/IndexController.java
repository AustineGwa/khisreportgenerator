package com.gwazasoftwares.khisreportgenerator.controllers;

import com.gwazasoftwares.khisreportgenerator.models.Record;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.springframework.stereotype.Component;

import javax.swing.*;


@Component
public class IndexController {

    @FXML
    Button btnNext;

    @FXML
    TextField txtcountyname;

    @FXML
    TextField txtfcilityname;

    @FXML
    TextField txtmflcode;


    public void onLoginButtonClicked() throws Exception {

        if (txtcountyname.getText().equals("") || txtfcilityname.equals("") || txtmflcode.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error");
            alert.setContentText("Sorry!, you have to fill all the boxes");

            alert.showAndWait();
        } else {
            String county = txtcountyname.getText();
            String facility = txtfcilityname.getText();
            String mflCode = txtmflcode.getText();

            Record record = new Record(county, facility, mflCode);
            System.out.println(record.toString());

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/fxml/firstSemesterChart.fxml"));
        Parent rootNode = fxmlLoader.load();

        Stage stage = new Stage();
        stage.setTitle("Reports Generator");
        stage.setScene(new Scene(rootNode));
        stage.setMaximized(true);
        stage.show();
        hideCurrentScreen();
    }
    }

    private void hideCurrentScreen() {

        // get a handle to the stage
        Stage stage = (Stage) btnNext.getScene().getWindow();
        // got your current stage ---kill it
        stage.close();
    }
}
