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
 * PHIZ (Ground detector)
 * Датчика земли.
 */

public class PHIZ extends LN {

    // Информация о статусе
    private ACD str = new ACD(); //  Пуск
    private ACT op = new ACT(); //  Срабатывание

    // Управление
    private INC opCntRs = new INC(); //  Сбрасываемый счетчик операций

    // Параметры настройки
    private ASG aStr = new ASG(); //  Начальное значение по току
    private ASG vStr = new ASG(); //  Начальное значение по напряжению
    private ASG hVStr = new ASG(); //  Начальное значение напряжения третьей гармоники
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

    public INC getOpCntRs() {
        return opCntRs;
    }

    public void setOpCntRs(INC opCntRs) {
        this.opCntRs = opCntRs;
    }

    public ASG getaStr() {
        return aStr;
    }

    public void setaStr(ASG aStr) {
        this.aStr = aStr;
    }

    public ASG getvStr() {
        return vStr;
    }

    public void setvStr(ASG vStr) {
        this.vStr = vStr;
    }

    public ASG gethVStr() {
        return hVStr;
    }

    public void sethVStr(ASG hVStr) {
        this.hVStr = hVStr;
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