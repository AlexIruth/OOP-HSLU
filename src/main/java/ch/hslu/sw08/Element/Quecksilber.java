package ch.hslu.sw08.Element;
import ch.hslu.sw08.Element.Aggregatszustand;


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
            this.setaggregatszustand(Aggregatszustand.GAS);
        } else if (this.currentTemperature > 327.43f) {
            this.setaggregatszustand(Aggregatszustand.LIQUID);
        } else {
            this.setaggregatszustand(Aggregatszustand.SOLID);
        }

    }

    @Override
    public String toString() {

     
      return "Quecksilber ist bei " + currentTemperature + getaggregatszustand().text;
        
    }

}
