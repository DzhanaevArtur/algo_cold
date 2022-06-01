package dataDescription;

import data.DATA;

/*
 * DPL (Device name plate)
 * Заводская табличка устройства
 */

public class DPL extends DATA {

// Конфигурация, описание и расширение
    private String vendor = "";
    private String hwRev = "";
    private String swRev = "";
    private String serNum = "";
    private String model = "";
    private String location = "";
    private String name = "";
    private String owner = "";
    private String ePSName = "";
    private String primeOper = "";
    private String secondOper = "";
    private Float latitude = 0.0F;
    private Float longitude =0.0F;
    private Float altitude = 0.0F;
    private String mRID = "";
    private String d = "";
    private String dU = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getHwRev() {
        return hwRev;
    }

    public void setHwRev(String hwRev) {
        this.hwRev = hwRev;
    }

    public String getSwRev() {
        return swRev;
    }

    public void setSwRev(String swRev) {
        this.swRev = swRev;
    }

    public String getSerNum() {
        return serNum;
    }

    public void setSerNum(String serNum) {
        this.serNum = serNum;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getePSName() {
        return ePSName;
    }

    public void setePSName(String ePSName) {
        this.ePSName = ePSName;
    }

    public String getPrimeOper() {
        return primeOper;
    }

    public void setPrimeOper(String primeOper) {
        this.primeOper = primeOper;
    }

    public String getSecondOper() {
        return secondOper;
    }

    public void setSecondOper(String secondOper) {
        this.secondOper = secondOper;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getAltitude() {
        return altitude;
    }

    public void setAltitude(Float altitude) {
        this.altitude = altitude;
    }

    public String getmRID() {
        return mRID;
    }

    public void setmRID(String mRID) {
        this.mRID = mRID;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getdU() {
        return dU;
    }

    public void setdU(String dU) {
        this.dU = dU;
    }

    public String getCdcNs() {
        return cdcNs;
    }

    public void setCdcNs(String cdcNs) {
        this.cdcNs = cdcNs;
    }

    public String getCdcName() {
        return cdcName;
    }

    public void setCdcName(String cdcName) {
        this.cdcName = cdcName;
    }

    public String getDataNs() {
        return dataNs;
    }

    public void setDataNs(String dataNs) {
        this.dataNs = dataNs;
    }
}
