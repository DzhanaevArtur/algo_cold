package groupP;

import control.INC;
import dataManagement.ASG;
import dataManagement.ING;
import dataStatus.ACD;
import dataStatus.ACT;
import logical.LN;

/*
 * PMRI (Motor restart inhibition)
 * От торможения повторного запуска двигателя.
 */

public class PMRI extends LN {

    // Информация о статусе
    private ACD str = new ACD(); //  Пуск
    private ACT op = new ACT(); //  Срабатывание
    private INC strInhTmm = new INC(); //  Сбрасываемый счетчик операций

    // Управление
    private INC opCntRs = new INC(); //  Сбрасываемый счетчик операций

    // Параметры настройки
    private ASG setA = new ASG(0.0F); //  Настройка тока для запуска двигателя
    private ING setTms = new ING(0); //  Установка времени для запуска двигателя
    private ING maxNumStr = new ING(0); //  Максимальное количество запусков
    private ING maxWrmStr = new ING(0); //  Максимальное количество запусков прогрева
    private ING maxStrTmm = new ING(0); //  Период времени для максимального количества запусков
    private ING eqTmm = new ING(0); //  Время выравнивания температуры
    private ING inhTmm = new ING(0); //  Время запрета перезапуска

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

    public INC getStrInhTmm() {
        return strInhTmm;
    }

    public void setStrInhTmm(INC strInhTmm) {
        this.strInhTmm = strInhTmm;
    }

    public INC getOpCntRs() {
        return opCntRs;
    }

    public void setOpCntRs(INC opCntRs) {
        this.opCntRs = opCntRs;
    }

    public ASG getSetA() {
        return setA;
    }

    public void setSetA(ASG setA) {
        this.setA = setA;
    }

    public ING getSetTms() {
        return setTms;
    }

    public void setSetTms(ING setTms) {
        this.setTms = setTms;
    }

    public ING getMaxNumStr() {
        return maxNumStr;
    }

    public void setMaxNumStr(ING maxNumStr) {
        this.maxNumStr = maxNumStr;
    }

    public ING getMaxWrmStr() {
        return maxWrmStr;
    }

    public void setMaxWrmStr(ING maxWrmStr) {
        this.maxWrmStr = maxWrmStr;
    }

    public ING getMaxStrTmm() {
        return maxStrTmm;
    }

    public void setMaxStrTmm(ING maxStrTmm) {
        this.maxStrTmm = maxStrTmm;
    }

    public ING getEqTmm() {
        return eqTmm;
    }

    public void setEqTmm(ING eqTmm) {
        this.eqTmm = eqTmm;
    }

    public ING getInhTmm() {
        return inhTmm;
    }

    public void setInhTmm(ING inhTmm) {
        this.inhTmm = inhTmm;
    }

    @Override
    public void process() {

    }
}