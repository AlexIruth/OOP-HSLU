package ch.hslu.sw03.Temperatur.Semesterwoche3;

public class Demo {
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen

    /**
     * Konstruktor für Objekte der Klasse Demo
     */
    public Demo() {

    }

    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }

    }

    public int min(int a, int b) {
        if (b < a) {
            return b;
        } else {
            return a;
        }
    }

    public int max1(int a, int b, int c) {
        return this.max(this.max(a, b), c);

    }

    public int max2(int a, int b, int c) {
        int maxAB = this.max(a, b);

        return this.max(maxAB, c);

    }

    public int max3(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;

            } else {
                return c;
            }

        }

        if (c > b) {
            return c;
        } else {
            return b;
        }

    }

    public int max5(int a, int b, int c) {

        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }

        }

        if (c > b) {
            return c;

        } else {
            return b;

        }

    }

    public int max6(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (c > b) {
            return c;

        } else {
            return b;
        }

    }

}
