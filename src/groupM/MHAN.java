package groupM;

import dataDescription.DPL;
import dataManagement.ASG;
import dataManagement.ING;
import dataStatus.INS;
import dataValue.*;
import logical.LN;

/*
 * MHAN (Phase independent harmonics and interharmonics measurements)
 * Гармоники и интергармоники независимые от фазы
 */

public class MHAN extends LN {

// Информация об общих логических узлах
    private INS eEHealth = new INS();
    private DPL eEName = new DPL();

// Измеренные значения
    private MV hz = new MV();
    private HMV haAmp = new HMV();
    private HMV haVol = new HMV();
    private HMV haWatt = new HMV();
    private HMV haVolAmpr = new HMV();
    private HMV haVolAmp = new HMV();
    private MV haRmsAmp = new MV();
    private MV haRmsVol = new MV();
    private MV haTuWatt = new MV();
    private MV haTsWatt = new MV();
    private MV haAmpTm = new MV();
    private MV haKFact = new MV();
    private MV haTdFact = new MV();
    private MV thdAmp = new MV();
    private MV thdOddAmp = new MV();
    private MV thdEvnAmp = new MV();
    private MV tddAmp = new MV();
    private MV tddOddAmp = new MV();
    private MV tddEvnAmp = new MV();
    private MV thdVol = new MV();
    private MV thdOddVol = new MV();
    private MV thdEvnVol = new MV();
    private MV haCfAmp = new MV();
    private MV haCfVol = new MV();
    private MV haTiFact = new MV();

// Параметры настройки
    private ASG hzSet = new ASG();
    private ASG evTmms = new ASG();
    private ING numCyc = new ING();
    private ASG thdAVal = new ASG();
    private ASG thdVVal = new ASG();
    private ING thdATmms = new ING();
    private ING thdVTmms = new ING();
    private ASG nomA = new ASG();

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

    public MV getHz() {
        return hz;
    }

    public void setHz(MV hz) {
        this.hz = hz;
    }

    public HMV getHaAmp() {
        return haAmp;
    }

    public void setHaAmp(HMV haAmp) {
        this.haAmp = haAmp;
    }

    public HMV getHaVol() {
        return haVol;
    }

    public void setHaVol(HMV haVol) {
        this.haVol = haVol;
    }

    public HMV getHaWatt() {
        return haWatt;
    }

    public void setHaWatt(HMV haWatt) {
        this.haWatt = haWatt;
    }

    public HMV getHaVolAmpr() {
        return haVolAmpr;
    }

    public void setHaVolAmpr(HMV haVolAmpr) {
        this.haVolAmpr = haVolAmpr;
    }

    public HMV getHaVolAmp() {
        return haVolAmp;
    }

    public void setHaVolAmp(HMV haVolAmp) {
        this.haVolAmp = haVolAmp;
    }

    public MV getHaRmsAmp() {
        return haRmsAmp;
    }

    public void setHaRmsAmp(MV haRmsAmp) {
        this.haRmsAmp = haRmsAmp;
    }

    public MV getHaRmsVol() {
        return haRmsVol;
    }

    public void setHaRmsVol(MV haRmsVol) {
        this.haRmsVol = haRmsVol;
    }

    public MV getHaTuWatt() {
        return haTuWatt;
    }

    public void setHaTuWatt(MV haTuWatt) {
        this.haTuWatt = haTuWatt;
    }

    public MV getHaTsWatt() {
        return haTsWatt;
    }

    public void setHaTsWatt(MV haTsWatt) {
        this.haTsWatt = haTsWatt;
    }

    public MV getHaAmpTm() {
        return haAmpTm;
    }

    public void setHaAmpTm(MV haAmpTm) {
        this.haAmpTm = haAmpTm;
    }

    public MV getHaKFact() {
        return haKFact;
    }

    public void setHaKFact(MV haKFact) {
        this.haKFact = haKFact;
    }

    public MV getHaTdFact() {
        return haTdFact;
    }

    public void setHaTdFact(MV haTdFact) {
        this.haTdFact = haTdFact;
    }

    public MV getThdAmp() {
        return thdAmp;
    }

    public void setThdAmp(MV thdAmp) {
        this.thdAmp = thdAmp;
    }

    public MV getThdOddAmp() {
        return thdOddAmp;
    }

    public void setThdOddAmp(MV thdOddAmp) {
        this.thdOddAmp = thdOddAmp;
    }

    public MV getThdEvnAmp() {
        return thdEvnAmp;
    }

    public void setThdEvnAmp(MV thdEvnAmp) {
        this.thdEvnAmp = thdEvnAmp;
    }

    public MV getTddAmp() {
        return tddAmp;
    }

    public void setTddAmp(MV tddAmp) {
        this.tddAmp = tddAmp;
    }

    public MV getTddOddAmp() {
        return tddOddAmp;
    }

    public void setTddOddAmp(MV tddOddAmp) {
        this.tddOddAmp = tddOddAmp;
    }

    public MV getTddEvnAmp() {
        return tddEvnAmp;
    }

    public void setTddEvnAmp(MV tddEvnAmp) {
        this.tddEvnAmp = tddEvnAmp;
    }

    public MV getThdVol() {
        return thdVol;
    }

    public void setThdVol(MV thdVol) {
        this.thdVol = thdVol;
    }

    public MV getThdOddVol() {
        return thdOddVol;
    }

    public void setThdOddVol(MV thdOddVol) {
        this.thdOddVol = thdOddVol;
    }

    public MV getThdEvnVol() {
        return thdEvnVol;
    }

    public void setThdEvnVol(MV thdEvnVol) {
        this.thdEvnVol = thdEvnVol;
    }

    public MV getHaCfAmp() {
        return haCfAmp;
    }

    public void setHaCfAmp(MV haCfAmp) {
        this.haCfAmp = haCfAmp;
    }

    public MV getHaCfVol() {
        return haCfVol;
    }

    public void setHaCfVol(MV haCfVol) {
        this.haCfVol = haCfVol;
    }

    public MV getHaTiFact() {
        return haTiFact;
    }

    public void setHaTiFact(MV haTiFact) {
        this.haTiFact = haTiFact;
    }

    public ASG getHzSet() {
        return hzSet;
    }

    public void setHzSet(ASG hzSet) {
        this.hzSet = hzSet;
    }

    public ASG getEvTmms() {
        return evTmms;
    }

    public void setEvTmms(ASG evTmms) {
        this.evTmms = evTmms;
    }

    public ING getNumCyc() {
        return numCyc;
    }

    public void setNumCyc(ING numCyc) {
        this.numCyc = numCyc;
    }

    public ASG getThdAVal() {
        return thdAVal;
    }

    public void setThdAVal(ASG thdAVal) {
        this.thdAVal = thdAVal;
    }

    public ASG getThdVVal() {
        return thdVVal;
    }

    public void setThdVVal(ASG thdVVal) {
        this.thdVVal = thdVVal;
    }

    public ING getThdATmms() {
        return thdATmms;
    }

    public void setThdATmms(ING thdATmms) {
        this.thdATmms = thdATmms;
    }

    public ING getThdVTmms() {
        return thdVTmms;
    }

    public void setThdVTmms(ING thdVTmms) {
        this.thdVTmms = thdVTmms;
    }

    public ASG getNomA() {
        return nomA;
    }

    public void setNomA(ASG nomA) {
        this.nomA = nomA;
    }

    @Override
    public void process() {
        
    }
}
