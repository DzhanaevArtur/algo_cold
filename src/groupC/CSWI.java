package groupC;

import dataManagement.*;
import dataStatus.ACT;
import dataStatus.SPS;
import logical.LN;

/*
 * CSWI (Switch controller)
 * Контроллер переключателя.
 */

public class CSWI extends LN {

    // Информация о статусе
    private SPS locKey = new SPS(); //  Локальный или удаленный ключ
    private SPS loc = new SPS(); //  Поведение локального управления
    private ACT opOpn = new ACT(); //  Операция “Разомкнуть выключатель”
    private SPS selOpn = new SPS(); //  Выбор “Разомкнутый выключатель”
    private ACT opCls = new ACT(); //  Операция “Закрыть выключатель”
    private SPS selCls = new SPS(); //  Выбор “Закрыть переключатель”

    // Управление
    private INC opCntRs = new INC(); //  Сбрасываемый счетчик операций
    private SPC locSta = new SPC(); //  Полномочия по переключению на уровне станции
    private DPC pos = new DPC(); //  Переключатель, общий
    private DPC posA = new DPC(); //  Переключатель L1
    private DPC posB = new DPC(); //  Переключатель L2
    private DPC posC = new DPC(); //  Переключатель L3

    public SPS getLocKey() {
        return locKey;
    }

    public void setLocKey(SPS locKey) {
        this.locKey = locKey;
    }

    public SPS getLoc() {
        return loc;
    }

    public void setLoc(SPS loc) {
        this.loc = loc;
    }

    public ACT getOpOpn() {
        return opOpn;
    }

    public void setOpOpn(ACT opOpn) {
        this.opOpn = opOpn;
    }

    public SPS getSelOpn() {
        return selOpn;
    }

    public void setSelOpn(SPS selOpn) {
        this.selOpn = selOpn;
    }

    public ACT getOpCls() {
        return opCls;
    }

    public void setOpCls(ACT opCls) {
        this.opCls = opCls;
    }

    public SPS getSelCls() {
        return selCls;
    }

    public void setSelCls(SPS selCls) {
        this.selCls = selCls;
    }

    public INC getOpCntRs() {
        return opCntRs;
    }

    public void setOpCntRs(INC opCntRs) {
        this.opCntRs = opCntRs;
    }

    public SPC getLocSta() {
        return locSta;
    }

    public void setLocSta(SPC locSta) {
        this.locSta = locSta;
    }

    public DPC getPos() {
        return pos;
    }

    public void setPos(DPC pos) {
        this.pos = pos;
    }

    public DPC getPosA() {
        return posA;
    }

    public void setPosA(DPC posA) {
        this.posA = posA;
    }

    public DPC getPosB() {
        return posB;
    }

    public void setPosB(DPC posB) {
        this.posB = posB;
    }

    public DPC getPosC() {
        return posC;
    }

    public void setPosC(DPC posC) {
        this.posC = posC;
    }

    @Override
    public void process() {

    }
}

