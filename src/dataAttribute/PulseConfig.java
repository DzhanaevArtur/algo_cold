package dataAttribute;

public class PulseConfig {

    private String cmdQual = "";
    private Integer onDur = 0;
    private Integer offDur = 0;
    private Integer numPIs = 0;

    public String getCmdQual() {
        return cmdQual;
    }

    public void setCmdQual(String cmdQual) {
        this.cmdQual = cmdQual;
    }

    public Integer getOnDur() {
        return onDur;
    }

    public void setOnDur(Integer onDur) {
        this.onDur = onDur;
    }

    public Integer getOffDur() {
        return offDur;
    }

    public void setOffDur(Integer offDur) {
        this.offDur = offDur;
    }

    public Integer getNumPIs() {
        return numPIs;
    }

    public void setNumPIs(Integer numPIs) {
        this.numPIs = numPIs;
    }
}
