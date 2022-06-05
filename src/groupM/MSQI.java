package groupM;

import dataDescription.DPL;
import dataStatus.INS;
import dataValue.*;
import logical.LN;

/*
 * MSQI (Consistency and unbalance measurements)
 * Последовательность и небаланс
 */

public class MSQI extends LN {

// Информация об общих логических узлах
    private INS eEHealth = new INS();
    private DPL eEName = new DPL();

// Измеренные значения
    private SEQ seqA = new SEQ();
    private SEQ seqV = new SEQ();
    private SEQ dQ0Seq = new SEQ();
    private WYE imbA = new WYE();
    private MV imbNgA = new MV();
    private MV imbNgV = new MV();
    private DEL imbPPV = new DEL();
    private WYE imbV = new WYE();
    private MV imbZroA = new MV();
    private MV imbZroV = new MV();
    private MV maxImbA = new MV();
    private MV maxImbPPV = new MV();
    private MV maxImbV = new MV();

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

    public SEQ getSeqA() {
        return seqA;
    }

    public void setSeqA(SEQ seqA) {
        this.seqA = seqA;
    }

    public SEQ getSeqV() {
        return seqV;
    }

    public void setSeqV(SEQ seqV) {
        this.seqV = seqV;
    }

    public SEQ getdQ0Seq() {
        return dQ0Seq;
    }

    public void setdQ0Seq(SEQ dQ0Seq) {
        this.dQ0Seq = dQ0Seq;
    }

    public WYE getImbA() {
        return imbA;
    }

    public void setImbA(WYE imbA) {
        this.imbA = imbA;
    }

    public MV getImbNgA() {
        return imbNgA;
    }

    public void setImbNgA(MV imbNgA) {
        this.imbNgA = imbNgA;
    }

    public MV getImbNgV() {
        return imbNgV;
    }

    public void setImbNgV(MV imbNgV) {
        this.imbNgV = imbNgV;
    }

    public DEL getImbPPV() {
        return imbPPV;
    }

    public void setImbPPV(DEL imbPPV) {
        this.imbPPV = imbPPV;
    }

    public WYE getImbV() {
        return imbV;
    }

    public void setImbV(WYE imbV) {
        this.imbV = imbV;
    }

    public MV getImbZroA() {
        return imbZroA;
    }

    public void setImbZroA(MV imbZroA) {
        this.imbZroA = imbZroA;
    }

    public MV getImbZroV() {
        return imbZroV;
    }

    public void setImbZroV(MV imbZroV) {
        this.imbZroV = imbZroV;
    }

    public MV getMaxImbA() {
        return maxImbA;
    }

    public void setMaxImbA(MV maxImbA) {
        this.maxImbA = maxImbA;
    }

    public MV getMaxImbPPV() {
        return maxImbPPV;
    }

    public void setMaxImbPPV(MV maxImbPPV) {
        this.maxImbPPV = maxImbPPV;
    }

    public MV getMaxImbV() {
        return maxImbV;
    }

    public void setMaxImbV(MV maxImbV) {
        this.maxImbV = maxImbV;
    }

    @Override
    public void process() {

    }
}
