package dataStatus;

import data.DATA;
import data.TimeStamp;
import dataAttribute.Unit;
import dataAttribute.Quality;

/*
 * BCR (Binary counter reading)
 * Считывание показаний двоичного счетчика
 */

public class BCR extends DATA {

// Состояние
    private Integer actVal = 0;
    private Integer frVal = 0;
    private TimeStamp frTm = new TimeStamp();
    private Quality q = new Quality();
    private TimeStamp t = new TimeStamp();

// Конфигурация, описание и расширение
    private Unit unit = new Unit();
    private Float puIsQty = 0.0F;
    private Boolean frEna = Boolean.FALSE;
    private TimeStamp strTm = new TimeStamp();
    private Integer frPd = 0;
    private Boolean frRs = Boolean.FALSE;
    private String d = "";
    private String dU = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

    public Integer getActVal() {
        return actVal;
    }

    public void setActVal(Integer actVal) {
        this.actVal = actVal;
    }

    public Integer getFrVal() {
        return frVal;
    }

    public void setFrVal(Integer frVal) {
        this.frVal = frVal;
    }

    public TimeStamp getFrTm() {
        return frTm;
    }

    public void setFrTm(TimeStamp frTm) {
        this.frTm = frTm;
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

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Float getPuIsQty() {
        return puIsQty;
    }

    public void setPuIsQty(Float puIsQty) {
        this.puIsQty = puIsQty;
    }

    public Boolean getFrEna() {
        return frEna;
    }

    public void setFrEna(Boolean frEna) {
        this.frEna = frEna;
    }

    public TimeStamp getStrTm() {
        return strTm;
    }

    public void setStrTm(TimeStamp strTm) {
        this.strTm = strTm;
    }

    public Integer getFrPd() {
        return frPd;
    }

    public void setFrPd(Integer frPd) {
        this.frPd = frPd;
    }

    public Boolean getFrRs() {
        return frRs;
    }

    public void setFrRs(Boolean frRs) {
        this.frRs = frRs;
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
