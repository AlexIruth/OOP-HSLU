package ch.hslu.sw08.Element;
import ch.hslu.sw08.Element.Aggregatszustand;


public abstract class Element {

    private Aggregatszustand aggregatszustand;

    public final Aggregatszustand getaggregatszustand() {
        return this.aggregatszustand;
    }

    public void setaggregatszustand(Aggregatszustand newAggregatszustand) {
        this.aggregatszustand = newAggregatszustand;
    }

    public abstract void caculateAggregatszustand();

    @Override
    public String toString() {
        return "Element mit Aggregatszustand" + this.aggregatszustand.toString();
    }

}
