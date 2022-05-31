package dataStatus;

import data.DATA;
import data.TimeStamp;

/*
 * SEC (Security violation counting)
 * Подсчет нарушений безопасности
 */

public class SEC extends DATA {

// Состояние
    private Integer cnt = 0;
    private String sev = "";
    private TimeStamp t = new TimeStamp();
    private String addr = "";
    private String addInfo = "";

// Конфигурация, описание и расширение
    private String d = "";
    private String dU = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    public String getSev() {
        return sev;
    }

    public void setSev(String sev) {
        this.sev = sev;
    }

    public TimeStamp getT() {
        return t;
    }

    public void setT(TimeStamp t) {
        this.t = t;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getAddInfo() {
        return addInfo;
    }

    public void setAddInfo(String addInfo) {
        this.addInfo = addInfo;
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
