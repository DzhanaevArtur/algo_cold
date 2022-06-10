package groupP;

import control.INC;
import dataManagement.ENG;
import dataManagement.ING;
import dataManagement.ORG;
import dataStatus.ACT;
import dataStatus.SPS;
import logical.LN;

/*
 * PSCH (Protection scheme)
 * Схема защиты.
 */

public class PSCH extends LN {

    // Информация о статусе
    private ACT txPrm = new ACT(); //  Разрешающая информация, подлежащая передаче на другую сторону
    private ACT txBlk = new ACT(); //  Блокирующая информация, подлежащая передаче на другую сторону
    private ACT txTr = new ACT(); //  Прямая информация, подлежащая передаче на другую сторону
    private ACT rxPrm1 = new ACT(); //  Информация об активации RxPrm1, полученная с другой стороны, для целей регистрации
    private ACT rxBlk1 = new ACT(); //  Информация об активации RxBlk1, полученная с другой стороны, для целей регистрации
    private ACT rxTr1 = new ACT(); //  Информация об активации RxTr1, полученная с другой стороны, для целей регистрации
    private ACT op = new ACT(); //  Срабатывание
    private SPS echoWei = new SPS(); //  Отправление Tx Prm в качестве эхо-сигнала
    private SPS echoWeiOp = new SPS(); //  Дополнительная индикация

    // Управление
    private INC opCntRs = new INC(); //  Сбрасываемый счетчик операций

    // Параметры настройки
    private ORG rxSrc1 = new ORG(); //  Источник информации об активации RxPrm или RxBlk, ссылается на ACT
    private ORG rxSrcTr1 = new ORG(); //  Источник информации об активации RxTr, ссылается на ACT
    private ING opDlTmms = new ING(0); //  Время задержки срабатывания
    private ING crdTmms = new ING(0); //  Таймер согласования для схемы блокировки
    private ING durTmms = new ING(0); //  Минимальная продолжительность TxPerm в случае срабатывания PSCH
    private ENG unBlkMod = new ENG(); //  Режим разблокировки функции для типа схемы
    private ING unBlkTmms = new ING(0); //  Время разблокировки
    private ENG weiMod = new ENG(); //  Режим функции подачи слабого конца
    private ING weiTmms = new ING(0); //  Время согласования для функции подачи слабого конца

    public ACT getTxPrm() {
        return txPrm;
    }

    public void setTxPrm(ACT txPrm) {
        this.txPrm = txPrm;
    }

    public ACT getTxBlk() {
        return txBlk;
    }

    public void setTxBlk(ACT txBlk) {
        this.txBlk = txBlk;
    }

    public ACT getTxTr() {
        return txTr;
    }

    public void setTxTr(ACT txTr) {
        this.txTr = txTr;
    }

    public ACT getRxPrm1() {
        return rxPrm1;
    }

    public void setRxPrm1(ACT rxPrm1) {
        this.rxPrm1 = rxPrm1;
    }

    public ACT getRxBlk1() {
        return rxBlk1;
    }

    public void setRxBlk1(ACT rxBlk1) {
        this.rxBlk1 = rxBlk1;
    }

    public ACT getRxTr1() {
        return rxTr1;
    }

    public void setRxTr1(ACT rxTr1) {
        this.rxTr1 = rxTr1;
    }

    public ACT getOp() {
        return op;
    }

    public void setOp(ACT op) {
        this.op = op;
    }

    public SPS getEchoWei() {
        return echoWei;
    }

    public void setEchoWei(SPS echoWei) {
        this.echoWei = echoWei;
    }

    public SPS getEchoWeiOp() {
        return echoWeiOp;
    }

    public void setEchoWeiOp(SPS echoWeiOp) {
        this.echoWeiOp = echoWeiOp;
    }

    public INC getOpCntRs() {
        return opCntRs;
    }

    public void setOpCntRs(INC opCntRs) {
        this.opCntRs = opCntRs;
    }

    public ORG getRxSrc1() {
        return rxSrc1;
    }

    public void setRxSrc1(ORG rxSrc1) {
        this.rxSrc1 = rxSrc1;
    }

    public ORG getRxSrcTr1() {
        return rxSrcTr1;
    }

    public void setRxSrcTr1(ORG rxSrcTr1) {
        this.rxSrcTr1 = rxSrcTr1;
    }

    public ING getOpDlTmms() {
        return opDlTmms;
    }

    public void setOpDlTmms(ING opDlTmms) {
        this.opDlTmms = opDlTmms;
    }

    public ING getCrdTmms() {
        return crdTmms;
    }

    public void setCrdTmms(ING crdTmms) {
        this.crdTmms = crdTmms;
    }

    public ING getDurTmms() {
        return durTmms;
    }

    public void setDurTmms(ING durTmms) {
        this.durTmms = durTmms;
    }

    public ENG getUnBlkMod() {
        return unBlkMod;
    }

    public void setUnBlkMod(ENG unBlkMod) {
        this.unBlkMod = unBlkMod;
    }

    public ING getUnBlkTmms() {
        return unBlkTmms;
    }

    public void setUnBlkTmms(ING unBlkTmms) {
        this.unBlkTmms = unBlkTmms;
    }

    public ENG getWeiMod() {
        return weiMod;
    }

    public void setWeiMod(ENG weiMod) {
        this.weiMod = weiMod;
    }

    public ING getWeiTmms() {
        return weiTmms;
    }

    public void setWeiTmms(ING weiTmms) {
        this.weiTmms = weiTmms;
    }

    @Override
    public void process() {

    }
}