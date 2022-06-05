package groupX;

import dataDescription.DPL;
import dataManagement.DPC;
import dataManagement.ING;
import dataManagement.SPC;
import dataStatus.BCR;
import dataStatus.ENS;
import dataStatus.INS;
import dataStatus.SPS;
import logical.LN;

/*
 * XCBR (Circuit breaker)
 * Автоматический выключатель.
 */

public class XCBR extends LN {

    // Описание
    private DPL eEName = new DPL(); //  Заводская табличка внешнего оборудования

    // Информация о статусе
    private ENS eEHealth = new ENS(); //  Состояние внешнего оборудования
    private SPS locKey = new SPS(); //  Локальный или удаленный ключ
    private SPS loc = new SPS(); //  Поведение локального управления
    private INS opCnt = new INS(); //  Счетчик операций
    private ENS cBOpCap = new ENS(); //  Возможность работы автоматического выключателя
    private ENS pOWCap = new ENS(); //  Точка на возможности переключения волн
    private INS maxOpCap = new INS(); //  Возможность работы автоматического выключателя при полной зарядке
    private SPS dsc = new SPS(); //  Несоответствие

    // Измеренные значения
    private BCR sumSwARs = new BCR(); //  Сумма переключаемых ампер с возможностью сброса

    // Управление
    private SPC locSta = new SPC(); //  Полномочия по переключению на уровне станции
    private DPC pos = new DPC(); //  Положение переключателя
    private SPC blkOpn = new SPC(); //  Блок открытия
    private SPC blkCls = new SPC(); //  Закрытие блока
    private SPC chaMotEna = new SPC(); //  Двигатель зарядного устройства включен

    // Настройки
    private ING cBTmms = new ING(); //  Время закрытия выключателя

    public DPL geteEName() {
        return eEName;
    }

    public void seteEName(DPL eEName) {
        this.eEName = eEName;
    }

    public ENS geteEHealth() {
        return eEHealth;
    }

    public void seteEHealth(ENS eEHealth) {
        this.eEHealth = eEHealth;
    }

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

    public INS getOpCnt() {
        return opCnt;
    }

    public void setOpCnt(INS opCnt) {
        this.opCnt = opCnt;
    }

    public ENS getcBOpCap() {
        return cBOpCap;
    }

    public void setcBOpCap(ENS cBOpCap) {
        this.cBOpCap = cBOpCap;
    }

    public ENS getpOWCap() {
        return pOWCap;
    }

    public void setpOWCap(ENS pOWCap) {
        this.pOWCap = pOWCap;
    }

    public INS getMaxOpCap() {
        return maxOpCap;
    }

    public void setMaxOpCap(INS maxOpCap) {
        this.maxOpCap = maxOpCap;
    }

    public SPS getDsc() {
        return dsc;
    }

    public void setDsc(SPS dsc) {
        this.dsc = dsc;
    }

    public BCR getSumSwARs() {
        return sumSwARs;
    }

    public void setSumSwARs(BCR sumSwARs) {
        this.sumSwARs = sumSwARs;
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

    public SPC getBlkOpn() {
        return blkOpn;
    }

    public void setBlkOpn(SPC blkOpn) {
        this.blkOpn = blkOpn;
    }

    public SPC getBlkCls() {
        return blkCls;
    }

    public void setBlkCls(SPC blkCls) {
        this.blkCls = blkCls;
    }

    public SPC getChaMotEna() {
        return chaMotEna;
    }

    public void setChaMotEna(SPC chaMotEna) {
        this.chaMotEna = chaMotEna;
    }

    public ING getcBTmms() {
        return cBTmms;
    }

    public void setcBTmms(ING cBTmms) {
        this.cBTmms = cBTmms;
    }

    @Override
    public void process() {

    }
}
