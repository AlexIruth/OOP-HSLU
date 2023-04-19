/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPrüfungJuni;

import PrüfungJuni.Generation;
import PrüfungJuni.Messer;
import PrüfungJuni.RasenmäherTypeB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author alexi
 */
public class TestRasenmäherTypeB {

    @Test

    public void testRasenmäher() {
        Messer messer = new Messer();
        RasenmäherTypeB rasenmäherTypeB = new RasenmäherTypeB(messer);
        Assertions.assertEquals(Generation.G2,rasenmäherTypeB.getGeneration());
    }

}
