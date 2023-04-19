/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw10.TemperaturEvent;


import java.util.Objects;


/**
 *
 * @author alexi
 */
public final class Temperatur implements Comparable<Temperatur> {

    private static final float KELVIN_OFFSET = 273.15f;
    private float kelvin;

    private Temperatur(float kelvin) {
        this.kelvin = kelvin;
    }

    public static Temperatur createFromCelsius(final float celsius) {
        if (convertCelsiusToKelvin(celsius) < 0) {
            throw new IllegalArgumentException("Celsius value not below -273.15f");
        }
        Temperatur temp = new Temperatur(convertCelsiusToKelvin(celsius));
        return temp;
    }

    public static Temperatur createFromKelvin(float kelvin) {
        if (kelvin < 0) {
            throw new IllegalArgumentException("Kelvin not below 0");
        }
        Temperatur temp2 = new Temperatur(kelvin);

        return temp2;

    }

    public Temperatur(Temperatur temperatur) {
        this.kelvin = temperatur.kelvin;
    }

    public float getKelvin() {
        return kelvin;
    }

    public float getCelsius() {
        return Temperatur.convertKelvinToCelsius(getKelvin());
    }

    public void setKelvin(float kelvin) {
        this.kelvin = kelvin;
    }

    public void setCelsius(float celsius) {
        this.kelvin = Temperatur.convertCelsiusToKelvin(celsius);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Temperatur) {
            return this.kelvin == ((Temperatur) object).kelvin;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(kelvin);
    }

    @Override
    public String toString() {
        return "Kelvin: " + kelvin;
    }

    @Override
    public int compareTo(Temperatur object) {
        return Float.compare(this.kelvin, object.kelvin);
    }

    public static float convertKelvinToCelsius(float kelvin) {
        return kelvin - KELVIN_OFFSET;
    }

    public static float convertCelsiusToKelvin(float celsius) {
        return celsius + KELVIN_OFFSET;
    }

}
