package logical;

import graphs.NHMI;
import graphs.NHMISignal;
import groupC.CSWI;
import groupM.MMXU;
import groupM.MSQI;
import groupP.PTOC;
import groupR.RDIR;
import groupX.XCBR;

import static logical.Direction.BOTH;
import static logical.Direction.FORWARD;

public class MainLR2 {

    public static void main(String[] args) {
        LSVC lsvc = new LSVC();
        NHMI nhmi = new NHMI();
        MMXU mmxu = new MMXU();
        MSQI msqi = new MSQI();
        RDIR rdir = new RDIR();
        PTOC ptoc1 = new PTOC();
        PTOC ptoc2 = new PTOC();
        PTOC ptoc4 = new PTOC();
        PTOC ptoc5 = new PTOC();
        PTOC ptoc6 = new PTOC();
        CSWI cswi = new CSWI();
        XCBR xcbr = new XCBR();

        lsvc.readComtrade("C:\\Users\\Aser\\Desktop\\ \\Магистратура\\Алгоритмы РЗА\\лабы\\2\\Опыты\\KZ2");

        mmxu.setvL1(lsvc.getSignals().get(0));
        mmxu.setvL2(lsvc.getSignals().get(1));
        mmxu.setvL3(lsvc.getSignals().get(2));

        mmxu.setiL1(lsvc.getSignals().get(3));
        mmxu.setiL2(lsvc.getSignals().get(4));
        mmxu.setiL3(lsvc.getSignals().get(5));

        msqi.setA(mmxu.getA());
        msqi.setV(mmxu.getPhV());

        rdir.setW(mmxu.getW());
        rdir.setA(msqi.getSeqA());
        rdir.setV(msqi.getSeqV());

        ptoc1.setStrVal(245.22f);

        ptoc2.setStrVal(146.62f);
        ptoc2.getOpDlTmms().getSetVal().setValue(30);

        ptoc4.setStrVal(245.22f);

        ptoc5.setStrVal(0.33f);
        ptoc5.getOpDlTmms().getSetVal().setValue(60);

        ptoc6.setStrVal(0.25f);
        ptoc6.getOpDlTmms().getSetVal().setValue(180);

        ptoc6.getAcceleration().setValue(true);

        ptoc1.getDirMod().getDir().setValue(FORWARD);
        ptoc2.getDirMod().getDir().setValue(FORWARD);
        ptoc4.getDirMod().getDir().setValue(BOTH);
        ptoc5.getDirMod().getDir().setValue(BOTH);
        ptoc6.getDirMod().getDir().setValue(BOTH);

        ptoc1.getA().setPhsA(msqi.getSeqA().getC3());
        ptoc1.getA().setPhsB(msqi.getSeqA().getC3());
        ptoc1.getA().setPhsC(msqi.getSeqA().getC3());
        ptoc2.getA().setPhsA(msqi.getSeqA().getC3());
        ptoc2.getA().setPhsB(msqi.getSeqA().getC3());
        ptoc2.getA().setPhsC(msqi.getSeqA().getC3());
        ptoc4.getA().setPhsA(msqi.getSeqA().getC3());
        ptoc4.getA().setPhsB(msqi.getSeqA().getC3());
        ptoc4.getA().setPhsC(msqi.getSeqA().getC3());
        ptoc5.getA().setPhsA(msqi.getSeqA().getC3());
        ptoc5.getA().setPhsB(msqi.getSeqA().getC3());
        ptoc5.getA().setPhsC(msqi.getSeqA().getC3());
        ptoc6.getA().setPhsA(msqi.getSeqA().getC3());
        ptoc6.getA().setPhsB(msqi.getSeqA().getC3());
        ptoc6.getA().setPhsC(msqi.getSeqA().getC3());

        ptoc1.setStr(rdir.getDir());
        ptoc2.setStr(rdir.getDir());
        ptoc4.setStr(rdir.getDir());
        ptoc5.setStr(rdir.getDir());
        ptoc6.setStr(rdir.getDir());

        cswi.setOpOpn1(ptoc1.getOp());
        cswi.setOpOpn2(ptoc2.getOp());
        cswi.setOpOpn4(ptoc4.getOp());
        cswi.setOpOpn5(ptoc5.getOp());
        cswi.setOpOpn6(ptoc6.getOp());

        cswi.setStVal(xcbr.getPos());

        xcbr.setCtVal(cswi.getCtVal());

//        nhmi.addSignals(
//                new NHMISignal("Ток I1", lsvc.getSignals().get(3).getInstMag().getF())
//        );
//        nhmi.addSignals(
//                new NHMISignal("Ток I2", lsvc.getSignals().get(4).getInstMag().getF())
//        );
//        nhmi.addSignals(
//                new NHMISignal("Ток I3", lsvc.getSignals().get(5).getInstMag().getF())
//        );
//        nhmi.addSignals(
//                new NHMISignal("Ток I1 Mag", msqi.getSeqA().getC1().getcVal().getMag().getF())
//        );
//        nhmi.addSignals(
//                new NHMISignal("Ток I2 Mag", msqi.getSeqA().getC2().getcVal().getMag().getF())
//        );
//        nhmi.addSignals(
//                new NHMISignal("Ток I3 Mag", msqi.getSeqA().getC3().getcVal().getMag().getF())
//        );
//        nhmi.addSignals(
//                new NHMISignal("Напряжение U1", lsvc.getSignals().get(0).getInstMag().getF())
//        );
//        nhmi.addSignals(
//                new NHMISignal("Напряжение U2", lsvc.getSignals().get(1).getInstMag().getF())
//        );
//        nhmi.addSignals(
//                new NHMISignal("Напряжение U3", lsvc.getSignals().get(2).getInstMag().getF())
//        );
//        nhmi.addSignals(
//                new NHMISignal("Напряжение U1 Mag", msqi.getSeqV().getC1().getcVal().getMag().getF())
//        );
//        nhmi.addSignals(
//                new NHMISignal("Напряжение U2 Mag", msqi.getSeqV().getC2().getcVal().getMag().getF())
//        );
//        nhmi.addSignals(
//                new NHMISignal("Напряжение U3 Mag", msqi.getSeqV().getC3().getcVal().getMag().getF())
//        );
        nhmi.addSignals(
                new NHMISignal("W0", rdir.getW0())
        );
        nhmi.addSignals(
                new NHMISignal("PTOC1", ptoc1.getOp().getGeneral())
        );
        nhmi.addSignals(
                new NHMISignal("PTOC2", ptoc2.getOp().getGeneral())
        );
        nhmi.addSignals(
                new NHMISignal("PTOC4", ptoc4.getOp().getGeneral())
        );
        nhmi.addSignals(
                new NHMISignal("PTOC5", ptoc5.getOp().getGeneral())
        );
        nhmi.addSignals(
                new NHMISignal("PTOC6", ptoc6.getOp().getGeneral())
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
            msqi.process();
            rdir.process();
            ptoc1.process();
            ptoc2.process();
            ptoc4.process();
            ptoc5.process();
            ptoc6.process();
            cswi.process();
            xcbr.process();
        }
    }
}
