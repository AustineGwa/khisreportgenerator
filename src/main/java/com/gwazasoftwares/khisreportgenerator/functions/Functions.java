package com.gwazasoftwares.khisreportgenerator.functions;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.stage.Stage;


public class Functions {


    public void openMainScreen() throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/fxml/index.fxml"));
        Parent rootNode = fxmlLoader.load();

        Stage stage = new Stage();
        stage.setTitle("khis-Repoter");
        Scene scene = new Scene(rootNode, 700, 500);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    public void closeWindow(Control control) {
        // get a handle to the stage
        Stage stage = (Stage) control.getScene().getWindow();
        // got your current stage ---kill it
        stage.close();
    }

    public void openFirstSemesterScreen() throws  Exception{
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/fxml/firstSemesterChart.fxml"));
        Parent rootNode = fxmlLoader.load();

        Stage stage = new Stage();
        stage.setTitle("Reports Generator");
        Scene scene = new Scene(rootNode);
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }
}
