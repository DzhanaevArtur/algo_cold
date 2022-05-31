package dataValue;

import data.DATA;

/*
 * SEQ (Sequence)
 * Последовательность
 */

public class SEQ extends DATA {

    private CMV c1 = new CMV();
    private CMV c2 = new CMV();
    private CMV c3 = new CMV();

// Измеряемые атрибуты
    private String seqT = "";

// Конфигурация, описание и расширение
    private String phsRef = "";
    private String d = "";
    private String dU = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

    public CMV getC1() {
        return c1;
    }

    public void setC1(CMV c1) {
        this.c1 = c1;
    }

    public CMV getC2() {
        return c2;
    }

    public void setC2(CMV c2) {
        this.c2 = c2;
    }

    public CMV getC3() {
        return c3;
    }

    public void setC3(CMV c3) {
        this.c3 = c3;
    }

    public String getSeqT() {
        return seqT;
    }

    public void setSeqT(String seqT) {
        this.seqT = seqT;
    }

    public String getPhsRef() {
        return phsRef;
    }

    public void setPhsRef(String phsRef) {
        this.phsRef = phsRef;
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
