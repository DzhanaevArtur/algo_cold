package groupC;

import dataManagement.*;
import dataStatus.ACT;
import dataStatus.SPS;
import logical.LN;

/*
 * CPOW (Point-on-wave switching)
 * Переключение "точка-на-волне".
 */

public class CPOW extends LN {

    // Информация о статусе
    private SPS tmExc = new SPS(); //  Превышено максимально допустимое время
    private SPS strPOW = new SPS(); //  CPOW начался
    private ACT opOpn = new ACT(); //  Разомкнутый выключатель
    private ACT opCls = new ACT(); //  Закрыть выключатель

    // Управление
    private DPC pos = new DPC(); //  Переключатель, общий
    private DPC posA = new DPC(); //  Переключатель L1
    private DPC posB = new DPC(); //  Переключатель L2
    private DPC posC = new DPC(); //  Переключатель L3

    // Настройки
    private ING maxDlTmms = new ING(0); //  Максимально допустимое время задержки

    public SPS getTmExc() {
        return tmExc;
    }

    public void setTmExc(SPS tmExc) {
        this.tmExc = tmExc;
    }

    public SPS getStrPOW() {
        return strPOW;
    }

    public void setStrPOW(SPS strPOW) {
        this.strPOW = strPOW;
    }

    public ACT getOpOpn() {
        return opOpn;
    }

    public void setOpOpn(ACT opOpn) {
        this.opOpn = opOpn;
    }

    public ACT getOpCls() {
        return opCls;
    }

    public void setOpCls(ACT opCls) {
        this.opCls = opCls;
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

    public ING getMaxDlTmms() {
        return maxDlTmms;
    }

    public void setMaxDlTmms(ING maxDlTmms) {
        this.maxDlTmms = maxDlTmms;
    }

    @Override
    public void process() {

    }
}

