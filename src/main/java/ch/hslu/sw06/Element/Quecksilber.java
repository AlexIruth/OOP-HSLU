package ch.hslu.sw05.VererbungAggregatszustand;

/**
 * Quecksilber ist die Unterklasse von der Klasse Element (Super Klasse)
 */
public class Quecksilber extends Element {

    private double currentTemperature;

    public Quecksilber(double newTemperature) {
        this.currentTemperature = newTemperature;
    }

    @Override
    public void caculateAggregatszustand() {
        if (this.currentTemperature >= 356.73f) {
            this.setaggregatszustand("gasförmig");
        } else if (this.currentTemperature > 327.43f) {
            this.setaggregatszustand("flüssig");
        } else {
            this.setaggregatszustand("fest");
        }

    }

    @Override
    public String toString() {
        return "GIFTIG" + super.toString();
    }

}
