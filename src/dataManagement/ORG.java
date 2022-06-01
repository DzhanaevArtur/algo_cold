package dataManagement;

import data.DATA;
import data.ObjectReference;

/*
 * ORG (Object reference setting)
 * Настройка ссылки на объект
 */

public class ORG extends DATA {

// Установка состояния
    private ObjectReference setSrcRef = new ObjectReference();
    private ObjectReference setTstRef = new ObjectReference();
    private ObjectReference setSrcCB = new ObjectReference();
    private ObjectReference setTstCB = new ObjectReference();
    private String intAddr = "";
    private Boolean tstEna = Boolean.FALSE;

// Конфигурация, описание и расширение
    private String purpose = "";
    private String d = "";
    private String dU = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

    public ObjectReference getSetSrcRef() {
        return setSrcRef;
    }

    public void setSetSrcRef(ObjectReference setSrcRef) {
        this.setSrcRef = setSrcRef;
    }

    public ObjectReference getSetTstRef() {
        return setTstRef;
    }

    public void setSetTstRef(ObjectReference setTstRef) {
        this.setTstRef = setTstRef;
    }

    public ObjectReference getSetSrcCB() {
        return setSrcCB;
    }

    public void setSetSrcCB(ObjectReference setSrcCB) {
        this.setSrcCB = setSrcCB;
    }

    public ObjectReference getSetTstCB() {
        return setTstCB;
    }

    public void setSetTstCB(ObjectReference setTstCB) {
        this.setTstCB = setTstCB;
    }

    public String getIntAddr() {
        return intAddr;
    }

    public void setIntAddr(String intAddr) {
        this.intAddr = intAddr;
    }

    public Boolean getTstEna() {
        return tstEna;
    }

    public void setTstEna(Boolean tstEna) {
        this.tstEna = tstEna;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
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
