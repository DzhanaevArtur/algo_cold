package groupP;

import control.INC;
import dataDescription.CSD;
import dataManagement.ASG;
import dataManagement.CURVE;
import dataManagement.ENG;
import dataManagement.ING;
import dataStatus.ACD;
import dataStatus.ACT;
import dataStatus.SPS;
import dataValue.WYE;
import logical.LN;

/*
 * POPF (Rate of change of frequency)
 * От превышения коэффициента мощности.
 */

public class POPF extends LN {

    // Информация о статусе
    private ACD str = new ACD(); //  Пуск
    private ACT op = new ACT(); //  Срабатывание
    private SPS blkA = new SPS(); //  Заблокирован ниже минимального рабочего тока
    private SPS blkV = new SPS(); //  Заблокирован ниже минимального рабочего напряжения

    // Управление
    private INC opCntRs = new INC(); //  Сбрасываемый счетчик операций

    // Параметры настройки
    private ASG strVal = new ASG(); //  Начальное значение
    private ING opDlTmms = new ING(); //  Время задержки срабатывания
    private ING rsDITmms = new ING(); //  Время задержки сброса
    private ASG blkValA = new ASG(); //  Значение блока (минимальный рабочий ток)
    private ASG blkValV= new ASG(); //  Значение блока (минимальный рабочий напряжение)

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

    public SPS getBlkA() {
        return blkA;
    }

    public void setBlkA(SPS blkA) {
        this.blkA = blkA;
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

    public ING getOpDlTmms() {
        return opDlTmms;
    }

    public void setOpDlTmms(ING opDlTmms) {
        this.opDlTmms = opDlTmms;
    }

    public ING getRsDITmms() {
        return rsDITmms;
    }

    public void setRsDITmms(ING rsDITmms) {
        this.rsDITmms = rsDITmms;
    }

    public ASG getBlkValA() {
        return blkValA;
    }

    public void setBlkValA(ASG blkValA) {
        this.blkValA = blkValA;
    }

    public ASG getBlkValV() {
        return blkValV;
    }

    public void setBlkValV(ASG blkValV) {
        this.blkValV = blkValV;
    }

    @Override
    public void process() {

    }
}

