/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrüfungJuni;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alexi
 */
public final class RasenmäherLager {

    private Map<String, Rasenmäher> rasenmäherListe = new HashMap<>();
    

    public RasenmäherLager() {
        Messer messer = new Messer();
        RasenmäherTypeA rasenmäherTypeA = new RasenmäherTypeA(messer);
        RasenmäherTypeA rasenmäherTypeA1 = new RasenmäherTypeA(messer);
        RasenmäherTypeB rasenmäherTypeB = new RasenmäherTypeB(messer);

        rasenmäherListe.put(rasenmäherTypeB.getSerialNummber(), rasenmäherTypeB);
        rasenmäherListe.put(rasenmäherTypeA1.getSerialNummber(), rasenmäherTypeA1);
        rasenmäherListe.put(rasenmäherTypeA.getSerialNummber(), rasenmäherTypeA);
        
    }
    

    public void printRasenmäherliste() {

        /*for (Map.Entry<String, Rasenmäher> entry : rasenmäherListe.entrySet()) {
            System.out.println(entry.getValue().toString());
        }*/ for (Rasenmäher rasenmäher : rasenmäherListe.values()) {
            System.out.println(rasenmäher.toString());
        }
    }

    public int getCountRasenmäherGeneration(Generation generation) { 
        int count = 0;
        for (Rasenmäher rasenmäher : rasenmäherListe.values()) {

            if (rasenmäher.getGeneration() == generation) {
                count++;
            }

        }
        return count;
    }

}
