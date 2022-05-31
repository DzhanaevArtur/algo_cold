package dataAttribute;

public class AnalogueValue {

    private Integer i = 0;
    private Float f = 0.0F;

    private Float scaleFactor = 0.0F;
    private Float offset = 0.0F;

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public Float getF() {
        return f;
    }

    public void setF(Float f) {
        this.f = f;
    }

    public Float getScaleFactor() {
        return scaleFactor;
    }

    public void setScaleFactor(Float scaleFactor) {
        this.scaleFactor = scaleFactor;
    }

    public Float getOffset() {
        return offset;
    }

    public void setOffset(Float offset) {
        this.offset = offset;
    }
}
