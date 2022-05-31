package data;

public class DATA {

    private ObjectName dataName = new ObjectName();
    private ObjectReference dataRef = new ObjectReference();
    private Boolean presence = Boolean.FALSE;
    private DAType dataAttributeType = new DAType();
    private FC functionalConstraint = new FC();
    private TriggerConditions trgOp = new TriggerConditions();

    public ObjectName getDataName() {
        return dataName;
    }

    public void setDataName(ObjectName dataName) {
        this.dataName = dataName;
    }

    public ObjectReference getDataRef() {
        return dataRef;
    }

    public void setDataRef(ObjectReference dataRef) {
        this.dataRef = dataRef;
    }

    public Boolean getPresence() {
        return presence;
    }

    public void setPresence(Boolean presence) {
        this.presence = presence;
    }

    public DAType getDataAttributeType() {
        return dataAttributeType;
    }

    public void setDataAttributeType(DAType dataAttributeType) {
        this.dataAttributeType = dataAttributeType;
    }

    public FC getFunctionalConstraint() {
        return functionalConstraint;
    }

    public void setFunctionalConstraint(FC functionalConstraint) {
        this.functionalConstraint = functionalConstraint;
    }

    public TriggerConditions getTrgOp() {
        return trgOp;
    }

    public void setTrgOp(TriggerConditions trgOp) {
        this.trgOp = trgOp;
    }
}
