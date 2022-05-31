package dataManagement;

import data.DATA;
import data.TimeStamp;
import dataAttribute.CtIModels;
import dataAttribute.Originator;
import dataAttribute.SboClasses;
import dataAttribute.ValWithTrans;
import dataAttribute.Quality;

/*
 * BSC (Binary controlled step position information)
 * Двоичное управление пошаговым механизмом и его состояни
 */

public class BSC extends DATA {

// Управление и состояние
    private String ctIVal = "";
    private Originator origin = new Originator();
    private Integer ctINum = 0;
    private ValWithTrans valWTr = new ValWithTrans();
    private Quality q = new Quality();
    private TimeStamp t = new TimeStamp();
    private Boolean stSeld = Boolean.FALSE;

// Замещение
    private Boolean subEna = Boolean.FALSE;
    private ValWithTrans subVal = new ValWithTrans();
    private Quality subQ = new Quality();
    private String subID = "";

// Конфигурация, описание и расширение
    private Boolean persistent = Boolean.FALSE;
    private CtIModels ctIModel = new CtIModels();
    private Integer sboTimeout = 0;
    private SboClasses sboClass = new SboClasses();
    private Integer minVal = 0;
    private Integer maxVal = 0;
    private Integer stepSize = 0;
    private String d = "";
    private String dU = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

    public String getCtIVal() {
        return ctIVal;
    }

    public void setCtIVal(String ctIVal) {
        this.ctIVal = ctIVal;
    }

    public Originator getOrigin() {
        return origin;
    }

    public void setOrigin(Originator origin) {
        this.origin = origin;
    }

    public Integer getCtINum() {
        return ctINum;
    }

    public void setCtINum(Integer ctINum) {
        this.ctINum = ctINum;
    }

    public ValWithTrans getValWTr() {
        return valWTr;
    }

    public void setValWTr(ValWithTrans valWTr) {
        this.valWTr = valWTr;
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

    public Boolean getStSeld() {
        return stSeld;
    }

    public void setStSeld(Boolean stSeld) {
        this.stSeld = stSeld;
    }

    public Boolean getSubEna() {
        return subEna;
    }

    public void setSubEna(Boolean subEna) {
        this.subEna = subEna;
    }

    public ValWithTrans getSubVal() {
        return subVal;
    }

    public void setSubVal(ValWithTrans subVal) {
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

    public Boolean getPersistent() {
        return persistent;
    }

    public void setPersistent(Boolean persistent) {
        this.persistent = persistent;
    }

    public CtIModels getCtIModel() {
        return ctIModel;
    }

    public void setCtIModel(CtIModels ctIModel) {
        this.ctIModel = ctIModel;
    }

    public Integer getSboTimeout() {
        return sboTimeout;
    }

    public void setSboTimeout(Integer sboTimeout) {
        this.sboTimeout = sboTimeout;
    }

    public SboClasses getSboClass() {
        return sboClass;
    }

    public void setSboClass(SboClasses sboClass) {
        this.sboClass = sboClass;
    }

    public Integer getMinVal() {
        return minVal;
    }

    public void setMinVal(Integer minVal) {
        this.minVal = minVal;
    }

    public Integer getMaxVal() {
        return maxVal;
    }

    public void setMaxVal(Integer maxVal) {
        this.maxVal = maxVal;
    }

    public Integer getStepSize() {
        return stepSize;
    }

    public void setStepSize(Integer stepSize) {
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
