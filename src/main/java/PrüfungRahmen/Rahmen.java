/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrüfungRahmen;

import java.util.Objects;

/**
 *
 * @author alexi
 */
public class Rahmen {

    private int grösse;

    public Rahmen(int grösse) {
        this.grösse = grösse;
    }

    public Rahmen() {
        this.grösse = 50;
    }

    public int getGrösse() {
        return this.grösse;
    }

    public void setGrösse(int grösse) {
        this.grösse = grösse;
    }

    @Override
    public String toString() {
        return "Rahmen{" + "grösse=" + grösse + '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Rahmen) {
            return Integer.compare(grösse, ((Rahmen) object).grösse) == 0;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(grösse);
    }

}
