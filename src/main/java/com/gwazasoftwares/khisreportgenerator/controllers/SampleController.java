package com.gwazasoftwares.khisreportgenerator.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class SampleController {

    private Parent rootNode;
    private FXMLLoader fxmlLoader;


    public void onLoginButtonClicked() throws Exception{

        fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/fxml/firstSemesterChart.fxml"));
        rootNode = fxmlLoader.load();

        Stage stage = new Stage();
        stage.setTitle("My New Stage Title");
        stage.setScene(new Scene(rootNode, 450, 450));
        stage.show();
        // Hide this current window (if this is what you want)
        //((Node)(event.getSource())).getScene().getWindow().hide();

    }
}
