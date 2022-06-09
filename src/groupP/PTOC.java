package groupP;

import control.INC;
import dataDescription.CSD;
import dataManagement.*;
import dataStatus.ACD;
import dataStatus.ACT;
import dataValue.WYE;
import logical.LN;

/*
 * PTOC (Time overcurrent)
 * Время перегрузки по току.
 */

public class PTOC extends LN {

    private WYE a = new WYE();

    // Информация о статусе
    private ACD str = new ACD(); //  Пуск
    private ACT op = new ACT(); //  Срабатывание

    // Управление
    private INC opCntRs = new INC(); //  Счетчик числа переключений со сбросом

    // Параметры настройки
    private CURVE tmACrv = new CURVE(); //  Тип рабочей кривой
    private CSG tmAChr33 = new CSG(); //  Определение характеристик многострочной кривой
    private CSD tmASt = new CSD(); //  Характеристика активной кривой
    private Float strVal = 0.0f; //  Начальное значение
    private ASG tmMult = new ASG(); //  Множитель набора времени
    private ING minOpTmms = new ING(); //  Минимальное время работы
    private ING maxOpTmms = new ING(); //  Максимальное время работы
    private ING opDlTmms = new ING(); //  Время задержки срабатывания
    private ENG typRsCrv = new ENG(); //  Тип кривой сброса
    private ING rsDlTmms = new ING(); //  Время задержки сброса
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

    public Float getStrVal() {
        return strVal;
    }

    public void setStrVal(float strVal) {
        this.strVal = strVal;
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

    public ING getOpDlTmms() {
        return opDlTmms;
    }

    public void setOpDlTmms(ING opDlTmms) {
        this.opDlTmms = opDlTmms;
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

    public WYE getA() {
        return a;
    }

    public void setA(WYE a) {
        this.a = a;
    }

    @Override
    public void process() {

    }
}
