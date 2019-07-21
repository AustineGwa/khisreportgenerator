package com.gwazasoftwares.khisreportgenerator.models;

public class TableDataSet {

    private String month;
    private int jan;

    public TableDataSet(String month, int jan) {
        this.month = month;
        this.jan = jan;
    }

    public TableDataSet() {
    }

    public int getJan() {
        return jan;
    }

    public void setJan(int jan) {
        this.jan = jan;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
