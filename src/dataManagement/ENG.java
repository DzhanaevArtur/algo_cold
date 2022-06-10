package dataManagement;

import data.DATA;
import dataValue.Attribute;
import logical.Direction;

/*
 * ENG (Enumerated status setting)
 * Пронумерованная установка состояния
 */

public class ENG extends DATA {

    private Attribute<Direction> dir = new Attribute<>(Direction.UNKNOWN);

    public Attribute<Direction> getDir() {
        return dir;
    }

    public void setDir(Attribute<Direction> dir) {
        this.dir = dir;
    }
}
