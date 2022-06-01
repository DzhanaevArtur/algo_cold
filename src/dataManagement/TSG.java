package dataManagement;

import data.DATA;
import data.ObjectReference;
import data.TimeStamp;
import dataAttribute.CalendarTime;

/*
 * TSG (Time setting group)
 * Группа настройки времени
 */

public class TSG extends DATA {

// Установка состояния
    private TimeStamp setTm = new TimeStamp();
    private CalendarTime setCal = new CalendarTime();

// Конфигурация, описание и расширение
    private String d = "";
    private String dU = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

    public TimeStamp getSetTm() {
        return setTm;
    }

    public void setSetTm(TimeStamp setTm) {
        this.setTm = setTm;
    }

    public CalendarTime getSetCal() {
        return setCal;
    }

    public void setSetCal(CalendarTime setCal) {
        this.setCal = setCal;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getdU() {
        return dU;
    }

    public void setdU(String dU) {
        this.dU = dU;
    }

    public String getCdcNs() {
        return cdcNs;
    }

    public void setCdcNs(String cdcNs) {
        this.cdcNs = cdcNs;
    }

    public String getCdcName() {
        return cdcName;
    }

    public void setCdcName(String cdcName) {
        this.cdcName = cdcName;
    }

    public String getDataNs() {
        return dataNs;
    }

    public void setDataNs(String dataNs) {
        this.dataNs = dataNs;
    }
}
