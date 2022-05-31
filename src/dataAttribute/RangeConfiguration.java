package dataAttribute;

public class RangeConfiguration {

    private AnalogueValue hhLim = new AnalogueValue();
    private AnalogueValue hLim = new AnalogueValue();
    private AnalogueValue iLim = new AnalogueValue();
    private AnalogueValue iILim = new AnalogueValue();
    private AnalogueValue min = new AnalogueValue();
    private AnalogueValue max = new AnalogueValue();

    public AnalogueValue getHhLim() {
        return hhLim;
    }

    public void setHhLim(AnalogueValue hhLim) {
        this.hhLim = hhLim;
    }

    public AnalogueValue gethLim() {
        return hLim;
    }

    public void sethLim(AnalogueValue hLim) {
        this.hLim = hLim;
    }

    public AnalogueValue getiLim() {
        return iLim;
    }

    public void setiLim(AnalogueValue iLim) {
        this.iLim = iLim;
    }

    public AnalogueValue getiILim() {
        return iILim;
    }

    public void setiILim(AnalogueValue iILim) {
        this.iILim = iILim;
    }

    public AnalogueValue getMin() {
        return min;
    }

    public void setMin(AnalogueValue min) {
        this.min = min;
    }

    public AnalogueValue getMax() {
        return max;
    }

    public void setMax(AnalogueValue max) {
        this.max = max;
    }
}
