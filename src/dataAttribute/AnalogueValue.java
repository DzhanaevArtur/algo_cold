package dataAttribute;

import dataValue.Attribute;

public class AnalogueValue {

    private Attribute<Float> f = new Attribute<>(0f);

    public Attribute<Float> getF() {
        return f;
    }

    public void setF(Attribute<Float> f) {
        this.f = f;
    }
}
