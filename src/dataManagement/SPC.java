package dataManagement;

import data.DATA;
import data.TimeStamp;
import dataAttribute.*;
import dataAttribute.Quality;

/*
 * SPC (Controllable single point)
 * Недублированное управление состояния
 */

public class SPC extends DATA {

// Управление и состояние
    private Boolean ctIVal = Boolean.FALSE;
    private TimeStamp operTm = new TimeStamp();
    private Originator origin = new Originator();
    private Integer ctINum = 0;
    private Boolean stVal = Boolean.FALSE;
    private Quality q = new Quality();
    private TimeStamp t = new TimeStamp();
    private Boolean stSeld = Boolean.FALSE;

// Замещение
    private Boolean subEna = Boolean.FALSE;
    private ValWithTrans subVal = new ValWithTrans();
    private Quality subQ = new Quality();
    private String subID = "";


// Конфигурация, описание и расширение
    private PulseConfig pulseConfig = new PulseConfig();
    private CtIModels ctIModel = new CtIModels();
    private Integer sboTimeout = 0;
    private SboClasses sboClass = new SboClasses();
    private String d = "";
    private String dU = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

    public Boolean getCtIVal() {
        return ctIVal;
    }

    public void setCtIVal(Boolean ctIVal) {
        this.ctIVal = ctIVal;
    }

    public TimeStamp getOperTm() {
        return operTm;
    }

    public void setOperTm(TimeStamp operTm) {
        this.operTm = operTm;
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

    public Boolean getStVal() {
        return stVal;
    }

    public void setStVal(Boolean stVal) {
        this.stVal = stVal;
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

    public PulseConfig getPulseConfig() {
        return pulseConfig;
    }

    public void setPulseConfig(PulseConfig pulseConfig) {
        this.pulseConfig = pulseConfig;
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
