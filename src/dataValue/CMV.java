package dataValue;

import data.DATA;
import data.TimeStamp;
import dataAttribute.ScaledValueConfig;
import dataAttribute.Unit;
import dataAttribute.Vector;
import dataAttribute.Quality;

/*
 * CMV (Complex measured value)
 * Комплексные измеряемые значения
 */

public class CMV extends DATA {

// Измеряемые атрибуты
    private Vector instCVal = new Vector();
    private Vector cVal = new Vector();
    private String range = "";
    private String rangeAng = "";
    private Quality q = new Quality();
    private TimeStamp t = new TimeStamp();

// Замещение
    private Boolean subEna = Boolean.FALSE;
    private Vector subCVal = new Vector();
    private Quality subQ = new Quality();
    private String subID = "";
    private Boolean blkEna = Boolean.FALSE;

// Конфигурация, описание и расширение
    private Unit units = new Unit();
    private Integer db = 0;
    private Integer dbAng = 0;
    private Integer zeroDb = 0;
    private String rangeC = "";
    private String rangeAngC = "";
    private ScaledValueConfig magSVC = new ScaledValueConfig();
    private ScaledValueConfig angSVC = new ScaledValueConfig();
    private String angRef = "";
    private Integer smpRate = 0;
    private String d = "";
    private String dU = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

    public Vector getInstCVal() {
        return instCVal;
    }

    public void setInstCVal(Vector instCVal) {
        this.instCVal = instCVal;
    }

    public Vector getcVal() {
        return cVal;
    }

    public void setcVal(Vector cVal) {
        this.cVal = cVal;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getRangeAng() {
        return rangeAng;
    }

    public void setRangeAng(String rangeAng) {
        this.rangeAng = rangeAng;
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

    public Vector getSubCVal() {
        return subCVal;
    }

    public void setSubCVal(Vector subCVal) {
        this.subCVal = subCVal;
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

    public Boolean getBlkEna() {
        return blkEna;
    }

    public void setBlkEna(Boolean blkEna) {
        this.blkEna = blkEna;
    }

    public Unit getUnits() {
        return units;
    }

    public void setUnits(Unit units) {
        this.units = units;
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

    public Integer getDbAng() {
        return dbAng;
    }

    public void setDbAng(Integer dbAng) {
        this.dbAng = dbAng;
    }

    public void setZeroDb(Integer zeroDb) {
        this.zeroDb = zeroDb;
    }

    public String getRangeC() {
        return rangeC;
    }

    public void setRangeC(String rangeC) {
        this.rangeC = rangeC;
    }

    public String getRangeAngC() {
        return rangeAngC;
    }

    public void setRangeAngC(String rangeAngC) {
        this.rangeAngC = rangeAngC;
    }

    public ScaledValueConfig getMagSVC() {
        return magSVC;
    }

    public void setMagSVC(ScaledValueConfig magSVC) {
        this.magSVC = magSVC;
    }

    public ScaledValueConfig getAngSVC() {
        return angSVC;
    }

    public void setAngSVC(ScaledValueConfig angSVC) {
        this.angSVC = angSVC;
    }

    public String getAngRef() {
        return angRef;
    }

    public void setAngRef(String angRef) {
        this.angRef = angRef;
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
