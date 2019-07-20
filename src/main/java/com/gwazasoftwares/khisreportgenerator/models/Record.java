package com.gwazasoftwares.khisreportgenerator.models;

public class Record {

    private String countyName;
    private String facilityName;
    private String mflCode;

    public Record() {
    }

    public Record(String countyName, String facilityName, String mflCode) {
        this.countyName = countyName;
        this.facilityName = facilityName;
        this.mflCode = mflCode;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getMflCode() {
        return mflCode;
    }

    public void setMflCode(String mflCode) {
        this.mflCode = mflCode;
    }

    @Override
    public String toString() {
        return "Record{" +
                "countyName='" + countyName + '\'' +
                ", facilityName='" + facilityName + '\'' +
                ", mflCode='" + mflCode + '\'' +
                '}';
    }
}
