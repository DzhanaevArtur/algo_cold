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
 * PTRC (Protection trip conditioning)
 * Подключение выходов operate одной или
 * нескольких функций защиты к общему отключению,
 * передаваемому на XCBR.
 */

public class PTRC extends LN {

    // Информация о статусе
    private ACT tr = new ACT(); //  Срабатывание
    private ACT op = new ACT(); //  Срабатывание
    private ACD str = new ACD(); //  Пуск

    // Информация об общих логических узлах
    private INC opCntRs = new INC(); //  Счетчик числа переключений со сбросом

    // Параметры настройки
    private ENG trMod = new ENG(); //  Режим отключения
    private ING trPlsTmms = new ING(); //  Время импульса отключения

    public ACT getTr() {
        return tr;
    }

    public void setTr(ACT tr) {
        this.tr = tr;
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

    public INC getOpCntRs() {
        return opCntRs;
    }

    public void setOpCntRs(INC opCntRs) {
        this.opCntRs = opCntRs;
    }

    public ENG getTrMod() {
        return trMod;
    }

    public void setTrMod(ENG trMod) {
        this.trMod = trMod;
    }

    public ING getTrPlsTmms() {
        return trPlsTmms;
    }

    public void setTrPlsTmms(ING trPlsTmms) {
        this.trPlsTmms = trPlsTmms;
    }

    @Override
    public void process() {

    }
}
