package dataDescription;

import data.DATA;

/*
 * LPL (Logical node name plate)
 * Табличка с именем логического узла
 */

public class LPL extends DATA {

// Конфигурация, описание и расширение
    private String vendor = "";
    private String swRev = "";
    private String d = "";
    private String dU = "";
    private String configRev = "";
    private Integer paramRev = 0;
    private Integer valRev = 0;
    private String ldNs = "";
    private String lnNs = "";
    private String cdcNs = "";
    private String cdcName = "";
    private String dataNs = "";

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getSwRev() {
        return swRev;
    }

    public void setSwRev(String swRev) {
        this.swRev = swRev;
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

    public String getConfigRev() {
        return configRev;
    }

    public void setConfigRev(String configRev) {
        this.configRev = configRev;
    }

    public Integer getParamRev() {
        return paramRev;
    }

    public void setParamRev(Integer paramRev) {
        this.paramRev = paramRev;
    }

    public Integer getValRev() {
        return valRev;
    }

    public void setValRev(Integer valRev) {
        this.valRev = valRev;
    }

    public String getLdNs() {
        return ldNs;
    }

    public void setLdNs(String ldNs) {
        this.ldNs = ldNs;
    }

    public String getLnNs() {
        return lnNs;
    }

    public void setLnNs(String lnNs) {
        this.lnNs = lnNs;
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
