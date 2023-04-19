/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrüfungJuni;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author alexi
 */
public class Messer implements Compatable {

    private float sharpnessInHrc;
    private static final float DEFAULT_SHARPNESS = 56;
    private final Collection<Generation> compatableGenerations = new ArrayList<Generation>();

    public Messer(float sharpnessInHrc) {
        this.sharpnessInHrc = sharpnessInHrc;
        compatableGenerations.add(Generation.G1);
        compatableGenerations.add(Generation.G2);
    }

    public Messer() {

        this.sharpnessInHrc = DEFAULT_SHARPNESS;
        compatableGenerations.add(Generation.G1);
        compatableGenerations.add(Generation.G2);

    }

    public float getSharpnessInHrc() {
        return this.sharpnessInHrc;
    }

    public void setSharpnessInHrc(float sharpnessInHrc) {
        this.sharpnessInHrc = sharpnessInHrc;
    }

    @Override
    public String toString() {

        return "Messer[sharpnessInHrc=" + this.sharpnessInHrc + "]";
    }

    @Override
    public boolean isCompatibleTo(Generation to) {
        boolean compatible = false;
        for (Generation currentGeneration : compatableGenerations) {
            if (currentGeneration == to) {
                compatible = true;

            }
        }
        return compatible;

    }

    public boolean isCompatibleTo2(Generation to) {
        boolean compatible = false;

        if (compatableGenerations.contains(to)) {
            compatible = true;
        }
        return compatible;
    }
    
     

}
