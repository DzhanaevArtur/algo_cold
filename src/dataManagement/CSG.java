package dataManagement;

import dataAttribute.Point;
import dataAttribute.Unit;

import java.util.ArrayList;

/*
 * CSG (Curve shape setting)
 * Настройка формы кривой
 */

public class CSG {

// Установка состояния
    private Float pointZ = 0.0F;
    private Integer numPts = 0;
    private ArrayList<Point> crvPts = new ArrayList<>();

// Конфигурация, описание и расширение
    private Unit xUnits = new Unit();
    private Unit yUnits = new Unit();
    private Unit zUnits = new Unit();
    private Integer maxPts = 0;
    private String xD = "";
    private String xDU = "";
    private String yD = "";
    private String yDU = "";
    private String zD = "";
    private String zDU = "";
    private String d = "";
    private String dU = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

    public Float getPointZ() {
        return pointZ;
    }

    public void setPointZ(Float pointZ) {
        this.pointZ = pointZ;
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

    public Unit getxUnits() {
        return xUnits;
    }

    public void setxUnits(Unit xUnits) {
        this.xUnits = xUnits;
    }

    public Unit getyUnits() {
        return yUnits;
    }

    public void setyUnits(Unit yUnits) {
        this.yUnits = yUnits;
    }

    public Unit getzUnits() {
        return zUnits;
    }

    public void setzUnits(Unit zUnits) {
        this.zUnits = zUnits;
    }

    public Integer getMaxPts() {
        return maxPts;
    }

    public void setMaxPts(Integer maxPts) {
        this.maxPts = maxPts;
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
