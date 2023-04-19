/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestPrüfungRahmen;

import PrüfungRahmen.Fahrrad;
import PrüfungRahmen.Rahmen;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alexi
 */
public class RahmenIT {

    @Test
    public void testCon() {
        Rahmen rahmen = new Rahmen(23);
        assertEquals(23, rahmen.getGrösse());
    }

    @Test
    public void testDef() {
        Rahmen rahmen = new Rahmen();
        assertEquals(50, rahmen.getGrösse());
    }

    @Test
    public void testString() {
        Rahmen rahmen = new Rahmen();
        Fahrrad fahrrad = new Fahrrad(rahmen, "12", 3);
        assertEquals("Rahmen{" + "grösse=" + rahmen.getGrösse() + '}', rahmen.toString());
    }

    @Test
    public void testEquals() {
        Rahmen rahmen = new Rahmen();
        Rahmen rahmen2 = new Rahmen();
        assertEquals(true, rahmen.equals(rahmen2));
    }

    @Test
    public void testEquals2() {
        Rahmen rahmen = new Rahmen();
        Rahmen rahmen2 = new Rahmen(23);
        assertNotEquals(true, rahmen.equals(rahmen2));
    }

    @Test
    public void simpleEqualsContract() {
        EqualsVerifier.simple().forClass(Rahmen.class).withOnlyTheseFields("grösse").verify();
    }

}
