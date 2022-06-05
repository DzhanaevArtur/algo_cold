package groupP;

import control.INC;
import dataDescription.CSD;
import dataManagement.ASG;
import dataManagement.CURVE;
import dataManagement.ING;
import dataStatus.ACD;
import dataStatus.ACT;
import dataStatus.SPS;
import dataValue.WYE;
import logical.LN;

/*
 * PTUF (Underfrequency)
 * Недостаточная частота.
 */

public class PTUF extends LN {

    // Информация о статусе
    private ACD str = new ACD(); //  Пуск
    private ACT op = new ACT(); //  Срабатывание
    private SPS blkV = new SPS(); //  Динамические характеристики кривой

    // Управление
    private INC opCntRs = new INC(); //  Счетчик числа переключений со сбросом

    // Параметры настройки
    private ASG strVal = new ASG(); //  Начальное значение (частота)
    private ASG blkVal = new ASG(); //  Значение блока напряжения
    private ING opDlTmms = new ING(); //  Время задержки срабатывания
    private ING rsDlTmms = new ING(); //  Время задержки сброса

    public ACD getStr() {
        return str;
    }

    public void setStr(ACD str) {
        this.str = str;
    }

    public ACT getOp() {
        return op;
    }

    public void setOp(ACT op) {
        this.op = op;
    }

    public SPS getBlkV() {
        return blkV;
    }

    public void setBlkV(SPS blkV) {
        this.blkV = blkV;
    }

    public INC getOpCntRs() {
        return opCntRs;
    }

    public void setOpCntRs(INC opCntRs) {
        this.opCntRs = opCntRs;
    }

    public ASG getStrVal() {
        return strVal;
    }

    public void setStrVal(ASG strVal) {
        this.strVal = strVal;
    }

    public ASG getBlkVal() {
        return blkVal;
    }

    public void setBlkVal(ASG blkVal) {
        this.blkVal = blkVal;
    }

    public ING getOpDlTmms() {
        return opDlTmms;
    }

    public void setOpDlTmms(ING opDlTmms) {
        this.opDlTmms = opDlTmms;
    }

    public ING getRsDlTmms() {
        return rsDlTmms;
    }

    public void setRsDlTmms(ING rsDlTmms) {
        this.rsDlTmms = rsDlTmms;
    }

    @Override
    public void process() {

    }
}
