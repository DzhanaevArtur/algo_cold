package groupP;

import control.INC;
import dataManagement.ASG;
import dataManagement.ENG;
import dataManagement.ING;
import dataManagement.SPC;
import dataStatus.ACD;
import dataStatus.ACT;
import logical.LN;

/*
 * PDIF (Sensitive directional earthfault)
 * Чувствительное направленное замыкание на землю.
 */

public class PSDE extends LN {

    // Информация о статусе
    private ACD str = new ACD(); //  Пуск
    private ACT op = new ACT(); //  Срабатывание

    // Управление
    private INC opCntRs = new INC(); //  Сбрасываемый счетчик операций
    private SPC fltIndRs = new SPC(); //  Индикация замыкания на землю с возможностью сброса

    // Параметры настройки
    private ASG ang = new ASG(0.0F); //  Угол между напряжением (U0) и током (I0)
    private ASG gndStr = new ASG(0.0F); //  Начальное значение заземления (3 U0)
    private ASG gndOp = new ASG(0.0F); //  Рабочее значение заземления (3 I0)
    private ING strDlTmms = new ING(0); //  Время задержки запуска
    private ING opDlTmms = new ING(0); //  Время задержки срабатывания
    private ENG dirMod = new ENG(); //  Направленный режим

    public ACD getStr() {
        return str;
    }

    public void setStr(ACD str) {
        this.str = str;
    }

    public ACT getOp() {
        return op;
    }

    public void setOp(ACT op) {
        this.op = op;
    }

    public INC getOpCntRs() {
        return opCntRs;
    }

    public void setOpCntRs(INC opCntRs) {
        this.opCntRs = opCntRs;
    }

    public SPC getFltIndRs() {
        return fltIndRs;
    }

    public void setFltIndRs(SPC fltIndRs) {
        this.fltIndRs = fltIndRs;
    }

    public ASG getAng() {
        return ang;
    }

    public void setAng(ASG ang) {
        this.ang = ang;
    }

    public ASG getGndStr() {
        return gndStr;
    }

    public void setGndStr(ASG gndStr) {
        this.gndStr = gndStr;
    }

    public ASG getGndOp() {
        return gndOp;
    }

    public void setGndOp(ASG gndOp) {
        this.gndOp = gndOp;
    }

    public ING getStrDlTmms() {
        return strDlTmms;
    }

    public void setStrDlTmms(ING strDlTmms) {
        this.strDlTmms = strDlTmms;
    }

    public ING getOpDlTmms() {
        return opDlTmms;
    }

    public void setOpDlTmms(ING opDlTmms) {
        this.opDlTmms = opDlTmms;
    }

    public ENG getDirMod() {
        return dirMod;
    }

    public void setDirMod(ENG dirMod) {
        this.dirMod = dirMod;
    }

    @Override
    public void process() {

    }
}
