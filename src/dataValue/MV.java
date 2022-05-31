package dataValue;

import data.DATA;
import data.TimeStamp;
import dataAttribute.AnalogueValue;
import dataAttribute.ScaledValueConfig;
import dataAttribute.Unit;
import dataAttribute.Quality;

/*
 * MV (Measured value)
 * Измеряемые значения
 */

public class MV extends DATA {

// Измеряемые атрибуты
    private AnalogueValue instMag = new AnalogueValue();
    private AnalogueValue mag = new AnalogueValue();
    private String range = "";
    private Quality q = new Quality();
    private TimeStamp t = new TimeStamp();

// Замещение
    private Boolean subEna = Boolean.FALSE;
    private AnalogueValue subMag = new AnalogueValue();
    private Quality subQ = new Quality();
    private String subID = "";

// Конфигурация, описание и расширение
    private Unit unit = new Unit();
    private Integer db = 0;
    private Integer zeroDb = 0;
    private ScaledValueConfig sVC = new ScaledValueConfig();
    private String rangeC = "";
    private Integer smpRate = 0;
    private String d = "";
    private String dU = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

    public AnalogueValue getInstMag() {
        return instMag;
    }

    public void setInstMag(AnalogueValue instMag) {
        this.instMag = instMag;
    }

    public AnalogueValue getMag() {
        return mag;
    }

    public void setMag(AnalogueValue mag) {
        this.mag = mag;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
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

    public Boolean getSubEna() {
        return subEna;
    }

    public void setSubEna(Boolean subEna) {
        this.subEna = subEna;
    }

    public AnalogueValue getSubMag() {
        return subMag;
    }

    public void setSubMag(AnalogueValue subMag) {
        this.subMag = subMag;
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

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Integer getDb() {
        return db;
    }

    public void setDb(Integer db) {
        this.db = db;
    }

    public Integer getZeroDb() {
        return zeroDb;
    }

    public void setZeroDb(Integer zeroDb) {
        this.zeroDb = zeroDb;
    }

    public ScaledValueConfig getsVC() {
        return sVC;
    }

    public void setsVC(ScaledValueConfig sVC) {
        this.sVC = sVC;
    }

    public String getRangeC() {
        return rangeC;
    }

    public void setRangeC(String rangeC) {
        this.rangeC = rangeC;
    }

    public Integer getSmpRate() {
        return smpRate;
    }

    public void setSmpRate(Integer smpRate) {
        this.smpRate = smpRate;
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
