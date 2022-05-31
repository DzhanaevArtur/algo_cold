package dataStatus;

import data.DATA;
import data.TimeStamp;
import dataAttribute.Quality;

/*
 * SPS (Single point status)
 * Недублированное состояние
 */

public class SPS extends DATA {

// Состояние
    private Boolean stVal = Boolean.FALSE;
    private Quality q = new Quality();
    private TimeStamp t = new TimeStamp();

// Замещение
    private Boolean subEna = Boolean.FALSE;
    private Boolean subVal = Boolean.FALSE;
    private Quality subQ = new Quality();
    private String subID = "";

// Конфигурация, описание и расширение
    private String d = "";
    private String dU = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

    public Boolean getStVal() {
        return stVal;
    }

    public void setStVal(Boolean stVal) {
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

    public Boolean getSubVal() {
        return subVal;
    }

    public void setSubVal(Boolean subVal) {
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
