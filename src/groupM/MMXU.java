package groupM;

import dataStatus.INS;
import dataValue.*;
import logical.LN;

/*
 * MHAI (Measurements)
 * Измерения
 */

public class MMXU extends LN {

// Информация об общих логических узлах
    private INS eEHealth = new INS();

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

    public INS geteEHealth() {
        return eEHealth;
    }

    public void seteEHealth(INS eEHealth) {
        this.eEHealth = eEHealth;
    }

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
}
