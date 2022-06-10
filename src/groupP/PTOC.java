package groupP;

import dataManagement.ASG;
import dataManagement.ENG;
import dataManagement.ING;
import dataStatus.ACD;
import dataStatus.ACT;
import dataValue.Attribute;
import dataValue.WYE;
import logical.LN;

/*
 * PTOC (Time overcurrent)
 * Время перегрузки по току.
 */

public class PTOC extends LN {

    private WYE A = new WYE();
    private ACT op = new ACT();
    private ACD str = new ACD();
    private ING OpDlTmms = new ING(10); //Выдержка времени
    private ASG StrVal = new ASG(0f); //Уставка срабатывания
    private ENG DirMod = new ENG();
    private Attribute<Boolean> Pusk = new Attribute<>(false);
    private Attribute<Boolean> acceleration = new Attribute<>(false);

    private int count = 0;

    public Attribute<Boolean> getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(Attribute<Boolean> acceleration) {
        this.acceleration = acceleration;
    }

    public Attribute<Boolean> getPusk() {
        return Pusk;
    }

    public void setPusk(Attribute<Boolean> pusk) {
        Pusk = pusk;
    }

    public ING getOpDlTmms() {
        return OpDlTmms;
    }

    public void setOpDlTmms(ING opDlTmms) {
        OpDlTmms = opDlTmms;
    }

    public ASG getStrVal() {
        return StrVal;
    }

    public void setStrVal(Float strVal) {
        StrVal.getSetMag().getF().setValue(strVal);
    }

    public WYE getA() {
        return A;
    }

    public void setA(WYE a) {
        A = a;
    }

    public ACT getOp() {
        return op;
    }

    public void setOp(ACT op) {
        this.op = op;
    }

    public ACD getStr() {
        return str;
    }

    public void setStr(ACD str) {
        this.str = str;
    }

    public ENG getDirMod() {
        return DirMod;
    }

    public void setDirMod(ENG dirMod) {
        DirMod = dirMod;
    }

    @Override
    public void process() {

        if (acceleration.getValue()) {
            getOpDlTmms().getSetVal().setValue(10);
        }


        boolean phsA = false;
        boolean phsB = false;
        boolean phsC = false;

        if (DirMod.getDir().getValue().ordinal() == 1) {
            if (str.getDirGeneral().getValue().ordinal() == 1) {
                phsA = A.getPhsA().getcVal().getMag().getF().getValue() > StrVal.getSetMag().getF().getValue() &&
                        DirMod.getDir().getValue() == str.getDirPhsA().getValue();
                phsB = A.getPhsB().getcVal().getMag().getF().getValue() > StrVal.getSetMag().getF().getValue() &&
                        DirMod.getDir().getValue() == str.getDirPhsB().getValue();
                phsC = A.getPhsC().getcVal().getMag().getF().getValue() > StrVal.getSetMag().getF().getValue() &&
                        DirMod.getDir().getValue() == str.getDirPhsC().getValue();
            }
        } else {
            phsA = A.getPhsA().getcVal().getMag().getF().getValue() > StrVal.getSetMag().getF().getValue();
            phsB = A.getPhsB().getcVal().getMag().getF().getValue() > StrVal.getSetMag().getF().getValue();
            phsC = A.getPhsC().getcVal().getMag().getF().getValue() > StrVal.getSetMag().getF().getValue();
        }

        if (phsA || phsB || phsC) {
            count++;
            getPusk().setValue(true);
        } else {
            count = 0;
            getPusk().setValue(false);
        }

        if (count >= OpDlTmms.getSetVal().getValue()) {
            op.getGeneral().setValue(true);
            op.getPhsA().setValue(phsA);
            op.getPhsB().setValue(phsB);
            op.getPhsC().setValue(phsC);
        }

    }
}
