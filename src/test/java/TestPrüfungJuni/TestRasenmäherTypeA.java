/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPrüfungJuni;

import PrüfungJuni.Generation;
import PrüfungJuni.Messer;
import PrüfungJuni.RasenmäherTypeA;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author alexi
 */
public class TestRasenmäherTypeA {

    @Test

    public void testRasenmäher() {
        Messer messer = new Messer();
        RasenmäherTypeA rasenmäherTypeA = new RasenmäherTypeA(messer);
        Assertions.assertEquals(Generation.G1, rasenmäherTypeA.getGeneration());
    }

}
