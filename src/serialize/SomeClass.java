package serialize;

import annotation.Save;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;

class SomeClass implements Serializable {
        final double fdouble = 0.2324435344;
        @Save
        AtomicBoolean aboolean;
        @Save
        int[] arr;
        @Save
        String tryToChangeMe;

    public double getFdouble() {
        return fdouble;
    }

    public AtomicBoolean getAboolean() {
        return aboolean;
    }

    public void setAboolean(AtomicBoolean aboolean) {
        this.aboolean = aboolean;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public String getTryToChangeMe() {
        return tryToChangeMe;
    }

    public void setTryToChangeMe(String tryToChangeMe) {
        this.tryToChangeMe = tryToChangeMe;
    }

}
