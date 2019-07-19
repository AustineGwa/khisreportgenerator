package com.gwazasoftwares.khisreportgenerator.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class SampleController {

    @FXML
    Button btnNext;


    public void onLoginButtonClicked() throws Exception{

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/fxml/firstSemesterChart.fxml"));
        Parent rootNode = fxmlLoader.load();

        Stage stage = new Stage();
        stage.setTitle("My New Stage Title");
        stage.setScene(new Scene(rootNode, 450, 450));
        stage.setMaximized(true);
        stage.show();
        // Hide this current window (if this is what you want)
        hideCurrentScreen();



    }

    private void hideCurrentScreen() {

        // get a handle to the stage
        Stage stage = (Stage) btnNext.getScene().getWindow();
        // got your current stage ---kill it
        stage.close();
    }
}
