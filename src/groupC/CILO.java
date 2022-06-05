package groupC;

import dataStatus.SPS;
import logical.LN;

/*
 * CILO (Interlocking)
 * Взаимосвязанный.
 */

public class CILO extends LN {

    // Информация о статусе
    private SPS enaOpn = new SPS(); //  Включить Открытие
    private SPS enaCls = new SPS(); //  Включить Закрытие

    public SPS getEnaOpn() {
        return enaOpn;
    }

    public void setEnaOpn(SPS enaOpn) {
        this.enaOpn = enaOpn;
    }

    public SPS getEnaCls() {
        return enaCls;
    }

    public void setEnaCls(SPS enaCls) {
        this.enaCls = enaCls;
    }

    @Override
    public void process() {

    }
}