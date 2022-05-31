package dataStatus;

import data.DATA;
import data.TimeStamp;
import dataAttribute.Quality;

/*
 * ACD (Directional protection activation information)
 * Сведения об активации направленной защиты
 */

public class ACD extends DATA {

// Состояние
    private Boolean general = Boolean.FALSE;
    private String dirGeneral = "";
    private Boolean phsA = Boolean.FALSE;
    private String dirPhsA = "";
    private Boolean phsB = Boolean.FALSE;
    private String dirPhsB = "";
    private Boolean phsC = Boolean.FALSE;
    private String dirPhsC = "";
    private Boolean neut = Boolean.FALSE;
    private String dirNeut = "";
    private Quality q = new Quality();
    private TimeStamp t = new TimeStamp();

// Конфигурация, описание и расширение
    private String d = "";
    private String dU = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

    public Boolean getGeneral() {
        return general;
    }

    public void setGeneral(Boolean general) {
        this.general = general;
    }

    public String getDirGeneral() {
        return dirGeneral;
    }

    public void setDirGeneral(String dirGeneral) {
        this.dirGeneral = dirGeneral;
    }

    public Boolean getPhsA() {
        return phsA;
    }

    public void setPhsA(Boolean phsA) {
        this.phsA = phsA;
    }

    public String getDirPhsA() {
        return dirPhsA;
    }

    public void setDirPhsA(String dirPhsA) {
        this.dirPhsA = dirPhsA;
    }

    public Boolean getPhsB() {
        return phsB;
    }

    public void setPhsB(Boolean phsB) {
        this.phsB = phsB;
    }

    public String getDirPhsB() {
        return dirPhsB;
    }

    public void setDirPhsB(String dirPhsB) {
        this.dirPhsB = dirPhsB;
    }

    public Boolean getPhsC() {
        return phsC;
    }

    public void setPhsC(Boolean phsC) {
        this.phsC = phsC;
    }

    public String getDirPhsC() {
        return dirPhsC;
    }

    public void setDirPhsC(String dirPhsC) {
        this.dirPhsC = dirPhsC;
    }

    public Boolean getNeut() {
        return neut;
    }

    public void setNeut(Boolean neut) {
        this.neut = neut;
    }

    public String getDirNeut() {
        return dirNeut;
    }

    public void setDirNeut(String dirNeut) {
        this.dirNeut = dirNeut;
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
