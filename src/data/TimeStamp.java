package data;

public class TimeStamp {

    private Integer secondSinceEpoch = 0;
    private Integer fractionOfSecond = 0;
    private TimeQuality timeQuality = new TimeQuality();

    public Integer getSecondSinceEpoch() {
        return secondSinceEpoch;
    }

    public void setSecondSinceEpoch(Integer secondSinceEpoch) {
        this.secondSinceEpoch = secondSinceEpoch;
    }

    public Integer getFractionOfSecond() {
        return fractionOfSecond;
    }

    public void setFractionOfSecond(Integer fractionOfSecond) {
        this.fractionOfSecond = fractionOfSecond;
    }

    public TimeQuality getTimeQuality() {
        return timeQuality;
    }

    public void setTimeQuality(TimeQuality timeQuality) {
        this.timeQuality = timeQuality;
    }
}
