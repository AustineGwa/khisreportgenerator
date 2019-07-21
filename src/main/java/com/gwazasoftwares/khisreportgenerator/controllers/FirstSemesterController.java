package com.gwazasoftwares.khisreportgenerator.controllers;

import com.gwazasoftwares.khisreportgenerator.Main;
import com.gwazasoftwares.khisreportgenerator.models.TableDataSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.springframework.boot.SpringApplication;

import javax.annotation.Resources;
import java.net.URL;
import java.util.Arrays;

public class FirstSemesterController {

    @FXML TableView <TableDataSet> dataEntryTable;
    @FXML TableColumn<TableDataSet, String> monthColumn;
    @FXML TableColumn<TableDataSet, String> jan;

    private ObservableList<TableDataSet> dataSetCategories;

    @FXML
    protected void initialize(){
        refreshDataEntryTable();
    }

    @FXML
    public void refreshDataEntryTable() {

        this.dataSetCategories = FXCollections.observableArrayList();
        dataSetCategories.addAll(Arrays.asList(new TableDataSet("Target Population",20),new TableDataSet("Monthly Total",20),new TableDataSet("Cumulative Total",30)));
        this.monthColumn.setCellValueFactory(new PropertyValueFactory<TableDataSet, String>("month"));
        this.jan.setCellValueFactory(new PropertyValueFactory<TableDataSet, String>("jan"));


        this.dataEntryTable.setItems(null);
        this.dataEntryTable.setItems(dataSetCategories);
    }

}
