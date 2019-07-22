package com.gwazasoftwares.khisreportgenerator.controllers;

import com.gwazasoftwares.khisreportgenerator.functions.Functions;
import com.gwazasoftwares.khisreportgenerator.models.Record;
import com.gwazasoftwares.khisreportgenerator.models.TableDataSet;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
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

        Functions functions = new Functions();
        functions.openFirstSemesterScreen();
        hideCurrentScreen();
    }
    }

    private void hideCurrentScreen() {
        Functions functions = new Functions();
        functions.closeWindow(btnNext);
    }
}
