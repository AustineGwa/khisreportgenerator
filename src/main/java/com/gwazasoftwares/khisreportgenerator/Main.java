package com.gwazasoftwares.khisreportgenerator;

import com.gwazasoftwares.khisreportgenerator.functions.Functions;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Main extends Application {


    private ConfigurableApplicationContext springContext;
    private Parent rootNode;
    private FXMLLoader fxmlLoader;
    public static void main(String[] args) {
        //SpringApplication.run(Main.class, args);
        launch(args);
    }

    // this method intergrates JavaFX  with Spring Boot.
    // The code inside starts Spring context,
    // creates FXMLLoader and ceding the control of beans creation to the Spring’s bean factory

    @Override
    public void init() throws Exception {
        springContext = SpringApplication.run(Main.class);
        fxmlLoader = new FXMLLoader();
        fxmlLoader.setControllerFactory(springContext::getBean);
    }


    @Override
    public void start(Stage primaryStage) throws Exception{

        Functions functions = new Functions();
        functions.openMainScreen();


    }

    @Override
    public void stop() {
        springContext.stop();
    }


}
