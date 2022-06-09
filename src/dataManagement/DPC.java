package dataManagement;

import data.TimeStamp;
import dataAttribute.Quality;
import dataValue.Attribute;

/*
 * DPC (Controllable double point)
 * Дублированное управление и состояния
 */

public class DPC {

    private Attribute<Boolean> stVal = new Attribute<>(false);

    private Quality q = new Quality();

    private TimeStamp t = new TimeStamp();

    private Attribute<CtlModels> ctlModel = new Attribute<>(CtlModels.DIRECT_WITH_NORMAL_SECURITY);

    public Attribute<Boolean> getStVal() {
        return stVal;
    }

    public void setStVal(Attribute<Boolean> stVal) {
        this.stVal = stVal;
    }
}
