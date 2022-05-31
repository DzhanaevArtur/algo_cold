package dataValue;

import data.DATA;

/*
 * WYE (WYE)
 * Звезда
 */

public class WYE extends DATA {

    private CMV phsA = new CMV();
    private CMV phsB = new CMV();
    private CMV phsC = new CMV();
    private CMV neut = new CMV();
    private CMV net = new CMV();
    private CMV res = new CMV();

// Конфигурация, описание и расширение
    private String angRef = "";
    private String d = "";
    private String dU = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

    public CMV getPhsA() {
        return phsA;
    }

    public void setPhsA(CMV phsA) {
        this.phsA = phsA;
    }

    public CMV getPhsB() {
        return phsB;
    }

    public void setPhsB(CMV phsB) {
        this.phsB = phsB;
    }

    public CMV getPhsC() {
        return phsC;
    }

    public void setPhsC(CMV phsC) {
        this.phsC = phsC;
    }

    public CMV getNeut() {
        return neut;
    }

    public void setNeut(CMV neut) {
        this.neut = neut;
    }

    public CMV getNet() {
        return net;
    }

    public void setNet(CMV net) {
        this.net = net;
    }

    public CMV getRes() {
        return res;
    }

    public void setRes(CMV res) {
        this.res = res;
    }

    public String getAngRef() {
        return angRef;
    }

    public void setAngRef(String angRef) {
        this.angRef = angRef;
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
