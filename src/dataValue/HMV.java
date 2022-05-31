package dataValue;

import data.DATA;
import data.TimeStamp;
import dataAttribute.Unit;
import dataAttribute.Vector;
import dataAttribute.Quality;

import java.util.ArrayList;

/*
 * HMV (Harmonic value)
 * Значения гармоник
 */

public class HMV extends DATA {

// Основные измеряемые атрибуты
    private Quality q = new Quality();
    private TimeStamp t = new TimeStamp();

// Гармоники и интергармоники
    private ArrayList<Vector> har = new ArrayList<>();

// Конфигурация, описание и расширение
    private Integer numHar = 0;
    private Integer numCyc = 0;
    private Integer evalTm = 0;
    private Unit unit = new Unit();
    private Integer smpRate = 0;
    private Float frequency = 0.0F;
    private String hvRef = "";
    private Integer rmsCyc = 0;
    private String d = "";
    private String dU = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

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

    public ArrayList<Vector> getHar() {
        return har;
    }

    public void setHar(ArrayList<Vector> har) {
        this.har = har;
    }

    public Integer getNumHar() {
        return numHar;
    }

    public void setNumHar(Integer numHar) {
        this.numHar = numHar;
    }

    public Integer getNumCyc() {
        return numCyc;
    }

    public void setNumCyc(Integer numCyc) {
        this.numCyc = numCyc;
    }

    public Integer getEvalTm() {
        return evalTm;
    }

    public void setEvalTm(Integer evalTm) {
        this.evalTm = evalTm;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Integer getSmpRate() {
        return smpRate;
    }

    public void setSmpRate(Integer smpRate) {
        this.smpRate = smpRate;
    }

    public Float getFrequency() {
        return frequency;
    }

    public void setFrequency(Float frequency) {
        this.frequency = frequency;
    }

    public String getHvRef() {
        return hvRef;
    }

    public void setHvRef(String hvRef) {
        this.hvRef = hvRef;
    }

    public Integer getRmsCyc() {
        return rmsCyc;
    }

    public void setRmsCyc(Integer rmsCyc) {
        this.rmsCyc = rmsCyc;
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
