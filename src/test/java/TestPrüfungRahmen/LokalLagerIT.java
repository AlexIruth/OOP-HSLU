/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestPrüfungRahmen;

import PrüfungRahmen.LokalLager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alexi
 */
public class LokalLagerIT {

    @Test
    public void testTotalGewicht() {
        LokalLager lokalLager = new LokalLager();
        assertEquals(38f, lokalLager.getTotalWeight());
    }

    @Test
    public void testGewichtMax() {
        LokalLager lokalLager = new LokalLager();
        assertEquals(16f, lokalLager.getMaxKilogramm());
    }

    @Test
    public void testGewichtMin() {
        LokalLager lokalLager = new LokalLager();
        assertEquals(9f, lokalLager.getMinKilogramm());
    }

}
