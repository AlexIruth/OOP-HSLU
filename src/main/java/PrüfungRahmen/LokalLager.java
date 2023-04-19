/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrüfungRahmen;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alexi
 */
public class LokalLager {

    private static Map<String, Fahrrad> gewichtsliste = new HashMap<>();

    public LokalLager() {
        Rahmen rahmen = new Rahmen();
        Fahrrad fahrrad1 = new Fahrrad(rahmen, "ktm", 9f);
        Fahrrad fahrrad2 = new Fahrrad(rahmen, "odlo", 13f);
        Fahrrad fahrrad3 = new Fahrrad(rahmen, "opel", 16f);

        gewichtsliste.put(fahrrad1.getModel(), fahrrad1);
        gewichtsliste.put(fahrrad2.getModel(), fahrrad2);
        gewichtsliste.put(fahrrad3.getModel(), fahrrad3);
    }

    public int getCountGewicht() {

        return gewichtsliste.size();
    }

    public float getTotalWeight() {

        if (getCountGewicht() == 0) {

            throw new IllegalStateException("Not possible !!!");
        }
        float total = 0;

        for (Fahrrad fahrrad : gewichtsliste.values()) {

            total += fahrrad.getKg();

        }

        return total;

    }

    public float getMaxKilogramm() {
        float maxKilogramm = 0.010f;
        for (Fahrrad fahrrad : gewichtsliste.values()) {
            if (maxKilogramm < fahrrad.getKg()) {
                maxKilogramm = fahrrad.getKg();

            }
        }
        return maxKilogramm;

    }

    public float getMinKilogramm() {
        float minKilogramm = 2000f;
        for (Fahrrad fahrrad : gewichtsliste.values()) {
            if (minKilogramm > fahrrad.getKg()) {
                minKilogramm = fahrrad.getKg();

            }
        }
        return minKilogramm;

    }

}
