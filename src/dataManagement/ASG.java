package dataManagement;

import data.DATA;
import dataAttribute.AnalogueValue;
import dataAttribute.ScaledValueConfig;
import dataAttribute.Unit;

/*
 * ASG (Analogue setting)
 * Задание значения аналогового сигнала
 */

public class ASG extends DATA {

// Задание значений аналоговой переменной
    private AnalogueValue setMag = new AnalogueValue();

// Конфигурация, описание и расширение
    private Unit units = new Unit();
    private ScaledValueConfig sVC = new ScaledValueConfig();
    private AnalogueValue minVal = new AnalogueValue();
    private AnalogueValue maxVal = new AnalogueValue();
    private AnalogueValue stepSize = new AnalogueValue();
    private String d = "";
    private String dU = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

    public AnalogueValue getSetMag() {
        return setMag;
    }

    public void setSetMag(AnalogueValue setMag) {
        this.setMag = setMag;
    }

    public Unit getUnits() {
        return units;
    }

    public void setUnits(Unit units) {
        this.units = units;
    }

    public ScaledValueConfig getsVC() {
        return sVC;
    }

    public void setsVC(ScaledValueConfig sVC) {
        this.sVC = sVC;
    }

    public AnalogueValue getMinVal() {
        return minVal;
    }

    public void setMinVal(AnalogueValue minVal) {
        this.minVal = minVal;
    }

    public AnalogueValue getMaxVal() {
        return maxVal;
    }

    public void setMaxVal(AnalogueValue maxVal) {
        this.maxVal = maxVal;
    }

    public AnalogueValue getStepSize() {
        return stepSize;
    }

    public void setStepSize(AnalogueValue stepSize) {
        this.stepSize = stepSize;
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
