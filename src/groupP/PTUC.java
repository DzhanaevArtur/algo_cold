package groupP;

import control.INC;
import dataDescription.CSD;
import dataManagement.*;
import dataStatus.ACD;
import dataStatus.ACT;
import logical.LN;

/*
 * PTUC (Undercurrent)
 * Пониженный ток.
 */

public class PTUC extends LN {

    // Информация о статусе
    private ACD str = new ACD(); //  Пуск
    private ACT op = new ACT(); //  Срабатывание

    // Управление
    private INC opCntRs = new INC(); //  Счетчик числа переключений со сбросом

    // Параметры настройки
    private CURVE tmACrv = new CURVE(); //  Тип рабочей кривой
    private CSG tmAChr33 = new CSG(); //  Определение характеристик многострочной кривой
    private CSD tmASt = new CSD(); //  Характеристика активной кривой
    private ASG strVal = new ASG(0.0F); //  Начальное значение
    private ING opDlTmms = new ING(0); //  Время задержки срабатывания
    private ASG tmMult = new ASG(0.0F); //  Множитель набора времени
    private ING minOpTmms = new ING(0); //  Минимальное время работы
    private ING maxOpTmms = new ING(0); //  Максимальное время работы
    private ENG typRsCrv = new ENG(); //  Тип кривой сброса
    private ING rsDlTmms = new ING(0); //  Время задержки сброса
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

    public CURVE getTmACrv() {
        return tmACrv;
    }

    public void setTmACrv(CURVE tmACrv) {
        this.tmACrv = tmACrv;
    }

    public CSG getTmAChr33() {
        return tmAChr33;
    }

    public void setTmAChr33(CSG tmAChr33) {
        this.tmAChr33 = tmAChr33;
    }

    public CSD getTmASt() {
        return tmASt;
    }

    public void setTmASt(CSD tmASt) {
        this.tmASt = tmASt;
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

    public ASG getTmMult() {
        return tmMult;
    }

    public void setTmMult(ASG tmMult) {
        this.tmMult = tmMult;
    }

    public ING getMinOpTmms() {
        return minOpTmms;
    }

    public void setMinOpTmms(ING minOpTmms) {
        this.minOpTmms = minOpTmms;
    }

    public ING getMaxOpTmms() {
        return maxOpTmms;
    }

    public void setMaxOpTmms(ING maxOpTmms) {
        this.maxOpTmms = maxOpTmms;
    }

    public ENG getTypRsCrv() {
        return typRsCrv;
    }

    public void setTypRsCrv(ENG typRsCrv) {
        this.typRsCrv = typRsCrv;
    }

    public ING getRsDlTmms() {
        return rsDlTmms;
    }

    public void setRsDlTmms(ING rsDlTmms) {
        this.rsDlTmms = rsDlTmms;
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
