/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StaubsaugerTest;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alexi
 */
public class ProduktLager {

    private static Map<String, Staubsauger> staublist = new HashMap<>();

    public ProduktLager() {
        Motor motor = new Motor();
        Staubsauger staubsauger = new Staubsauger(motor, "ktm", 6f);
        Staubsauger staubsauger2 = new Staubsauger(motor, "ktm", 11f);
        Staubsauger staubsauger3 = new Staubsauger(motor, "ktm", 14f);

        staublist.put(staubsauger.getModel(), staubsauger);
        staublist.put(staubsauger2.getModel(), staubsauger2);
        staublist.put(staubsauger3.getModel(), staubsauger3);

    }

    public int getCountStaubs() {
        return staublist.size();
    }

    public float getTotalWeight() {

        float total = 0;
        for (Staubsauger staubsauger : staublist.values()) {
            total += staubsauger.getKg();
        }
        return total;

    }

    public float getMaxKilogramm() {
        if (getCountStaubs() == 0) {
            return 0;
        }
        float maxKilogramm = 0.010f;
        for (Staubsauger staubsauger : staublist.values()) {
            if (maxKilogramm < staubsauger.getKg()) {
                maxKilogramm = staubsauger.getKg();
            }
        }
        return maxKilogramm;
    }

    public float getMinKilogramm() {
        if (getCountStaubs() == 0) {
            return 0;
        }
        float minKilogramm = 2000f;
        for (Staubsauger staubsauger : staublist.values()) {
            if (minKilogramm > staubsauger.getKg()) {
                minKilogramm = staubsauger.getKg();
            }
        }
        return minKilogramm;
    }
}
