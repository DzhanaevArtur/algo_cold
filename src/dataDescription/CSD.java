package dataDescription;

import data.DATA;
import dataAttribute.Unit;

import java.util.ArrayList;

public class CSD extends DATA {

    private Unit xUnit = new Unit();
    private String xD = "";
    private Unit yUnit = new Unit();
    private String yD = "";
    private Integer numPts = 0;
    private ArrayList<Integer> crvPts = new ArrayList<>();
    private String d = "";
    private String dU = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

    public Unit getxUnit() {
        return xUnit;
    }

    public void setxUnit(Unit xUnit) {
        this.xUnit = xUnit;
    }

    public String getxD() {
        return xD;
    }

    public void setxD(String xD) {
        this.xD = xD;
    }

    public Unit getyUnit() {
        return yUnit;
    }

    public void setyUnit(Unit yUnit) {
        this.yUnit = yUnit;
    }

    public String getyD() {
        return yD;
    }

    public void setyD(String yD) {
        this.yD = yD;
    }

    public Integer getNumPts() {
        return numPts;
    }

    public void setNumPts(Integer numPts) {
        this.numPts = numPts;
    }

    public ArrayList<Integer> getCrvPts() {
        return crvPts;
    }

    public void setCrvPts(ArrayList<Integer> crvPts) {
        this.crvPts = crvPts;
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
