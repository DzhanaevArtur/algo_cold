package dataAttribute;

import data.PackedList;

public class Quality {

    private String validity = "";
    private PackedList detailQual = new PackedList();
    private Boolean overflow = Boolean.FALSE;
    private Boolean outOfRange = Boolean.FALSE;
    private Boolean badReference = Boolean.FALSE;
    private Boolean oscillatory = Boolean.FALSE;
    private Boolean failure = Boolean.FALSE;
    private Boolean oldData = Boolean.FALSE;
    private Boolean inconsistent = Boolean.FALSE;
    private Boolean inaccurate = Boolean.FALSE;

    private String source = "";
    private Boolean test = Boolean.FALSE;
    private Boolean operatorBlocked = Boolean.FALSE;

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public PackedList getDetailQual() {
        return detailQual;
    }

    public void setDetailQual(PackedList detailQual) {
        this.detailQual = detailQual;
    }

    public Boolean getOverflow() {
        return overflow;
    }

    public void setOverflow(Boolean overflow) {
        this.overflow = overflow;
    }

    public Boolean getOutOfRange() {
        return outOfRange;
    }

    public void setOutOfRange(Boolean outOfRange) {
        this.outOfRange = outOfRange;
    }

    public Boolean getBadReference() {
        return badReference;
    }

    public void setBadReference(Boolean badReference) {
        this.badReference = badReference;
    }

    public Boolean getOscillatory() {
        return oscillatory;
    }

    public void setOscillatory(Boolean oscillatory) {
        this.oscillatory = oscillatory;
    }

    public Boolean getFailure() {
        return failure;
    }

    public void setFailure(Boolean failure) {
        this.failure = failure;
    }

    public Boolean getOldData() {
        return oldData;
    }

    public void setOldData(Boolean oldData) {
        this.oldData = oldData;
    }

    public Boolean getInconsistent() {
        return inconsistent;
    }

    public void setInconsistent(Boolean inconsistent) {
        this.inconsistent = inconsistent;
    }

    public Boolean getInaccurate() {
        return inaccurate;
    }

    public void setInaccurate(Boolean inaccurate) {
        this.inaccurate = inaccurate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Boolean getTest() {
        return test;
    }

    public void setTest(Boolean test) {
        this.test = test;
    }

    public Boolean getOperatorBlocked() {
        return operatorBlocked;
    }

    public void setOperatorBlocked(Boolean operatorBlocked) {
        this.operatorBlocked = operatorBlocked;
    }
}
