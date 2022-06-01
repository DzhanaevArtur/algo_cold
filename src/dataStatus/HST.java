package dataStatus;

import data.DATA;
import data.TimeStamp;
import dataAttribute.Cell;
import dataAttribute.Unit;
import dataAttribute.Quality;

import java.util.ArrayList;

/*
 * HST (Histogram)
 * Гистограмма
 */

public class HST extends DATA {

// Состояние
    private ArrayList<Integer> hstVal = new ArrayList<>();
    private Quality q = new Quality();
    private TimeStamp t = new TimeStamp();

// Конфигурация, описание и расширение
    private Integer numPts = 0;
    private ArrayList<Cell> hstRangeC = new ArrayList<>();
    private Unit xUnits = new Unit();
    private Unit yUnits = new Unit();
    private Unit units = new Unit();
    private String xD = "";
    private String xDU = "";
    private String yD = "";
    private String yDU = "";
    private String d = "";
    private String dU = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

    public ArrayList<Integer> getHstVal() {
        return hstVal;
    }

    public void setHstVal(ArrayList<Integer> hstVal) {
        this.hstVal = hstVal;
    }

    public Quality getQ() {
        return q;
    }

    public void setQ(Quality q) {
        this.q = q;
    }

    public TimeStamp getT() {
        return t;
    }

    public void setT(TimeStamp t) {
        this.t = t;
    }

    public Integer getNumPts() {
        return numPts;
    }

    public void setNumPts(Integer numPts) {
        this.numPts = numPts;
    }

    public ArrayList<Cell> getHstRangeC() {
        return hstRangeC;
    }

    public void setHstRangeC(ArrayList<Cell> hstRangeC) {
        this.hstRangeC = hstRangeC;
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

    public Unit getUnits() {
        return units;
    }

    public void setUnits(Unit units) {
        this.units = units;
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