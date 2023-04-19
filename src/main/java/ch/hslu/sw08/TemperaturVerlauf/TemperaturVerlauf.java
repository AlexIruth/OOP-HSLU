/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw08.TemperaturVerlauf;

import ch.hslu.sw08.Temperatur;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author alexi
 */
public class TemperaturVerlauf {

    private final Collection<Temperatur> temperatures;

    public TemperaturVerlauf() {
        temperatures = new ArrayList<Temperatur>();
    }

    public void add(Temperatur temperatur) {
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
}


