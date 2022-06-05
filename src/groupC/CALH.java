package groupC;

import dataStatus.SPS;
import logical.LN;

/*
 * CALH (Alarm handling)
 * Обработка сигналов тревоги.
 */

public class CALH extends LN {

    // Информация о статусе
    private SPS grAlm = new SPS(); //  Групповой сигнал тревоги
    private SPS grWrn = new SPS(); //  Групповое предупреждение
    private SPS grInd = new SPS(); //  Групповая индикация
    private SPS almLstOv = new SPS(); //  Переполнение списка аварийных сигналов

    public SPS getGrAlm() {
        return grAlm;
    }

    public void setGrAlm(SPS grAlm) {
        this.grAlm = grAlm;
    }

    public SPS getGrWrn() {
        return grWrn;
    }

    public void setGrWrn(SPS grWrn) {
        this.grWrn = grWrn;
    }

    public SPS getGrInd() {
        return grInd;
    }

    public void setGrInd(SPS grInd) {
        this.grInd = grInd;
    }

    public SPS getAlmLstOv() {
        return almLstOv;
    }

    public void setAlmLstOv(SPS almLstOv) {
        this.almLstOv = almLstOv;
    }

    @Override
    public void process() {

    }
}

