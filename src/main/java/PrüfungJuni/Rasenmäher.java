/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrüfungJuni;

import java.util.Objects;

/**
 *
 * @author alexi
 */
public abstract class Rasenmäher implements Comparable<Rasenmäher> {

    private final Antrieb antrieb;
    private Messer messer;
    private final String seriennumer;
    private static int zaehler = 20000;
    protected final Generation generation;

    public Rasenmäher(Messer messer, Generation generation) {
        if (messer == null || !messer.isCompatibleTo(generation)) {
            throw new IllegalArgumentException("Not compatible !!!");

        }
        this.messer = messer;
        this.generation = generation;
        this.antrieb = new Antrieb();
        this.seriennumer = "SV" + zaehler;
        zaehler++;

    }

    public Messer getMesser() {
        return this.messer;
    }

    public void setMesser(Messer messer) {
        this.messer = messer;
    }

    public Antrieb getAntrieb() {
        return this.antrieb;

    }

    public String getSerialNummber() {
        return this.seriennumer;
    }

    @Override
    public String toString() {
        return "Rasenmäher{" + "antrieb=" + antrieb + "; messer=" + messer + ";seriennumer=" + seriennumer + ";generation=" + generation + '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Rasenmäher && seriennumer != null) {
            return this.seriennumer.equals(((Rasenmäher) object).seriennumer);
        } else {
            return seriennumer == null && ((Rasenmäher) object).seriennumer == null;

        }

    }

    @Override
    public int hashCode() {
        return Objects.hash(seriennumer);
    }

    @Override
    public int compareTo(Rasenmäher other) {
        return this.seriennumer.compareTo(other.seriennumer);
    }

    public Generation getGeneration() {
        return this.generation;
    }

}
