package data;

public class TriggerConditions {

    private Boolean dataChange = Boolean.FALSE;
    private Boolean qualityChange = Boolean.FALSE;
    private Boolean dataUpdate  = Boolean.FALSE;
    private Boolean integrity = Boolean.FALSE;
    private Boolean generalInterrogation = Boolean.FALSE;

    public Boolean getDataChange() {
        return dataChange;
    }

    public void setDataChange(Boolean dataChange) {
        this.dataChange = dataChange;
    }

    public Boolean getQualityChange() {
        return qualityChange;
    }

    public void setQualityChange(Boolean qualityChange) {
        this.qualityChange = qualityChange;
    }

    public Boolean getDataUpdate() {
        return dataUpdate;
    }

    public void setDataUpdate(Boolean dataUpdate) {
        this.dataUpdate = dataUpdate;
    }

    public Boolean getIntegrity() {
        return integrity;
    }

    public void setIntegrity(Boolean integrity) {
        this.integrity = integrity;
    }

    public Boolean getGeneralInterrogation() {
        return generalInterrogation;
    }

    public void setGeneralInterrogation(Boolean generalInterrogation) {
        this.generalInterrogation = generalInterrogation;
    }
}
