package groupM;

import dataDescription.DPL;
import dataStatus.INS;
import dataValue.CMV;
import dataValue.MV;
import logical.LN;

/*
 * MMXN (Phase-independent measurements)
 * Измерения, независимые от фазы
 */

public class MMXN extends LN {

// Информация об общих логических узлах
    private INS eEHealth = new INS();
    private DPL eEName = new DPL();

// Измеренные значения
    private MV amp = new MV();
    private MV vol = new MV();
    private MV watt = new MV();
    private MV volAmpr = new MV();
    private MV volAmp = new MV();
    private MV pwrFact = new MV();
    private CMV imp = new CMV();
    private MV hz = new MV();

    public INS geteEHealth() {
        return eEHealth;
    }

    public void seteEHealth(INS eEHealth) {
        this.eEHealth = eEHealth;
    }

    public DPL geteEName() {
        return eEName;
    }

    public void seteEName(DPL eEName) {
        this.eEName = eEName;
    }

    public MV getAmp() {
        return amp;
    }

    public void setAmp(MV amp) {
        this.amp = amp;
    }

    public MV getVol() {
        return vol;
    }

    public void setVol(MV vol) {
        this.vol = vol;
    }

    public MV getWatt() {
        return watt;
    }

    public void setWatt(MV watt) {
        this.watt = watt;
    }

    public MV getVolAmpr() {
        return volAmpr;
    }

    public void setVolAmpr(MV volAmpr) {
        this.volAmpr = volAmpr;
    }

    public MV getVolAmp() {
        return volAmp;
    }

    public void setVolAmp(MV volAmp) {
        this.volAmp = volAmp;
    }

    public MV getPwrFact() {
        return pwrFact;
    }

    public void setPwrFact(MV pwrFact) {
        this.pwrFact = pwrFact;
    }

    public CMV getImp() {
        return imp;
    }

    public void setImp(CMV imp) {
        this.imp = imp;
    }

    public MV getHz() {
        return hz;
    }

    public void setHz(MV hz) {
        this.hz = hz;
    }
}
