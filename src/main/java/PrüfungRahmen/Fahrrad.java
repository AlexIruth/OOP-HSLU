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
public class Fahrrad implements Gewicht {

    private final Rahmen rahmen;
    private String model;
    private float gewicht;

    public Fahrrad(Rahmen rahmen, String model, float gewicht) {
        if (model == null || model == "" || model.length() > 23) {
            throw new IllegalArgumentException("ERROR");

        }

        if (gewicht < 0.010 || gewicht > 20000) {
            throw new IllegalArgumentException("not possible");

        }
        this.model = model;
        this.rahmen = rahmen;
        this.gewicht = gewicht;
    }

    public Rahmen getRahmen() {
        return this.rahmen;
    }

    @Override
    public String toString() {
        return "Fahrrad{" + "rahmen=" + rahmen + ", model=" + model + ", gewicht=" + gewicht + '}';
    }

    public String getModel() {
        return model;
    }

    @Override

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Fahrrad)) {
            return false;
        }
        Fahrrad fahrrad = (Fahrrad) object;
        return Objects.equals(rahmen, fahrrad.rahmen) && Objects.equals(model, fahrrad.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rahmen, model);
    }

    @Override
    public float getKg() {
        return gewicht;
    }
}
