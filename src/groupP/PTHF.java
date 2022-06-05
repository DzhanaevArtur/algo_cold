package groupP;

import control.INC;
import dataDescription.CSD;
import dataManagement.ASG;
import dataManagement.CURVE;
import dataManagement.ING;
import dataManagement.SPC;
import dataStatus.ACD;
import dataStatus.ACT;
import dataValue.WYE;
import logical.LN;

/*
 * PTHF (Thyristor protection)
 * Защита тиристора.
 */

public class PTHF extends LN {

    // Информация о статусе
    private ACD str = new ACD(); //  Пуск
    private ACT op = new ACT(); //  Срабатывание

    // Управление
    private INC opCntRs = new INC(); //  Сбрасываемый счетчик операций

    // Параметры настройки
    private ASG strVal = new ASG(); //  Начальное значение

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

    public ASG getStrVal() {
        return strVal;
    }

    public void setStrVal(ASG strVal) {
        this.strVal = strVal;
    }

    @Override
    public void process() {

    }
}
