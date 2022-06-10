package groupP;

import control.INC;
import dataDescription.CSD;
import dataManagement.ASG;
import dataManagement.CSG;
import dataManagement.CURVE;
import dataManagement.ING;
import dataStatus.ACD;
import dataStatus.ACT;
import dataValue.WYE;
import logical.LN;

/*
 * PDIF (Differential)
 * Дифференциальная.
 */

public class PDIF extends LN {

    // Информация о статусе
    private ACD str = new ACD(); //  Пуск
    private ACT op = new ACT(); //  Срабатывание
    private CSD tmASt = new CSD(); //  Динамические характеристики кривой

    // Измеренные значения
    private WYE difACIc = new WYE(); //  Дифференциальный ток
    private WYE rstA = new WYE(); //  Ограничение по току

    // Управление
    private INC opCntRs = new INC(); //  Счетчик числа переключений со сбросом

    // Параметры настройки
    private ASG linCapac = new ASG(0.0F); //  Емкость линии (для токов нагрузки)
    private ING loSet = new ING(0); //  Нижний порог срабатывания, процент номинального тока
    private ING hiSet = new ING(0); //  Верхний порог срабатывания, процент номинального тока
    private ING minOpTmms = new ING(0); //  Минимальное время срабатывания
    private ING maxOpTmms = new ING(0); //  Максимальное время срабатывания
    private ING rstMod = new ING(0); //  Режим ограничения
    private ING rsDITmms = new ING(0); //  Время задержки сброса
    private CURVE tmACrv = new CURVE(); //  Тип графика рабочих характеристик
    private CSG tmAChr33 = new CSG(); //  Определение характеристик многострочной кривой

    public INC getOpCntRs() {
        return opCntRs;
    }

    public void setOpCntRs(INC opCntRs) {
        this.opCntRs = opCntRs;
    }

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

    public CSD getTmASt() {
        return tmASt;
    }

    public void setTmASt(CSD tmASt) {
        this.tmASt = tmASt;
    }

    public WYE getDifACIc() {
        return difACIc;
    }

    public void setDifACIc(WYE difACIc) {
        this.difACIc = difACIc;
    }

    public WYE getRstA() {
        return rstA;
    }

    public void setRstA(WYE rstA) {
        this.rstA = rstA;
    }

    public ASG getLinCapac() {
        return linCapac;
    }

    public void setLinCapac(ASG linCapac) {
        this.linCapac = linCapac;
    }

    public ING getLoSet() {
        return loSet;
    }

    public void setLoSet(ING loSet) {
        this.loSet = loSet;
    }

    public ING getHiSet() {
        return hiSet;
    }

    public void setHiSet(ING hiSet) {
        this.hiSet = hiSet;
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

    public ING getRstMod() {
        return rstMod;
    }

    public void setRstMod(ING rstMod) {
        this.rstMod = rstMod;
    }

    public ING getRsDITmms() {
        return rsDITmms;
    }

    public void setRsDITmms(ING rsDITmms) {
        this.rsDITmms = rsDITmms;
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

    @Override
    public void process() {

    }
}
