package logical;

import graphs.NHMI;
import graphs.NHMISignal;
import groupC.CSWI;
import groupM.MMXU;
import groupP.PTOC;
import groupX.XCBR;

public class MainLR1 {

    public static void main(String[] args) {

        System.out.println("Лабораторная работа №1");
        LSVC lsvc = new LSVC();
        NHMI nhmi = new NHMI();
        MMXU mmxu = new MMXU();
        PTOC PTOC1 = new PTOC();
        PTOC PTOC2 = new PTOC();
        CSWI cswi = new CSWI();
        XCBR xcbr = new XCBR();

        lsvc.readCSV("C:\\Users\\Aser\\Desktop\\ \\Магистратура\\Алгоритмы РЗА\\лабы\\1\\Опыты\\Конец линии\\PhABC20");

        mmxu.setiL1(lsvc.getSignals().get(0));
        mmxu.setiL2(lsvc.getSignals().get(1));
        mmxu.setiL3(lsvc.getSignals().get(2));

        PTOC1.setStrVal(3956.1f);
        PTOC2.setStrVal(3347.5f);
        PTOC1.setA(mmxu.getA());
        PTOC2.setA(mmxu.getA());

        cswi.setOpOpn1(PTOC1.getOp());
        cswi.setOpOpn2(PTOC2.getOp());
        cswi.setStVal(xcbr.getPos());

        xcbr.setCtVal(cswi.getCtVal());

        nhmi.addSignals(
                new NHMISignal("Ток l1", lsvc.getSignals().get(0).getInstMag().getF())
        );
        nhmi.addSignals(
                new NHMISignal("Ток l2", lsvc.getSignals().get(1).getInstMag().getF())
        );
        nhmi.addSignals(
                new NHMISignal("Ток l3", lsvc.getSignals().get(2).getInstMag().getF())
        );
        nhmi.addSignals(
                new NHMISignal("Ток l1 Fourier", mmxu.getA().getPhsA().getcVal().getMag().getF())
        );
        nhmi.addSignals(
                new NHMISignal("Ток l2 Fourier", mmxu.getA().getPhsB().getcVal().getMag().getF())
        );
        nhmi.addSignals(
                new NHMISignal("Ток l3 Fourier", mmxu.getA().getPhsC().getcVal().getMag().getF())
        );
        nhmi.addSignals(
                new NHMISignal("PTOC1", PTOC1.getOp().getGeneral())
        );
        nhmi.addSignals(
                new NHMISignal("PTOC2", PTOC2.getOp().getGeneral())
        );
        nhmi.addSignals(
                new NHMISignal("CSWI", cswi.getCtVal().getStVal())
        );
        nhmi.addSignals(
                new NHMISignal("XCBR", xcbr.getPos().getStVal())
        );
        while (lsvc.hasNext()) {
            lsvc.process();
            nhmi.process();
            mmxu.process();
            PTOC1.process();
            PTOC2.process();
            cswi.process();
            xcbr.process();

            System.out.println(lsvc.getSignals().get(0).getInstMag().getF().getValue());
        }

    }
}
