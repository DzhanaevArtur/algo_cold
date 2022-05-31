package dataManagement;

import data.DATA;
import data.TimeStamp;
import dataAttribute.*;
import dataAttribute.Quality;

/*
 * APC (Controllable analogue set point information)
 * Управление значением аналогового сигнал
 */

public class APC extends DATA {

// Заданное значение и измеренные атрибуты
    private AnalogueValue setMag = new AnalogueValue();
    private Originator origin = new Originator();
    private TimeStamp operTm = new TimeStamp();
    private Quality q = new Quality();
    private TimeStamp t = new TimeStamp();

// Конфигурация, описание и расширение
    private CtIModels ctIModel = new CtIModels();
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

    public Originator getOrigin() {
        return origin;
    }

    public void setOrigin(Originator origin) {
        this.origin = origin;
    }

    public TimeStamp getOperTm() {
        return operTm;
    }

    public void setOperTm(TimeStamp operTm) {
        this.operTm = operTm;
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

    public CtIModels getCtIModel() {
        return ctIModel;
    }

    public void setCtIModel(CtIModels ctIModel) {
        this.ctIModel = ctIModel;
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
