package dataManagement;

import data.DATA;
import data.TimeStamp;
import dataAttribute.Quality;
import dataValue.Attribute;

/*
 * SPC (Controllable single point)
 * Недублированное управление состояния
 */

public class SPC extends DATA {

    private Attribute<Boolean> stVal = new Attribute<>(false);

    private Quality q = new Quality();

    private TimeStamp t = new TimeStamp();

    public Attribute<Boolean> getStVal() {
        return stVal;
    }

    public void setStVal(Attribute<Boolean> stVal) {
        this.stVal = stVal;
    }
}
