package groupX;

import dataManagement.DPC;
import dataManagement.INC;
import dataManagement.SPC;
import dataStatus.SPS;
import logical.LN;

/*
 * XCBR (Circuit breaker)
 * Автоматический выключатель.
 */

public class XCBR extends LN {

    private SPS loc = new SPS();
    private INC opCnt = new INC();
    private DPC pos = new DPC();
    private SPC BlkOpn = new SPC();
    private SPC BlkCls = new SPC();
    private DPC ctVal = new DPC();

    public int count = 15;
    public int i = 0;

    public INC getOpCnt() {
        return opCnt;
    }

    public SPC getBlkOpn() {
        return BlkOpn;
    }

    public DPC getPos() {
        return pos;
    }

    public void setPos(DPC pos) {
        this.pos = pos;
    }

    public DPC getCtVal() {
        return ctVal;
    }


    public void setCtVal(DPC ctVal) {
        this.ctVal = ctVal;
    }

    @Override
    public void process() {
        if (!BlkOpn.getStVal().getValue()) {
            if ((ctVal.getStVal().getValue() && !pos.getStVal().getValue())) {
                if (i < count) {
                    i++;
                } else {
                    pos.getStVal().setValue(true);
                    opCnt.increase();
                    i = 0;
                }
            }
        }
    }
}
