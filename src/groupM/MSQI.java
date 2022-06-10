package groupM;

/*
 * MSQI (Consistency and unbalance measurements)
 * Последовательность и небаланс
 */

import dataAttribute.Vector;
import dataValue.SEQ;
import dataValue.WYE;
import logical.LN;

public class MSQI extends LN {

    private SEQ SeqA = new SEQ();
    private SEQ SeqV = new SEQ();

    private WYE A = new WYE();
    private WYE V = new WYE();

    private Vector phA = new Vector();
    private Vector phB = new Vector();
    private Vector phC = new Vector();


    public SEQ getSeqA() {
        return SeqA;
    }

    public void setSeqA(SEQ seqA) {
        SeqA = seqA;
    }

    public SEQ getSeqV() {
        return SeqV;
    }

    public void setSeqV(SEQ seqV) {
        SeqV = seqV;
    }

    public WYE getA() {
        return A;
    }

    public void setA(WYE a) {
        A = a;
    }

    public WYE getV() {
        return V;
    }

    public void setV(WYE v) {
        V = v;
    }


    @Override
    public void process() {
        seq(A, SeqA);
        seq(V, SeqV);
    }

    private void seq(WYE wye, SEQ seq) {

        phB.setMag(wye.getPhsB().getcVal().getMag().getF().getValue());
        phB.setAng(wye.getPhsB().getcVal().getAng().getF().getValue() + 120);
        phB.setMag(wye.getPhsC().getcVal().getMag().getF().getValue());
        phB.setAng(wye.getPhsC().getcVal().getAng().getF().getValue() - 120);

        seq.getC1().getcVal().setByOrt(
                (phA.getVectorX().getF().getValue() +
                        phB.getVectorX().getF().getValue() +
                        phC.getVectorX().getF().getValue()) / 3,
                (phA.getVectorY().getF().getValue() +
                        phB.getVectorY().getF().getValue() +
                        phC.getVectorY().getF().getValue()) / 3);

        phB.setMag(wye.getPhsB().getcVal().getMag().getF().getValue());
        phB.setAng(wye.getPhsB().getcVal().getAng().getF().getValue() - 120);
        phB.setMag(wye.getPhsC().getcVal().getMag().getF().getValue());
        phB.setAng(wye.getPhsC().getcVal().getAng().getF().getValue() + 120);

        seq.getC2().getcVal().setByOrt(
                (phA.getVectorX().getF().getValue() +
                        phB.getVectorX().getF().getValue() +
                        phC.getVectorX().getF().getValue()) / 3,
                (phA.getVectorY().getF().getValue() +
                        phB.getVectorY().getF().getValue() +
                        phC.getVectorY().getF().getValue()) / 3);

        seq.getC3().getcVal().setByOrt(
                (wye.getPhsA().getcVal().getVectorX().getF().getValue() +
                        wye.getPhsB().getcVal().getVectorX().getF().getValue() +
                        wye.getPhsC().getcVal().getVectorX().getF().getValue()) / 3,
                (wye.getPhsA().getcVal().getVectorY().getF().getValue() +
                        wye.getPhsB().getcVal().getVectorY().getF().getValue() +
                        wye.getPhsC().getcVal().getVectorY().getF().getValue()) / 3);

    }
}
