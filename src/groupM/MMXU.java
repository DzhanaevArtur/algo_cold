package groupM;

import dataManagement.ENG;
import dataStatus.INS;
import dataValue.*;
import logical.LN;

/*
 * MMXU (Measurement)
 * Измерения
 */

public class MMXU extends LN {

    // Измеренные значения
    private MV totW = new MV();
    private MV totVAr = new MV();
    private MV totVA = new MV();
    private MV totPF = new MV();
    private MV hz = new MV();
    private DEL pPV = new DEL();
    private WYE phV = new WYE();
    private WYE a = new WYE();
    private WYE w = new WYE();
    private WYE vAr = new WYE();
    private WYE vA = new WYE();
    private WYE pF = new WYE();
    private WYE z = new WYE();
    private MV avAPhs = new MV();
    private MV avPPVPhs = new MV();
    private MV avPhVPhs = new MV();
    private MV avWPhs = new MV();
    private MV avVAPhs = new MV();
    private MV avVArPhs = new MV();
    private MV avPFPhs = new MV();
    private MV avZPhs = new MV();
    private MV maxAPhs = new MV();
    private MV maxPPVPhs = new MV();
    private MV maxPhVPhs = new MV();
    private MV maxWPhs = new MV();
    private MV maxVAPhs = new MV();
    private MV maxVArPhs = new MV();
    private MV maxPFPhs = new MV();
    private MV maxZPhs = new MV();
    private MV minAPhs = new MV();
    private MV minPPVPhs = new MV();
    private MV minPhVPhs = new MV();
    private MV minWPhs = new MV();
    private MV minVAPhs = new MV();
    private MV minVArPhs = new MV();
    private MV minPFPhs = new MV();
    private MV minZPhs = new MV();

    // Настройки
    private ENG clcTotVA = new ENG();
    private ENG pFSign = new ENG();

    public MV getTotW() {
        return totW;
    }

    public void setTotW(MV totW) {
        this.totW = totW;
    }

    public MV getTotVAr() {
        return totVAr;
    }

    public void setTotVAr(MV totVAr) {
        this.totVAr = totVAr;
    }

    public MV getTotVA() {
        return totVA;
    }

    public void setTotVA(MV totVA) {
        this.totVA = totVA;
    }

    public MV getTotPF() {
        return totPF;
    }

    public void setTotPF(MV totPF) {
        this.totPF = totPF;
    }

    public MV getHz() {
        return hz;
    }

    public void setHz(MV hz) {
        this.hz = hz;
    }

    public DEL getpPV() {
        return pPV;
    }

    public void setpPV(DEL pPV) {
        this.pPV = pPV;
    }

    public WYE getPhV() {
        return phV;
    }

    public void setPhV(WYE phV) {
        this.phV = phV;
    }

    public WYE getA() {
        return a;
    }

    public void setA(WYE a) {
        this.a = a;
    }

    public WYE getW() {
        return w;
    }

    public void setW(WYE w) {
        this.w = w;
    }

    public WYE getvAr() {
        return vAr;
    }

    public void setvAr(WYE vAr) {
        this.vAr = vAr;
    }

    public WYE getvA() {
        return vA;
    }

    public void setvA(WYE vA) {
        this.vA = vA;
    }

    public WYE getpF() {
        return pF;
    }

    public void setpF(WYE pF) {
        this.pF = pF;
    }

    public WYE getZ() {
        return z;
    }

    public void setZ(WYE z) {
        this.z = z;
    }

    public MV getAvAPhs() {
        return avAPhs;
    }

    public void setAvAPhs(MV avAPhs) {
        this.avAPhs = avAPhs;
    }

    public MV getAvPPVPhs() {
        return avPPVPhs;
    }

    public void setAvPPVPhs(MV avPPVPhs) {
        this.avPPVPhs = avPPVPhs;
    }

    public MV getAvPhVPhs() {
        return avPhVPhs;
    }

    public void setAvPhVPhs(MV avPhVPhs) {
        this.avPhVPhs = avPhVPhs;
    }

    public MV getAvWPhs() {
        return avWPhs;
    }

    public void setAvWPhs(MV avWPhs) {
        this.avWPhs = avWPhs;
    }

    public MV getAvVAPhs() {
        return avVAPhs;
    }

    public void setAvVAPhs(MV avVAPhs) {
        this.avVAPhs = avVAPhs;
    }

    public MV getAvVArPhs() {
        return avVArPhs;
    }

    public void setAvVArPhs(MV avVArPhs) {
        this.avVArPhs = avVArPhs;
    }

    public MV getAvPFPhs() {
        return avPFPhs;
    }

    public void setAvPFPhs(MV avPFPhs) {
        this.avPFPhs = avPFPhs;
    }

    public MV getAvZPhs() {
        return avZPhs;
    }

    public void setAvZPhs(MV avZPhs) {
        this.avZPhs = avZPhs;
    }

    public MV getMaxAPhs() {
        return maxAPhs;
    }

    public void setMaxAPhs(MV maxAPhs) {
        this.maxAPhs = maxAPhs;
    }

    public MV getMaxPPVPhs() {
        return maxPPVPhs;
    }

    public void setMaxPPVPhs(MV maxPPVPhs) {
        this.maxPPVPhs = maxPPVPhs;
    }

    public MV getMaxPhVPhs() {
        return maxPhVPhs;
    }

    public void setMaxPhVPhs(MV maxPhVPhs) {
        this.maxPhVPhs = maxPhVPhs;
    }

    public MV getMaxWPhs() {
        return maxWPhs;
    }

    public void setMaxWPhs(MV maxWPhs) {
        this.maxWPhs = maxWPhs;
    }

    public MV getMaxVAPhs() {
        return maxVAPhs;
    }

    public void setMaxVAPhs(MV maxVAPhs) {
        this.maxVAPhs = maxVAPhs;
    }

    public MV getMaxVArPhs() {
        return maxVArPhs;
    }

    public void setMaxVArPhs(MV maxVArPhs) {
        this.maxVArPhs = maxVArPhs;
    }

    public MV getMaxPFPhs() {
        return maxPFPhs;
    }

    public void setMaxPFPhs(MV maxPFPhs) {
        this.maxPFPhs = maxPFPhs;
    }

    public MV getMaxZPhs() {
        return maxZPhs;
    }

    public void setMaxZPhs(MV maxZPhs) {
        this.maxZPhs = maxZPhs;
    }

    public MV getMinAPhs() {
        return minAPhs;
    }

    public void setMinAPhs(MV minAPhs) {
        this.minAPhs = minAPhs;
    }

    public MV getMinPPVPhs() {
        return minPPVPhs;
    }

    public void setMinPPVPhs(MV minPPVPhs) {
        this.minPPVPhs = minPPVPhs;
    }

    public MV getMinPhVPhs() {
        return minPhVPhs;
    }

    public void setMinPhVPhs(MV minPhVPhs) {
        this.minPhVPhs = minPhVPhs;
    }

    public MV getMinWPhs() {
        return minWPhs;
    }

    public void setMinWPhs(MV minWPhs) {
        this.minWPhs = minWPhs;
    }

    public MV getMinVAPhs() {
        return minVAPhs;
    }

    public void setMinVAPhs(MV minVAPhs) {
        this.minVAPhs = minVAPhs;
    }

    public MV getMinVArPhs() {
        return minVArPhs;
    }

    public void setMinVArPhs(MV minVArPhs) {
        this.minVArPhs = minVArPhs;
    }

    public MV getMinPFPhs() {
        return minPFPhs;
    }

    public void setMinPFPhs(MV minPFPhs) {
        this.minPFPhs = minPFPhs;
    }

    public MV getMinZPhs() {
        return minZPhs;
    }

    public void setMinZPhs(MV minZPhs) {
        this.minZPhs = minZPhs;
    }

    public ENG getClcTotVA() {
        return clcTotVA;
    }

    public void setClcTotVA(ENG clcTotVA) {
        this.clcTotVA = clcTotVA;
    }

    public ENG getpFSign() {
        return pFSign;
    }

    public void setpFSign(ENG pFSign) {
        this.pFSign = pFSign;
    }

    @Override
    public void process() {

    }
}
