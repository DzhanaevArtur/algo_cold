package groupC;

import dataManagement.*;
import dataStatus.ENS;
import dataStatus.SPS;
import dataValue.MV;
import logical.LN;

/*
 * CSYN (Synchronizer controller)
 * Контроллер синхронизатора.
 */

public class CSYN extends LN {

    // Информация о статусе
    private SPS locKey = new SPS(); //  Локальный или удаленный ключ
    private SPS loc = new SPS(); //  Поведение локального управления
    private SPS cmd = new SPS(); //  Команда закрытия выключателя
    private SPS rel = new SPS(); //  Выпущена команда на закрытие выключателя
    private SPS rV = new SPS(); //  Повышение напряжения
    private SPS lV = new SPS(); //  Более низкое напряжение
    private SPS rHz = new SPS(); //  Увеличьте частоту (увеличьте скорость)
    private SPS lHz = new SPS(); //  Более низкая частота (более низкая скорость)
    private SPS vInd = new SPS(); //  Индикатор разности напряжений
    private SPS angInd = new SPS(); //  Индикатор разницы углов
    private SPS hzInd = new SPS(); //  Индикатор разности частот
    private ENS rotDir = new ENS(); //  Направление вращения

    // Измеренные значения
    private MV difVClc = new MV(); //  Рассчитанная разница в напряжении
    private MV difHzClc = new MV(); //  Рассчитанная разница в частоте
    private MV difAngClc = new MV(); //  Вычисленная разность фазового угла
    private MV v1Clc = new MV(); //  Значение амплитуды U1
    private MV v2Clc = new MV(); //  Значение амплитуды U2
    private MV hz1Clc = new MV(); //  Частота f1
    private MV hz2Clc = new MV(); //  Частота f2
    private MV accClc = new MV(); //  Ускорение
    private MV accClcDev = new MV(); //  Отклонение ускорения

    // Управление
    private INC opCntRs = new INC(); //  Сбрасываемый счетчик операций
    private SPC locSta = new SPC(); //  Полномочия по переключению на уровне станции
    private SPC synPrg = new SPC(); //  Запуск и остановка процесса синхронизации
    private SPC relDeaBus = new SPC(); //  Освобождение функции мертвой шины/ линии
    private ENC opModSyn = new ENC(); //  Выбор режима работы

    // Настройки
    private ASG vNom = new ASG(); //  Номинальное вторичное напряжение
    private ASG hzNom = new ASG(); //  Номинальная частота
    private ASG vAdpFact = new ASG(); //  Коэффициент адаптации U1/U2
    private ASG adpAngDeg = new ASG(); //  Угол адаптации
    private ING dlTmms = new ING(); //  Время контроля для распараллеливания
    private ASG mltCmd = new ASG(); //  Генерация нескольких команд
    private ASG difVNg = new ASG(); //  Разностное напряжение отрицательный
    private ASG difVPs = new ASG(); //  Разностное напряжение положительное
    private ASG difHzNg = new ASG(); //  Разностная частота отрицательный
    private ASG difHzPs = new ASG(); //  Разностная частота положительная
    private ASG difAngNg = new ASG(); //  Разностный фазовый угол отрицательный
    private ASG difAngPs = new ASG(); //  Разностный фазовый угол положительный
    private ASG minVSyn = new ASG(); //  Минимальное напряжение для синхронизации в режиме реального времени
    private ASG maxVSyn = new ASG(); //  Максимальное напряжение для синхронизации в режиме реального времени
    private ASG detSyn = new ASG(); //  Обнаружение синхронности (Δf)
    private ENG livDeaMod = new ENG(); //  Режим живых мертвецов
    private ASG deaLinVal = new ASG(); //  Значение мертвой линии
    private ASG livLinVal = new ASG(); //  Значение линии в реальном времени
    private ASG deaBusVal = new ASG(); //  Значение мертвой шины
    private ASG livBusVal = new ASG(); //  Значение шины в реальном времени
    private SPG vAdj = new SPG(); //  Включение/Выключение датчика соответствия напряжений
    private ASG vChr = new ASG(); //  Характеристика регулировки напряжения
    private ING vInvTmms = new ING(); //  Интервал импульсов регулировки напряжения
    private ING minVTmms = new ING(); //  Минимальное время импульса регулировки напряжения
    private ING maxVTmms = new ING(); //  Максимальное время импульса регулировки напряжения
    private SPG hzAdj = new SPG(); //  Включение/Выключение датчика частоты
    private ASG hzChr = new ASG(); //  Характеристика регулировки частоты
    private ING hzIntvTmms = new ING(); //  Интервал импульсов регулировки частоты
    private ING minHzTmms = new ING(); //  Минимальное время импульса регулировки частоты
    private ING maxHzTmms = new ING(); //  Максимальное время импульса регулировки частоты
    private ASG hzTgtVal = new ASG(); //  Целевое значение преобразователя частоты
    private SPG kckPls = new SPG(); //  Включение/выключение импульса кикера
    private ING dlSynTmms = new ING(); //  Задержка процесса синхронизации после сигнала запуска
    private ING totTmms = new ING(); //  Общее время процесса синхронизации

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

    public SPS getCmd() {
        return cmd;
    }

    public void setCmd(SPS cmd) {
        this.cmd = cmd;
    }

    public SPS getRel() {
        return rel;
    }

    public void setRel(SPS rel) {
        this.rel = rel;
    }

    public SPS getrV() {
        return rV;
    }

    public void setrV(SPS rV) {
        this.rV = rV;
    }

    public SPS getlV() {
        return lV;
    }

    public void setlV(SPS lV) {
        this.lV = lV;
    }

    public SPS getrHz() {
        return rHz;
    }

    public void setrHz(SPS rHz) {
        this.rHz = rHz;
    }

    public SPS getlHz() {
        return lHz;
    }

    public void setlHz(SPS lHz) {
        this.lHz = lHz;
    }

    public SPS getvInd() {
        return vInd;
    }

    public void setvInd(SPS vInd) {
        this.vInd = vInd;
    }

    public SPS getAngInd() {
        return angInd;
    }

    public void setAngInd(SPS angInd) {
        this.angInd = angInd;
    }

    public SPS getHzInd() {
        return hzInd;
    }

    public void setHzInd(SPS hzInd) {
        this.hzInd = hzInd;
    }

    public ENS getRotDir() {
        return rotDir;
    }

    public void setRotDir(ENS rotDir) {
        this.rotDir = rotDir;
    }

    public MV getDifVClc() {
        return difVClc;
    }

    public void setDifVClc(MV difVClc) {
        this.difVClc = difVClc;
    }

    public MV getDifHzClc() {
        return difHzClc;
    }

    public void setDifHzClc(MV difHzClc) {
        this.difHzClc = difHzClc;
    }

    public MV getDifAngClc() {
        return difAngClc;
    }

    public void setDifAngClc(MV difAngClc) {
        this.difAngClc = difAngClc;
    }

    public MV getV1Clc() {
        return v1Clc;
    }

    public void setV1Clc(MV v1Clc) {
        this.v1Clc = v1Clc;
    }

    public MV getV2Clc() {
        return v2Clc;
    }

    public void setV2Clc(MV v2Clc) {
        this.v2Clc = v2Clc;
    }

    public MV getHz1Clc() {
        return hz1Clc;
    }

    public void setHz1Clc(MV hz1Clc) {
        this.hz1Clc = hz1Clc;
    }

    public MV getHz2Clc() {
        return hz2Clc;
    }

    public void setHz2Clc(MV hz2Clc) {
        this.hz2Clc = hz2Clc;
    }

    public MV getAccClc() {
        return accClc;
    }

    public void setAccClc(MV accClc) {
        this.accClc = accClc;
    }

    public MV getAccClcDev() {
        return accClcDev;
    }

    public void setAccClcDev(MV accClcDev) {
        this.accClcDev = accClcDev;
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

    public SPC getSynPrg() {
        return synPrg;
    }

    public void setSynPrg(SPC synPrg) {
        this.synPrg = synPrg;
    }

    public SPC getRelDeaBus() {
        return relDeaBus;
    }

    public void setRelDeaBus(SPC relDeaBus) {
        this.relDeaBus = relDeaBus;
    }

    public ENC getOpModSyn() {
        return opModSyn;
    }

    public void setOpModSyn(ENC opModSyn) {
        this.opModSyn = opModSyn;
    }

    public ASG getvNom() {
        return vNom;
    }

    public void setvNom(ASG vNom) {
        this.vNom = vNom;
    }

    public ASG getHzNom() {
        return hzNom;
    }

    public void setHzNom(ASG hzNom) {
        this.hzNom = hzNom;
    }

    public ASG getvAdpFact() {
        return vAdpFact;
    }

    public void setvAdpFact(ASG vAdpFact) {
        this.vAdpFact = vAdpFact;
    }

    public ASG getAdpAngDeg() {
        return adpAngDeg;
    }

    public void setAdpAngDeg(ASG adpAngDeg) {
        this.adpAngDeg = adpAngDeg;
    }

    public ING getDlTmms() {
        return dlTmms;
    }

    public void setDlTmms(ING dlTmms) {
        this.dlTmms = dlTmms;
    }

    public ASG getMltCmd() {
        return mltCmd;
    }

    public void setMltCmd(ASG mltCmd) {
        this.mltCmd = mltCmd;
    }

    public ASG getDifVNg() {
        return difVNg;
    }

    public void setDifVNg(ASG difVNg) {
        this.difVNg = difVNg;
    }

    public ASG getDifVPs() {
        return difVPs;
    }

    public void setDifVPs(ASG difVPs) {
        this.difVPs = difVPs;
    }

    public ASG getDifHzNg() {
        return difHzNg;
    }

    public void setDifHzNg(ASG difHzNg) {
        this.difHzNg = difHzNg;
    }

    public ASG getDifHzPs() {
        return difHzPs;
    }

    public void setDifHzPs(ASG difHzPs) {
        this.difHzPs = difHzPs;
    }

    public ASG getDifAngNg() {
        return difAngNg;
    }

    public void setDifAngNg(ASG difAngNg) {
        this.difAngNg = difAngNg;
    }

    public ASG getDifAngPs() {
        return difAngPs;
    }

    public void setDifAngPs(ASG difAngPs) {
        this.difAngPs = difAngPs;
    }

    public ASG getMinVSyn() {
        return minVSyn;
    }

    public void setMinVSyn(ASG minVSyn) {
        this.minVSyn = minVSyn;
    }

    public ASG getMaxVSyn() {
        return maxVSyn;
    }

    public void setMaxVSyn(ASG maxVSyn) {
        this.maxVSyn = maxVSyn;
    }

    public ASG getDetSyn() {
        return detSyn;
    }

    public void setDetSyn(ASG detSyn) {
        this.detSyn = detSyn;
    }

    public ENG getLivDeaMod() {
        return livDeaMod;
    }

    public void setLivDeaMod(ENG livDeaMod) {
        this.livDeaMod = livDeaMod;
    }

    public ASG getDeaLinVal() {
        return deaLinVal;
    }

    public void setDeaLinVal(ASG deaLinVal) {
        this.deaLinVal = deaLinVal;
    }

    public ASG getLivLinVal() {
        return livLinVal;
    }

    public void setLivLinVal(ASG livLinVal) {
        this.livLinVal = livLinVal;
    }

    public ASG getDeaBusVal() {
        return deaBusVal;
    }

    public void setDeaBusVal(ASG deaBusVal) {
        this.deaBusVal = deaBusVal;
    }

    public ASG getLivBusVal() {
        return livBusVal;
    }

    public void setLivBusVal(ASG livBusVal) {
        this.livBusVal = livBusVal;
    }

    public SPG getvAdj() {
        return vAdj;
    }

    public void setvAdj(SPG vAdj) {
        this.vAdj = vAdj;
    }

    public ASG getvChr() {
        return vChr;
    }

    public void setvChr(ASG vChr) {
        this.vChr = vChr;
    }

    public ING getvInvTmms() {
        return vInvTmms;
    }

    public void setvInvTmms(ING vInvTmms) {
        this.vInvTmms = vInvTmms;
    }

    public ING getMinVTmms() {
        return minVTmms;
    }

    public void setMinVTmms(ING minVTmms) {
        this.minVTmms = minVTmms;
    }

    public ING getMaxVTmms() {
        return maxVTmms;
    }

    public void setMaxVTmms(ING maxVTmms) {
        this.maxVTmms = maxVTmms;
    }

    public SPG getHzAdj() {
        return hzAdj;
    }

    public void setHzAdj(SPG hzAdj) {
        this.hzAdj = hzAdj;
    }

    public ASG getHzChr() {
        return hzChr;
    }

    public void setHzChr(ASG hzChr) {
        this.hzChr = hzChr;
    }

    public ING getHzIntvTmms() {
        return hzIntvTmms;
    }

    public void setHzIntvTmms(ING hzIntvTmms) {
        this.hzIntvTmms = hzIntvTmms;
    }

    public ING getMinHzTmms() {
        return minHzTmms;
    }

    public void setMinHzTmms(ING minHzTmms) {
        this.minHzTmms = minHzTmms;
    }

    public ING getMaxHzTmms() {
        return maxHzTmms;
    }

    public void setMaxHzTmms(ING maxHzTmms) {
        this.maxHzTmms = maxHzTmms;
    }

    public ASG getHzTgtVal() {
        return hzTgtVal;
    }

    public void setHzTgtVal(ASG hzTgtVal) {
        this.hzTgtVal = hzTgtVal;
    }

    public SPG getKckPls() {
        return kckPls;
    }

    public void setKckPls(SPG kckPls) {
        this.kckPls = kckPls;
    }

    public ING getDlSynTmms() {
        return dlSynTmms;
    }

    public void setDlSynTmms(ING dlSynTmms) {
        this.dlSynTmms = dlSynTmms;
    }

    public ING getTotTmms() {
        return totTmms;
    }

    public void setTotTmms(ING totTmms) {
        this.totTmms = totTmms;
    }

    @Override
    public void process() {

    }
}

