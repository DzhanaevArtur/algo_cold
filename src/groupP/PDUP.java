package groupP;

import control.INC;
import dataDescription.CSD;
import dataManagement.ASG;
import dataManagement.CURVE;
import dataManagement.ENG;
import dataManagement.ING;
import dataStatus.ACD;
import dataStatus.ACT;
import dataValue.WYE;
import logical.LN;

/*
 * PDUP (Directional underpower)
 * Направленная от недостаточной мощности.
 */

public class PDUP extends LN {

    // Информация о статусе
    private ACD str = new ACD(); //  Пуск
    private ACT op = new ACT(); //  Срабатывание

    // Управление
    private INC opCntRs = new INC(); //  Сбрасываемый счетчик операций

    // Параметры настройки
    private ASG strVal = new ASG(); //  Начальное значение
    private ING opDlTmms = new ING(); //  Время задержки срабатывания
    private ING rsDITmms = new ING(); //  Время задержки сброса
    private ENG dirMod = new ENG(); //  Направленный режим

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

    public ENG getDirMod() {
        return dirMod;
    }

    public void setDirMod(ENG dirMod) {
        this.dirMod = dirMod;
    }

    @Override
    public void process() {

    }
}

