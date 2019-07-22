package com.gwazasoftwares.khisreportgenerator.models;

import javafx.beans.property.StringProperty;

public class TableDataSet {

    private String month;
    private String jan;

    public TableDataSet() {
    }

    public TableDataSet(String month, String jan) {
        this.month = month;
        this.jan = jan;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getJan() {
        return jan;
    }

    public void setJan(String jan) {
        this.jan = jan;
    }
}
