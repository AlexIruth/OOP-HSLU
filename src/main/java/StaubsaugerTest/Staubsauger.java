/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StaubsaugerTest;

import java.util.Objects;

/**
 *
 * @author alexi
 */
public class Staubsauger implements Gewicht {

    private final Motor motor;
    private String model;
    private float gewicht;

    public Staubsauger(Motor motor, String model, float gewicht) {
        if (model == null || model == "" || model.length() >= 17) {
            throw new IllegalArgumentException("not possible");

        }

        if (gewicht < 0.010f || gewicht > 2000f) {
            throw new IllegalArgumentException("error");
        }
        this.motor = motor;
        this.model = model;
        this.gewicht = gewicht;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Staubsauger{" + "motor=" + motor + ", model=" + model + '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Staubsauger)) {
            return false;
        }
        Staubsauger staubsauger = (Staubsauger) object;
        return Objects.equals(model, staubsauger.model) && Objects.equals(motor, staubsauger.motor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model,motor);
    }

    @Override
    public float getKg() {
        return gewicht;
    }

}
