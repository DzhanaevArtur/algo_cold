package dataStatus;

import data.DATA;
import dataValue.Attribute;
import logical.Direction;

/*
 * ACD (Directional protection activation information)
 * Сведения об активации направленной защиты
 */

public class ACD extends DATA {

    private Attribute<Direction> dirGeneral = new Attribute<>(Direction.UNKNOWN);
    private Attribute<Direction> dirPhsA = new Attribute<>(Direction.UNKNOWN);
    private Attribute<Direction> dirPhsB = new Attribute<>(Direction.UNKNOWN);
    private Attribute<Direction> dirPhsC = new Attribute<>(Direction.UNKNOWN);

    public Attribute<Direction> getDirGeneral() {
        return dirGeneral;
    }

    public void setDirGeneral(Attribute<Direction> dirGeneral) {
        this.dirGeneral = dirGeneral;
    }

    public Attribute<Direction> getDirPhsA() {
        return dirPhsA;
    }

    public void setDirPhsA(Attribute<Direction> dirPhsA) {
        this.dirPhsA = dirPhsA;
    }

    public Attribute<Direction> getDirPhsB() {
        return dirPhsB;
    }

    public void setDirPhsB(Attribute<Direction> dirPhsB) {
        this.dirPhsB = dirPhsB;
    }

    public Attribute<Direction> getDirPhsC() {
        return dirPhsC;
    }

    public void setDirPhsC(Attribute<Direction> dirPhsC) {
        this.dirPhsC = dirPhsC;
    }
}
