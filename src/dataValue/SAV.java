package dataValue;

import data.DATA;
import data.TimeStamp;
import dataAttribute.AnalogueValue;
import dataAttribute.ScaledValueConfig;
import dataAttribute.Unit;
import dataAttribute.Quality;

/*
 * SAV (Sampled value)
 * Выборочные значения
 */

public class SAV extends DATA {

// Измеряемые атрибуты
    private AnalogueValue instMag = new AnalogueValue();
    private Quality q = new Quality();
    private TimeStamp t = new TimeStamp();

// Конфигурация, описание и расширение
    private Unit units = new Unit();
    private ScaledValueConfig sVC = new ScaledValueConfig();
    private AnalogueValue min = new AnalogueValue();
    private AnalogueValue max = new AnalogueValue();
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

    public AnalogueValue getMin() {
        return min;
    }

    public void setMin(AnalogueValue min) {
        this.min = min;
    }

    public AnalogueValue getMax() {
        return max;
    }

    public void setMax(AnalogueValue max) {
        this.max = max;
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
