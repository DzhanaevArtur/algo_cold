package dataValue;

import data.DATA;

/*
 * DEL (Delta)
 * Треугольник
 */

public class DEL extends DATA {

    private CMV phsAB = new CMV();
    private CMV phsBC = new CMV();
    private CMV phsCA = new CMV();

// Конфигурация, описание и расширение
    private String d = "";
    private String dU = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

    public CMV getPhsAB() {
        return phsAB;
    }

    public void setPhsAB(CMV phsAB) {
        this.phsAB = phsAB;
    }

    public CMV getPhsBC() {
        return phsBC;
    }

    public void setPhsBC(CMV phsBC) {
        this.phsBC = phsBC;
    }

    public CMV getPhsCA() {
        return phsCA;
    }

    public void setPhsCA(CMV phsCA) {
        this.phsCA = phsCA;
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
