public class Ejercicio6 {
    if (state == TEXAS) {
        rate = TX_RATE;
        amt = getAmt();
        calc = getCalc();
    }

    private Object getAmt() {
        return base * rate;
    }
else if ((state == OHIO) || (state == MAINE)) {
        rate = (state == OHIO) ? OH_RATE : MN_RATE;
        amt = getAmt();
        calc = getCalc();
        if (state == OHIO)
            points = 2;
    }
 else {
        rate = 1;
        amt = base;
        calc = getCalc();
    }

    private Object getCalc() {
        return 2 * basis(amt) + extra(amt) * 1.05;
    }
}
