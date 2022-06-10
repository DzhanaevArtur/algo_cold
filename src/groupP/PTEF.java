package groupP;

import control.INC;
import dataManagement.ASG;
import dataManagement.ENG;
import dataManagement.SPC;
import dataStatus.ACD;
import dataStatus.ACT;
import logical.LN;

/*
 * PTEF (Transient earth fault)
 * Временное замыкание на землю.
 */

public class PTEF extends LN {

    // Информация о статусе
    private ACD str = new ACD(); //  Пуск
    private ACT op = new ACT(); //  Срабатывание

    // Управление
    private INC opCntRs = new INC(); //  Сбрасываемый счетчик операций
    private SPC fltIndRs = new SPC(); //  Индикация замыкания на землю с возможностью сброса

    // Параметры настройки
    private ASG gndStr = new ASG(0.0F); //  Начальное значение заземления
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

    public ASG getGndStr() {
        return gndStr;
    }

    public void setGndStr(ASG gndStr) {
        this.gndStr = gndStr;
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
