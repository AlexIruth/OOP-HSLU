/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPrüfungJuni;

import PrüfungJuni.RasenmäherTypeC;
import PrüfungJuni.Messer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author alexi
 */
public class TestRasenmäherTypeC {

    @Test
    public void testForExeptionMesserNull() {
        Messer messer = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            RasenmäherTypeC rasenmäherTypeC = new RasenmäherTypeC(messer);
        });

    }

    @Test
    public void testForExeptionMesserIncompatible() {
        Messer messer = new Messer();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            RasenmäherTypeC rasenmäherTypeC = new RasenmäherTypeC(messer);
        });
    }
}
