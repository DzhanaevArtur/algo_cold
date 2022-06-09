package dataManagement;

import data.DATA;
import data.TimeStamp;
import dataAttribute.Quality;
import dataValue.Attribute;

/*
 * INC (Controllable integer status)
 * Целочисленное управление и состояния
 */

public class INC extends DATA {

    private Attribute<Integer> stVal = new Attribute<>(0);

    private Quality q = new Quality();

    private TimeStamp t = new TimeStamp();

    private Attribute<CtlModels> ctlModel = new Attribute<>(CtlModels.DIRECT_WITH_NORMAL_SECURITY);


    public Attribute<Integer> getStVal() {
        return stVal;
    }

    public void increase() {
        stVal.setValue(stVal.getValue() + 1);
    }

    public void setStVal(Attribute<Integer> stVal) {
        this.stVal = stVal;
    }
}
