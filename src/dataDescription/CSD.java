package dataDescription;

import data.DATA;
import dataAttribute.Point;
import dataAttribute.Unit;

import java.util.ArrayList;

public class CSD extends DATA {

    private Unit xUnits = new Unit();
    private String xD = "";
    private String xDU = "";
    private Unit yUnits = new Unit();
    private String yD = "";
    private String yDU = "";
    private Unit zUnits = new Unit();
    private String zD = "";
    private String zDU = "";
    private Integer numPts = 0;
    private ArrayList<Point> crvPts = new ArrayList<>();
    private String d = "";
    private String dU = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

    public Unit getxUnits() {
        return xUnits;
    }

    public void setxUnits(Unit xUnits) {
        this.xUnits = xUnits;
    }

    public String getxD() {
        return xD;
    }

    public void setxD(String xD) {
        this.xD = xD;
    }

    public String getxDU() {
        return xDU;
    }

    public void setxDU(String xDU) {
        this.xDU = xDU;
    }

    public Unit getyUnits() {
        return yUnits;
    }

    public void setyUnits(Unit yUnits) {
        this.yUnits = yUnits;
    }

    public String getyD() {
        return yD;
    }

    public void setyD(String yD) {
        this.yD = yD;
    }

    public String getyDU() {
        return yDU;
    }

    public void setyDU(String yDU) {
        this.yDU = yDU;
    }

    public Unit getzUnits() {
        return zUnits;
    }

    public void setzUnits(Unit zUnits) {
        this.zUnits = zUnits;
    }

    public String getzD() {
        return zD;
    }

    public void setzD(String zD) {
        this.zD = zD;
    }

    public String getzDU() {
        return zDU;
    }

    public void setzDU(String zDU) {
        this.zDU = zDU;
    }

    public Integer getNumPts() {
        return numPts;
    }

    public void setNumPts(Integer numPts) {
        this.numPts = numPts;
    }

    public ArrayList<Point> getCrvPts() {
        return crvPts;
    }

    public void setCrvPts(ArrayList<Point> crvPts) {
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
