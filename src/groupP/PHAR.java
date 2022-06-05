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
 * PHAR (Harmonic restraint)
 * От гармонических помех.
 */

public class PHAR extends LN {

    // Информация о статусе
    private ACD str = new ACD(); //  Пуск

    // Управление
    private INC opCntRs = new INC(); //  Сбрасываемый счетчик операций

    // Параметры настройки
    private ING haRst = new ING(); //  Количество сдерживаемых гармоник
    private ASG phStr = new ASG(); //  Начальное значение
    private ASG phStop = new ASG(); //  Конечное значение
    private ING opDlTmms = new ING(); //  Время задержки срабатывания
    private ING rsDlTmms = new ING(); //  Время задержки сброса

    public ACD getStr() {
        return str;
    }

    public void setStr(ACD str) {
        this.str = str;
    }

    public INC getOpCntRs() {
        return opCntRs;
    }

    public void setOpCntRs(INC opCntRs) {
        this.opCntRs = opCntRs;
    }

    public ING getHaRst() {
        return haRst;
    }

    public void setHaRst(ING haRst) {
        this.haRst = haRst;
    }

    public ASG getPhStr() {
        return phStr;
    }

    public void setPhStr(ASG phStr) {
        this.phStr = phStr;
    }

    public ASG getPhStop() {
        return phStop;
    }

    public void setPhStop(ASG phStop) {
        this.phStop = phStop;
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

