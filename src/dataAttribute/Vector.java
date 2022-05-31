package dataAttribute;

public class Vector {

    private AnalogueValue mag = new AnalogueValue();
    private AnalogueValue ang = new AnalogueValue();

    public AnalogueValue getMag() {
        return mag;
    }

    public void setMag(AnalogueValue mag) {
        this.mag = mag;
    }

    public AnalogueValue getAng() {
        return ang;
    }

    public void setAng(AnalogueValue ang) {
        this.ang = ang;
    }
}
