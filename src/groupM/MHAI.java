package groupM;

import dataDescription.DPL;
import dataManagement.ASG;
import dataManagement.ING;
import dataStatus.INS;
import dataValue.*;
import logical.LN;

/*
 * MHAI (Harmonics and interharmonics measurements)
 * Гармоники и интергармоники
 */

public class MHAI extends LN {

// Информация об общих логических узлах
    private INS eEHealth = new INS();
    private DPL eEName = new DPL();

// Измеренные значения
    private MV hz = new MV();
    private HWYE hA = new HWYE();
    private HWYE hPhV = new HWYE();
    private HDEL hPPV = new HDEL();
    private HWYE hW = new HWYE();
    private HWYE hVAr = new HWYE();
    private HWYE hVA = new HWYE();
    private WYE hRmsA = new WYE();
    private WYE hRmsPhV = new WYE();
    private DEL hRmsPPV = new DEL();
    private WYE hTuW = new WYE();
    private WYE hTsW = new WYE();
    private WYE hATm = new WYE();
    private WYE hKf = new WYE();
    private WYE hTdf = new WYE();
    private WYE thdA = new WYE();
    private WYE thdOddA = new WYE();
    private WYE thdEvnA = new WYE();
    private WYE tddA = new WYE();
    private WYE tddOddA = new WYE();
    private WYE tddEvnA = new WYE();
    private WYE thdPhV = new WYE();
    private WYE thdOddPhV = new WYE();
    private WYE thdEvnPhV = new WYE();
    private DEL thdPPV = new DEL();
    private DEL thdOddPPV = new DEL();
    private DEL thdEvnPPV = new DEL();
    private WYE hCfPhV = new WYE();
    private DEL hCfPPV = new DEL();
    private WYE hCfA = new WYE();
    private WYE hTif = new WYE();

// Параметры настройки
    private ASG hzSet = new ASG(0.0F);
    private ASG evTmms = new ASG(0.0F);
    private ING numCyc = new ING(0);
    private ASG thdAVal = new ASG(0.0F);
    private ASG thdVVal = new ASG(0.0F);
    private ING thdATmms = new ING(0);
    private ING thdVTmms = new ING(0);
    private ASG nomA = new ASG(0.0F);

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

    public HWYE gethA() {
        return hA;
    }

    public void sethA(HWYE hA) {
        this.hA = hA;
    }

    public HWYE gethPhV() {
        return hPhV;
    }

    public void sethPhV(HWYE hPhV) {
        this.hPhV = hPhV;
    }

    public HDEL gethPPV() {
        return hPPV;
    }

    public void sethPPV(HDEL hPPV) {
        this.hPPV = hPPV;
    }

    public HWYE gethW() {
        return hW;
    }

    public void sethW(HWYE hW) {
        this.hW = hW;
    }

    public HWYE gethVAr() {
        return hVAr;
    }

    public void sethVAr(HWYE hVAr) {
        this.hVAr = hVAr;
    }

    public HWYE gethVA() {
        return hVA;
    }

    public void sethVA(HWYE hVA) {
        this.hVA = hVA;
    }

    public WYE gethRmsA() {
        return hRmsA;
    }

    public void sethRmsA(WYE hRmsA) {
        this.hRmsA = hRmsA;
    }

    public WYE gethRmsPhV() {
        return hRmsPhV;
    }

    public void sethRmsPhV(WYE hRmsPhV) {
        this.hRmsPhV = hRmsPhV;
    }

    public DEL gethRmsPPV() {
        return hRmsPPV;
    }

    public void sethRmsPPV(DEL hRmsPPV) {
        this.hRmsPPV = hRmsPPV;
    }

    public WYE gethTuW() {
        return hTuW;
    }

    public void sethTuW(WYE hTuW) {
        this.hTuW = hTuW;
    }

    public WYE gethTsW() {
        return hTsW;
    }

    public void sethTsW(WYE hTsW) {
        this.hTsW = hTsW;
    }

    public WYE gethATm() {
        return hATm;
    }

    public void sethATm(WYE hATm) {
        this.hATm = hATm;
    }

    public WYE gethKf() {
        return hKf;
    }

    public void sethKf(WYE hKf) {
        this.hKf = hKf;
    }

    public WYE gethTdf() {
        return hTdf;
    }

    public void sethTdf(WYE hTdf) {
        this.hTdf = hTdf;
    }

    public WYE getThdA() {
        return thdA;
    }

    public void setThdA(WYE thdA) {
        this.thdA = thdA;
    }

    public WYE getThdOddA() {
        return thdOddA;
    }

    public void setThdOddA(WYE thdOddA) {
        this.thdOddA = thdOddA;
    }

    public WYE getThdEvnA() {
        return thdEvnA;
    }

    public void setThdEvnA(WYE thdEvnA) {
        this.thdEvnA = thdEvnA;
    }

    public WYE getTddA() {
        return tddA;
    }

    public void setTddA(WYE tddA) {
        this.tddA = tddA;
    }

    public WYE getTddOddA() {
        return tddOddA;
    }

    public void setTddOddA(WYE tddOddA) {
        this.tddOddA = tddOddA;
    }

    public WYE getTddEvnA() {
        return tddEvnA;
    }

    public void setTddEvnA(WYE tddEvnA) {
        this.tddEvnA = tddEvnA;
    }

    public WYE getThdPhV() {
        return thdPhV;
    }

    public void setThdPhV(WYE thdPhV) {
        this.thdPhV = thdPhV;
    }

    public WYE getThdOddPhV() {
        return thdOddPhV;
    }

    public void setThdOddPhV(WYE thdOddPhV) {
        this.thdOddPhV = thdOddPhV;
    }

    public WYE getThdEvnPhV() {
        return thdEvnPhV;
    }

    public void setThdEvnPhV(WYE thdEvnPhV) {
        this.thdEvnPhV = thdEvnPhV;
    }

    public DEL getThdPPV() {
        return thdPPV;
    }

    public void setThdPPV(DEL thdPPV) {
        this.thdPPV = thdPPV;
    }

    public DEL getThdOddPPV() {
        return thdOddPPV;
    }

    public void setThdOddPPV(DEL thdOddPPV) {
        this.thdOddPPV = thdOddPPV;
    }

    public DEL getThdEvnPPV() {
        return thdEvnPPV;
    }

    public void setThdEvnPPV(DEL thdEvnPPV) {
        this.thdEvnPPV = thdEvnPPV;
    }

    public WYE gethCfPhV() {
        return hCfPhV;
    }

    public void sethCfPhV(WYE hCfPhV) {
        this.hCfPhV = hCfPhV;
    }

    public DEL gethCfPPV() {
        return hCfPPV;
    }

    public void sethCfPPV(DEL hCfPPV) {
        this.hCfPPV = hCfPPV;
    }

    public WYE gethCfA() {
        return hCfA;
    }

    public void sethCfA(WYE hCfA) {
        this.hCfA = hCfA;
    }

    public WYE gethTif() {
        return hTif;
    }

    public void sethTif(WYE hTif) {
        this.hTif = hTif;
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
