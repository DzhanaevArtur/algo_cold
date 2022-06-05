package groupP;

import control.INC;
import dataDescription.CSD;
import dataManagement.*;
import dataStatus.ACD;
import dataStatus.ACT;
import dataValue.WYE;
import logical.LN;

/*
 * PDIS (Distance)
 * Дисанционная.
 */

public class PDIS extends LN {

    // Информация о статусе
    private ACD str = new ACD(); //  Пуск
    private ACT op = new ACT(); //  Срабатывание

    // Управление
    private INC opCntRs = new INC(); //  Сбрасываемый счетчик операций

    // Параметры настройки
    private ASG poRch = new ASG(); //  Полярный охват - это диаметр диаграммы Mho
    private ASG phStr = new ASG(); //  Начальное значение фазы
    private ASG gndStr = new ASG(); //  Начальное значение заземления
    private ENG dirMod = new ENG(); //  Направленный режим
    private ASG pctRch = new ASG(); //  Процентный охват
    private ASG ofs = new ASG(); //  Смещение
    private ASG PctOfs = new ASG(); //  Процентное смещение
    private ASG risLod = new ASG(); //  Резистивный охват для зоны нагрузки
    private ASG angLod = new ASG(); //  Угол для зоны нагрузки
    private SPG tmDlMod = new SPG(); //  Режим временной задержки работы
    private ING opDlTmms = new ING(); //  Задержка по времени срабатывания
    private SPG phDlMod = new SPG(); //  Работать в многофазном режиме с временной задержкой
    private ING phDlTmms = new ING(); //  Задержка срабатывания при многофазных неисправностях
    private SPG gndDlMod = new SPG(); //  Задержка срабатывания для однофазного режима заземления
    private ING gndDlTmms = new ING(); //  Задержка срабатывания при однофазных замыканиях на землю
    private ASG x1 = new ASG(); //  Реактивное сопротивление линии положительной последовательности (reach)
    private ASG linAng = new ASG(); //  Угол наклона линии
    private ASG risGndRch = new ASG(); //  Резистивный охват заземления
    private ASG risPhRch = new ASG(); //  Резистивный фазовый охват
    private ASG k0Fact = new ASG(); //  Коэффициент остаточной компенсации K0
    private ASG k0FactAng = new ASG(); //  Угол коэффициента остаточной компенсации
    private ING rsDlTmms = new ING(); //  Задержка по времени сброса

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

    public ASG getPoRch() {
        return poRch;
    }

    public void setPoRch(ASG poRch) {
        this.poRch = poRch;
    }

    public ASG getPhStr() {
        return phStr;
    }

    public void setPhStr(ASG phStr) {
        this.phStr = phStr;
    }

    public ASG getGndStr() {
        return gndStr;
    }

    public void setGndStr(ASG gndStr) {
        this.gndStr = gndStr;
    }

    public ENG getDirMod() {
        return dirMod;
    }

    public void setDirMod(ENG dirMod) {
        this.dirMod = dirMod;
    }

    public ASG getPctRch() {
        return pctRch;
    }

    public void setPctRch(ASG pctRch) {
        this.pctRch = pctRch;
    }

    public ASG getOfs() {
        return ofs;
    }

    public void setOfs(ASG ofs) {
        this.ofs = ofs;
    }

    public ASG getPctOfs() {
        return PctOfs;
    }

    public void setPctOfs(ASG pctOfs) {
        PctOfs = pctOfs;
    }

    public ASG getRisLod() {
        return risLod;
    }

    public void setRisLod(ASG risLod) {
        this.risLod = risLod;
    }

    public ASG getAngLod() {
        return angLod;
    }

    public void setAngLod(ASG angLod) {
        this.angLod = angLod;
    }

    public SPG getTmDlMod() {
        return tmDlMod;
    }

    public void setTmDlMod(SPG tmDlMod) {
        this.tmDlMod = tmDlMod;
    }

    public ING getOpDlTmms() {
        return opDlTmms;
    }

    public void setOpDlTmms(ING opDlTmms) {
        this.opDlTmms = opDlTmms;
    }

    public SPG getPhDlMod() {
        return phDlMod;
    }

    public void setPhDlMod(SPG phDlMod) {
        this.phDlMod = phDlMod;
    }

    public ING getPhDlTmms() {
        return phDlTmms;
    }

    public void setPhDlTmms(ING phDlTmms) {
        this.phDlTmms = phDlTmms;
    }

    public SPG getGndDlMod() {
        return gndDlMod;
    }

    public void setGndDlMod(SPG gndDlMod) {
        this.gndDlMod = gndDlMod;
    }

    public ING getGndDlTmms() {
        return gndDlTmms;
    }

    public void setGndDlTmms(ING gndDlTmms) {
        this.gndDlTmms = gndDlTmms;
    }

    public ASG getX1() {
        return x1;
    }

    public void setX1(ASG x1) {
        this.x1 = x1;
    }

    public ASG getLinAng() {
        return linAng;
    }

    public void setLinAng(ASG linAng) {
        this.linAng = linAng;
    }

    public ASG getRisGndRch() {
        return risGndRch;
    }

    public void setRisGndRch(ASG risGndRch) {
        this.risGndRch = risGndRch;
    }

    public ASG getRisPhRch() {
        return risPhRch;
    }

    public void setRisPhRch(ASG risPhRch) {
        this.risPhRch = risPhRch;
    }

    public ASG getK0Fact() {
        return k0Fact;
    }

    public void setK0Fact(ASG k0Fact) {
        this.k0Fact = k0Fact;
    }

    public ASG getK0FactAng() {
        return k0FactAng;
    }

    public void setK0FactAng(ASG k0FactAng) {
        this.k0FactAng = k0FactAng;
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
