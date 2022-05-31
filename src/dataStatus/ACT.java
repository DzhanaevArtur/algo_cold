package dataStatus;

import data.DATA;
import data.TimeStamp;
import dataAttribute.Quality;

/*
 * ACT (Protection activation information)
 * Сведения об активации защиты
 */

public class ACT extends DATA {

// Состояние
    private Boolean general = Boolean.FALSE;
    private Boolean phsA = Boolean.FALSE;
    private Boolean phsB = Boolean.FALSE;
    private Boolean phsC = Boolean.FALSE;
    private Boolean neut = Boolean.FALSE;
    private Quality q = new Quality();
    private TimeStamp t = new TimeStamp();

// Конфигурация, описание и расширение
    private TimeStamp operTm = new TimeStamp();
    private String d = "";
    private String dU = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

    public Boolean getGeneral() {
        return general;
    }

    public void setGeneral(Boolean general) {
        this.general = general;
    }

    public Boolean getPhsA() {
        return phsA;
    }

    public void setPhsA(Boolean phsA) {
        this.phsA = phsA;
    }

    public Boolean getPhsB() {
        return phsB;
    }

    public void setPhsB(Boolean phsB) {
        this.phsB = phsB;
    }

    public Boolean getPhsC() {
        return phsC;
    }

    public void setPhsC(Boolean phsC) {
        this.phsC = phsC;
    }

    public Boolean getNeut() {
        return neut;
    }

    public void setNeut(Boolean neut) {
        this.neut = neut;
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

    public TimeStamp getOperTm() {
        return operTm;
    }

    public void setOperTm(TimeStamp operTm) {
        this.operTm = operTm;
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
