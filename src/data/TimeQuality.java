package data;

public class TimeQuality {

    private Boolean leapSecondsKnown = Boolean.FALSE;
    private Boolean clockFailure = Boolean.FALSE;
    private Boolean clockNotSynchronized = Boolean.FALSE;
    private String timeAccuracy = "";

    public Boolean getLeapSecondsKnown() {
        return leapSecondsKnown;
    }

    public void setLeapSecondsKnown(Boolean leapSecondsKnown) {
        this.leapSecondsKnown = leapSecondsKnown;
    }

    public Boolean getClockFailure() {
        return clockFailure;
    }

    public void setClockFailure(Boolean clockFailure) {
        this.clockFailure = clockFailure;
    }

    public Boolean getClockNotSynchronized() {
        return clockNotSynchronized;
    }

    public void setClockNotSynchronized(Boolean clockNotSynchronized) {
        this.clockNotSynchronized = clockNotSynchronized;
    }

    public String getTimeAccuracy() {
        return timeAccuracy;
    }

    public void setTimeAccuracy(String timeAccuracy) {
        this.timeAccuracy = timeAccuracy;
    }
}
