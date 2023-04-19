/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw10.TemperaturEvent;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author alexi
 */
public class TemperaturVerlauf {

    private final List<TemperaturListener> changeListeners = new ArrayList<>();
    private final Collection<Temperatur> temperatures;

    public TemperaturVerlauf() {
        temperatures = new ArrayList<Temperatur>();
    }

    public void add(Temperatur temperatur) {

        if (temperatur.getCelsius() > this.getMaxTemperatur() || this.getCount() == 0) {
            TemperaturEvent temperaturEvent = new TemperaturEvent(this, EventTyp.MAXIMAL, temperatur.getCelsius());
            this.fireTemperaturEvent(temperaturEvent);
        } else if (temperatur.getCelsius() < this.getLowestTemperatur()) {
            TemperaturEvent temperaturEvent = new TemperaturEvent(this, EventTyp.MINIMAL, temperatur.getCelsius());
            this.fireTemperaturEvent(temperaturEvent);

        }
        temperatures.add(temperatur);
    }

    public void clear() {
        temperatures.clear();
    }

    public int getCount() {
        return temperatures.size();
    }

    public float getMaxTemperatur() {
        if (this.getCount() > 0) {
            return Collections.max(temperatures).getCelsius();
        }
        return Float.NaN;
    }

    public float getLowestTemperatur() {
        if (this.getCount() > 0) {
            return Collections.min(temperatures).getCelsius();
        }

        return Float.NaN;
    }

    public float getAvrageTemperatur() {
        float allValues = 0;
        for (Temperatur temperatur : temperatures) {
            allValues = temperatur.getCelsius() + allValues;
        }
        float avarage = allValues / getCount();
        return avarage;

    }

    @Override
    public String toString() {
        return "count: " + this.getCount() + " avrage Temperatur " + this.getAvrageTemperatur() + " MaxTemp: "
                + this.getMaxTemperatur() + " min Temperatur " + this.getLowestTemperatur();

    }

    public void addTemperaturListener(final TemperaturListener listener) {
        this.changeListeners.add(listener);
    }

    public void removeTemperaturListener(final TemperaturListener listener) {
        this.changeListeners.remove(listener);
    }

    private void fireTemperaturEvent(final TemperaturEvent tEvent) {
        for (final TemperaturListener listener : this.changeListeners) {
            listener.minMaxChange(tEvent);
        }

    }

}
