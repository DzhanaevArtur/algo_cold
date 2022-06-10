package groupC;

import dataManagement.ASG;
import dataManagement.ENC;
import dataManagement.SPC;
import dataStatus.INS;
import dataStatus.SPS;
import dataValue.MV;
import logical.LN;

/*
 * CCGR (Cooling group control)
 * Управление группой охлаждения.
 */

public class CCGR extends LN {

    // Информация о статусе
    private INS OpTmh = new INS(); //  Время работы
    private SPS FanOvCur = new SPS(); //  Отключение вентилятора от перегрузки по току
    private SPS PmpOvCur = new SPS(); //  Отключение насоса от перегрузки по току
    private SPS PmpAlm = new SPS(); //  Потеря насоса

    // Измеренные значения
    private MV envTmp = new MV(); //  Температура окружающей среды
    private MV oilTmpIn = new MV(); //  Вход охладителя температуры масла
    private MV oilTmpOut = new MV(); //  Выход охладителя температуры масла
    private MV oilMotA = new MV(); //  Ток привода двигателя циркуляции масла
    private MV fanFlw = new MV(); //  Поток воздуха в вентиляторе
    private MV cETmpIn = new MV(); //  Вход температуры вторичной охлаждающей среды
    private MV cETmpOut = new MV(); //  Выход температуры вторичной охлаждающей среды
    private MV cEPres = new MV(); //  Давление вторичной охлаждающей среды
    private MV cEFlw = new MV(); //  Поток вторичной охлаждающей среды
    private MV fanA = new MV(); //  Вентилятор тока привода двигателя

    // Управление
    private SPC cEBlk = new SPC(); //  Управление автоматическим/ручным управлением
    private SPC cECtl = new SPC(); //  Управление всей группой охлаждения
    private ENC pmpCtlGen = new ENC(); //  Управление всеми насосами
    private ENC pmpCtl = new ENC(); //  Управление одним насосом
    private ENC fanCtlGen = new ENC(); //  Управление всеми вентиляторами
    private ENC fanCtl = new ENC(); //  Управление одним вентилятором
    private SPC auto = new SPC(); //  Автоматический или ручной

    // Настройки
    private ASG oilTmpSet = new ASG(0.0F); //  Заданное значение температуры масла

    public INS getOpTmh() {
        return OpTmh;
    }

    public void setOpTmh(INS opTmh) {
        OpTmh = opTmh;
    }

    public SPS getFanOvCur() {
        return FanOvCur;
    }

    public void setFanOvCur(SPS fanOvCur) {
        FanOvCur = fanOvCur;
    }

    public SPS getPmpOvCur() {
        return PmpOvCur;
    }

    public void setPmpOvCur(SPS pmpOvCur) {
        PmpOvCur = pmpOvCur;
    }

    public SPS getPmpAlm() {
        return PmpAlm;
    }

    public void setPmpAlm(SPS pmpAlm) {
        PmpAlm = pmpAlm;
    }

    public MV getEnvTmp() {
        return envTmp;
    }

    public void setEnvTmp(MV envTmp) {
        this.envTmp = envTmp;
    }

    public MV getOilTmpIn() {
        return oilTmpIn;
    }

    public void setOilTmpIn(MV oilTmpIn) {
        this.oilTmpIn = oilTmpIn;
    }

    public MV getOilTmpOut() {
        return oilTmpOut;
    }

    public void setOilTmpOut(MV oilTmpOut) {
        this.oilTmpOut = oilTmpOut;
    }

    public MV getOilMotA() {
        return oilMotA;
    }

    public void setOilMotA(MV oilMotA) {
        this.oilMotA = oilMotA;
    }

    public MV getFanFlw() {
        return fanFlw;
    }

    public void setFanFlw(MV fanFlw) {
        this.fanFlw = fanFlw;
    }

    public MV getcETmpIn() {
        return cETmpIn;
    }

    public void setcETmpIn(MV cETmpIn) {
        this.cETmpIn = cETmpIn;
    }

    public MV getcETmpOut() {
        return cETmpOut;
    }

    public void setcETmpOut(MV cETmpOut) {
        this.cETmpOut = cETmpOut;
    }

    public MV getcEPres() {
        return cEPres;
    }

    public void setcEPres(MV cEPres) {
        this.cEPres = cEPres;
    }

    public MV getcEFlw() {
        return cEFlw;
    }

    public void setcEFlw(MV cEFlw) {
        this.cEFlw = cEFlw;
    }

    public MV getFanA() {
        return fanA;
    }

    public void setFanA(MV fanA) {
        this.fanA = fanA;
    }

    public SPC getcEBlk() {
        return cEBlk;
    }

    public void setcEBlk(SPC cEBlk) {
        this.cEBlk = cEBlk;
    }

    public SPC getcECtl() {
        return cECtl;
    }

    public void setcECtl(SPC cECtl) {
        this.cECtl = cECtl;
    }

    public ENC getPmpCtlGen() {
        return pmpCtlGen;
    }

    public void setPmpCtlGen(ENC pmpCtlGen) {
        this.pmpCtlGen = pmpCtlGen;
    }

    public ENC getPmpCtl() {
        return pmpCtl;
    }

    public void setPmpCtl(ENC pmpCtl) {
        this.pmpCtl = pmpCtl;
    }

    public ENC getFanCtlGen() {
        return fanCtlGen;
    }

    public void setFanCtlGen(ENC fanCtlGen) {
        this.fanCtlGen = fanCtlGen;
    }

    public ENC getFanCtl() {
        return fanCtl;
    }

    public void setFanCtl(ENC fanCtl) {
        this.fanCtl = fanCtl;
    }

    public SPC getAuto() {
        return auto;
    }

    public void setAuto(SPC auto) {
        this.auto = auto;
    }

    public ASG getOilTmpSet() {
        return oilTmpSet;
    }

    public void setOilTmpSet(ASG oilTmpSet) {
        this.oilTmpSet = oilTmpSet;
    }

    @Override
    public void process() {

    }
}

