package dataStatus;

import data.DATA;
import data.TimeStamp;
import dataAttribute.Quality;
import dataAttribute.Unit;

/*
 * INS (Integer status)
 * Целочисленное состояние
 */

public class INS extends DATA {

// Состояние
    private Integer stVal = 0;
    private Quality q = new Quality();
    private TimeStamp t = new TimeStamp();

// Замещение
    private Boolean subEna = Boolean.FALSE;
    private Integer subVal = 0;
    private Quality subQ = new Quality();
    private String subID = "";
    private Boolean blkEna = Boolean.FALSE;

// Конфигурация, описание и расширение
    private Unit units = new Unit();
    private String d = "";
    private String dU = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

    public Integer getStVal() {
        return stVal;
    }

    public void setStVal(Integer stVal) {
        this.stVal = stVal;
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

    public Boolean getSubEna() {
        return subEna;
    }

    public void setSubEna(Boolean subEna) {
        this.subEna = subEna;
    }

    public Integer getSubVal() {
        return subVal;
    }

    public void setSubVal(Integer subVal) {
        this.subVal = subVal;
    }

    public Quality getSubQ() {
        return subQ;
    }

    public void setSubQ(Quality subQ) {
        this.subQ = subQ;
    }

    public String getSubID() {
        return subID;
    }

    public void setSubID(String subID) {
        this.subID = subID;
    }

    public Boolean getBlkEna() {
        return blkEna;
    }

    public void setBlkEna(Boolean blkEna) {
        this.blkEna = blkEna;
    }

    public Unit getUnits() {
        return units;
    }

    public void setUnits(Unit units) {
        this.units = units;
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
