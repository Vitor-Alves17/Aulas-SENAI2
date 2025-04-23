package Aula9;

public class CalSa {
    public static double inssCal(double sa1) {
        double inss2;

        if (sa1 <= 1303.00) {
            inss2 = sa1 * 0.08;
        } else if (sa1 <= 2571.00) {
            inss2 = sa1 * 0.09;
        } else if (sa1 <= 3856.00) {
            inss2 = sa1 * 0.11;
        } else {
            inss2 = sa1 * 0.14;
        }
        return inss2;
    }

    public static double irCal(double sa1, double depe) {
        double ir2;

        sa1 = sa1 - (189.59 * depe);

        if (sa1 <= 1903.98) {
            ir2 = 0;
        } else if (sa1 <= 2826.65) {
            ir2 = sa1 * 0.075;
        } else if (sa1 <= 3751.05) {
            ir2 = sa1 * 0.15;
        } else if (sa1 <= 4664.68) {
            ir2 = sa1 * 0.225;
        } else {
            ir2 = sa1 * 0.275;
        }

        return ir2;
    }

    public static double vt1(double sa, int ver){
        double vt = 0;

        if (ver == 1){
            vt = sa * 0.06;
        }else {
            vt = 0;
        }

        return vt;
    }

    public static double va2(double sa, int ver){
        double va = 0;

        if (ver == 1){
            va = 200.00;
        }else {
            va = 0;
        }

        return va;
    }

    public static double vr3(double sa, int ver){
        double vr = 0;

        if (ver == 1){
            vr = 250.00;
        }else {
            vr = 0;
        }

        return vr;
    }

    public static double ps4(double sa, int ver){
        double ps = 0;

        if (ver == 1){
            ps = 150.00;
        }else if (ver == 0){
            ps = 300.00;
        }

        return ps;
    }

}
