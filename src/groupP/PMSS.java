package groupP;

import control.INC;
import dataManagement.ASG;
import dataManagement.ING;
import dataStatus.ACD;
import dataStatus.ACT;
import logical.LN;

/*
 * PMSS (Motor starting time supervision)
 * От контроля времени запуска двигателя.
 */

public class PMSS extends LN {

    // Информация о статусе
    private ACD str = new ACD(); //  Пуск
    private ACT op = new ACT(); //  Срабатывание

    // Управление
    private INC opCntRs = new INC(); //  Сбрасываемый счетчик операций

    // Параметры настройки
    private ASG setA = new ASG(0.0F); //  Настройка тока для запуска двигателя
    private ING setTms = new ING(0); //  Установка времени для запуска двигателя
    private ASG motStr = new ASG(0.0F); //  Запуск двигателя
    private ING lokRotTms = new ING(0); //  Время блокировки ротора

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

    public ASG getMotStr() {
        return motStr;
    }

    public void setMotStr(ASG motStr) {
        this.motStr = motStr;
    }

    public ING getLokRotTms() {
        return lokRotTms;
    }

    public void setLokRotTms(ING lokRotTms) {
        this.lokRotTms = lokRotTms;
    }

    @Override
    public void process() {

    }
}