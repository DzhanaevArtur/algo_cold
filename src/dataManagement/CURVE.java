package dataManagement;

import data.DATA;

/*
 * CURVE (Setting curve)
 * Настройка кривой
 */

public class CURVE extends DATA {

// Задание значений аналоговой переменной
    private String setCharact = "";
    private Float setParA = 0.0F;
    private Float setParB = 0.0F;
    private Float setParC = 0.0F;
    private Float setParD = 0.0F;
    private Float setParE = 0.0F;
    private Float setParF = 0.0F;

// Конфигурация, описание и расширение
    private String d = "";
    private String dU = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

    public String getSetCharact() {
        return setCharact;
    }

    public void setSetCharact(String setCharact) {
        this.setCharact = setCharact;
    }

    public Float getSetParA() {
        return setParA;
    }

    public void setSetParA(Float setParA) {
        this.setParA = setParA;
    }

    public Float getSetParB() {
        return setParB;
    }

    public void setSetParB(Float setParB) {
        this.setParB = setParB;
    }

    public Float getSetParC() {
        return setParC;
    }

    public void setSetParC(Float setParC) {
        this.setParC = setParC;
    }

    public Float getSetParD() {
        return setParD;
    }

    public void setSetParD(Float setParD) {
        this.setParD = setParD;
    }

    public Float getSetParE() {
        return setParE;
    }

    public void setSetParE(Float setParE) {
        this.setParE = setParE;
    }

    public Float getSetParF() {
        return setParF;
    }

    public void setSetParF(Float setParF) {
        this.setParF = setParF;
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
