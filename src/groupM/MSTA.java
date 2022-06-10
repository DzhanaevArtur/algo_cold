package groupM;

import dataDescription.DPL;
import dataManagement.ASG;
import dataManagement.SPC;
import dataStatus.INS;
import dataValue.*;
import logical.LN;

/*
 * MSTA (Taking readings for statistics measurements)
 * Снятие показаний для статистики
 */

public class MSTA extends LN {

// Информация об общих логических узлах
    private INS eEHealth = new INS();
    private DPL eEName = new DPL();

// Измеренные значения
    private MV avAmps = new MV();
    private MV maxAmps = new MV();
    private MV minAmps = new MV();
    private MV avVolts = new MV();
    private MV maxVolts = new MV();
    private MV minVolts = new MV();
    private MV avVA = new MV();
    private MV maxVA = new MV();
    private MV minVA = new MV();
    private MV avW = new MV();
    private MV maxW = new MV();
    private MV minW = new MV();
    private MV avVAr = new MV();
    private MV maxVAr = new MV();
    private MV minVAr = new MV();

// Данные по управлению
    private SPC evStr = new SPC();

// Параметры настройки
    private ASG evTmms = new ASG(0.0F);

    public INS geteEHealth() {
        return eEHealth;
    }

    public void seteEHealth(INS eEHealth) {
        this.eEHealth = eEHealth;
    }

    public DPL geteEName() {
        return eEName;
    }

    public void seteEName(DPL eEName) {
        this.eEName = eEName;
    }

    public MV getAvAmps() {
        return avAmps;
    }

    public void setAvAmps(MV avAmps) {
        this.avAmps = avAmps;
    }

    public MV getMaxAmps() {
        return maxAmps;
    }

    public void setMaxAmps(MV maxAmps) {
        this.maxAmps = maxAmps;
    }

    public MV getMinAmps() {
        return minAmps;
    }

    public void setMinAmps(MV minAmps) {
        this.minAmps = minAmps;
    }

    public MV getAvVolts() {
        return avVolts;
    }

    public void setAvVolts(MV avVolts) {
        this.avVolts = avVolts;
    }

    public MV getMaxVolts() {
        return maxVolts;
    }

    public void setMaxVolts(MV maxVolts) {
        this.maxVolts = maxVolts;
    }

    public MV getMinVolts() {
        return minVolts;
    }

    public void setMinVolts(MV minVolts) {
        this.minVolts = minVolts;
    }

    public MV getAvVA() {
        return avVA;
    }

    public void setAvVA(MV avVA) {
        this.avVA = avVA;
    }

    public MV getMaxVA() {
        return maxVA;
    }

    public void setMaxVA(MV maxVA) {
        this.maxVA = maxVA;
    }

    public MV getMinVA() {
        return minVA;
    }

    public void setMinVA(MV minVA) {
        this.minVA = minVA;
    }

    public MV getAvW() {
        return avW;
    }

    public void setAvW(MV avW) {
        this.avW = avW;
    }

    public MV getMaxW() {
        return maxW;
    }

    public void setMaxW(MV maxW) {
        this.maxW = maxW;
    }

    public MV getMinW() {
        return minW;
    }

    public void setMinW(MV minW) {
        this.minW = minW;
    }

    public MV getAvVAr() {
        return avVAr;
    }

    public void setAvVAr(MV avVAr) {
        this.avVAr = avVAr;
    }

    public MV getMaxVAr() {
        return maxVAr;
    }

    public void setMaxVAr(MV maxVAr) {
        this.maxVAr = maxVAr;
    }

    public MV getMinVAr() {
        return minVAr;
    }

    public void setMinVAr(MV minVAr) {
        this.minVAr = minVAr;
    }

    public SPC getEvStr() {
        return evStr;
    }

    public void setEvStr(SPC evStr) {
        this.evStr = evStr;
    }

    public ASG getEvTmms() {
        return evTmms;
    }

    public void setEvTmms(ASG evTmms) {
        this.evTmms = evTmms;
    }

    @Override
    public void process() {

    }
}
