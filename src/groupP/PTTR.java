package groupP;

import control.INC;
import dataDescription.CSD;
import dataManagement.ASG;
import dataManagement.CSG;
import dataManagement.CURVE;
import dataManagement.ING;
import dataStatus.ACD;
import dataStatus.ACT;
import dataStatus.SPS;
import dataValue.MV;
import dataValue.WYE;
import logical.LN;

/*
 * PTTR (Thermal overload)
 * Тепловая перегрузка.
 */

public class PTTR extends LN {

    // Информация о статусе
    private ACD str = new ACD(); //  Пуск
    private ACT op = new ACT(); //  Срабатывание
    private SPS almThm = new SPS(); //  Тепловая сигнализация
    private SPS blkThm = new SPS(); //  Команда отключения блока для АВ

    // Измеренные значения
    private MV amp = new MV(); //  Ток для модели тепловой нагрузки
    private MV tmp = new MV(); //  Температура для тепловой нагрузки
    private MV tmpRl = new MV(); //  Соотношение между температурой и максимальной температурой
    private MV lodRsvAlm = new MV(); //  Резерв нагрузки для сигнализации
    private MV lodRsvTr = new MV(); //  Запас нагрузки до отключения


    // Управление
    private INC opCntRs = new INC(); //  Счетчик числа переключений со сбросом

    // Параметры настройки
    private CURVE tmTmpCrv = new CURVE(); //  Характеристическая кривая для измерения температуры
    private CSG tmTmpChr33 = new CSG(); //  Определение характеристик многострочной кривой
    private CURVE tmACrv = new CURVE(); //  Характеристическая кривая для измерения тока
    private CSG tmAChr33 = new CSG(); //  Определение характеристик многострочной кривой
    private CSD tmTmpSt = new CSD(); //  Характеристика активной кривой
    private CSD tmASt = new CSD(); //  Характеристика активной кривой
    private ASG tmpMax = new ASG(); //  Максимально допустимая температура
    private ASG strVal = new ASG(); //  Начальное значение
    private ING opDlTmms = new ING(); //  Время задержки срабатывания
    private ING minOpTmms = new ING(); //  Минимальное время работы
    private ING maxOpTmms = new ING(); //  Максимальное время работы
    private ING rsDlTmms = new ING(); //  Время задержки сброса
    private ING consTms1 = new ING(); //  Постоянная времени тепловой модели
    private ASG almVal = new ASG(); //  Значение сигнала тревоги
    private ASG dropoutVal = new ASG(); //  Выпадающее значение для команды блокировки закрытия

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

    public SPS getAlmThm() {
        return almThm;
    }

    public void setAlmThm(SPS almThm) {
        this.almThm = almThm;
    }

    public SPS getBlkThm() {
        return blkThm;
    }

    public void setBlkThm(SPS blkThm) {
        this.blkThm = blkThm;
    }

    public MV getAmp() {
        return amp;
    }

    public void setAmp(MV amp) {
        this.amp = amp;
    }

    public MV getTmp() {
        return tmp;
    }

    public void setTmp(MV tmp) {
        this.tmp = tmp;
    }

    public MV getTmpRl() {
        return tmpRl;
    }

    public void setTmpRl(MV tmpRl) {
        this.tmpRl = tmpRl;
    }

    public MV getLodRsvAlm() {
        return lodRsvAlm;
    }

    public void setLodRsvAlm(MV lodRsvAlm) {
        this.lodRsvAlm = lodRsvAlm;
    }

    public MV getLodRsvTr() {
        return lodRsvTr;
    }

    public void setLodRsvTr(MV lodRsvTr) {
        this.lodRsvTr = lodRsvTr;
    }

    public INC getOpCntRs() {
        return opCntRs;
    }

    public void setOpCntRs(INC opCntRs) {
        this.opCntRs = opCntRs;
    }

    public CURVE getTmTmpCrv() {
        return tmTmpCrv;
    }

    public void setTmTmpCrv(CURVE tmTmpCrv) {
        this.tmTmpCrv = tmTmpCrv;
    }

    public CSG getTmTmpChr33() {
        return tmTmpChr33;
    }

    public void setTmTmpChr33(CSG tmTmpChr33) {
        this.tmTmpChr33 = tmTmpChr33;
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

    public CSD getTmTmpSt() {
        return tmTmpSt;
    }

    public void setTmTmpSt(CSD tmTmpSt) {
        this.tmTmpSt = tmTmpSt;
    }

    public CSD getTmASt() {
        return tmASt;
    }

    public void setTmASt(CSD tmASt) {
        this.tmASt = tmASt;
    }

    public ASG getTmpMax() {
        return tmpMax;
    }

    public void setTmpMax(ASG tmpMax) {
        this.tmpMax = tmpMax;
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

    public ING getRsDlTmms() {
        return rsDlTmms;
    }

    public void setRsDlTmms(ING rsDlTmms) {
        this.rsDlTmms = rsDlTmms;
    }

    public ING getConsTms1() {
        return consTms1;
    }

    public void setConsTms1(ING consTms1) {
        this.consTms1 = consTms1;
    }

    public ASG getAlmVal() {
        return almVal;
    }

    public void setAlmVal(ASG almVal) {
        this.almVal = almVal;
    }

    public ASG getDropoutVal() {
        return dropoutVal;
    }

    public void setDropoutVal(ASG dropoutVal) {
        this.dropoutVal = dropoutVal;
    }

    @Override
    public void process() {

    }
}
