package groupM;

import dataDescription.DPL;
import dataStatus.BCR;
import dataStatus.INS;
import logical.LN;

/*
 * MMTR (Taking readout measurements)
 * Снятие показаний
 */

public class MMTR extends LN {

// Информация об общих логических узлах
    private INS eEHealth = new INS();
    private DPL eEName = new DPL();

// Измеренные значения
    private BCR totVAh = new BCR();
    private BCR totWh = new BCR();
    private BCR totVArh = new BCR();
    private BCR supWh = new BCR();
    private BCR supVArh = new BCR();
    private BCR dmdWh = new BCR();
    private BCR dmdVArh = new BCR();

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

    public BCR getTotVAh() {
        return totVAh;
    }

    public void setTotVAh(BCR totVAh) {
        this.totVAh = totVAh;
    }

    public BCR getTotWh() {
        return totWh;
    }

    public void setTotWh(BCR totWh) {
        this.totWh = totWh;
    }

    public BCR getTotVArh() {
        return totVArh;
    }

    public void setTotVArh(BCR totVArh) {
        this.totVArh = totVArh;
    }

    public BCR getSupWh() {
        return supWh;
    }

    public void setSupWh(BCR supWh) {
        this.supWh = supWh;
    }

    public BCR getSupVArh() {
        return supVArh;
    }

    public void setSupVArh(BCR supVArh) {
        this.supVArh = supVArh;
    }

    public BCR getDmdWh() {
        return dmdWh;
    }

    public void setDmdWh(BCR dmdWh) {
        this.dmdWh = dmdWh;
    }

    public BCR getDmdVArh() {
        return dmdVArh;
    }

    public void setDmdVArh(BCR dmdVArh) {
        this.dmdVArh = dmdVArh;
    }

    @Override
    public void process() {

    }
}
