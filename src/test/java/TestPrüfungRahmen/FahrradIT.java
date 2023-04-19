/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestPrüfungRahmen;

import PrüfungRahmen.Fahrrad;
import PrüfungRahmen.Rahmen;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alexi
 */
public class FahrradIT {

    @Test
    public void testCon() {
        Rahmen rahmen = new Rahmen();
        Fahrrad fahrrad = new Fahrrad(rahmen, "12", 23);
        assertNotNull(fahrrad.getRahmen());
        assertEquals("12", fahrrad.getModel());
    }

    @Test
    public void testForExeption() {
        Rahmen rahmen = new Rahmen();
        String modul = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Fahrrad fahrrad = new Fahrrad(rahmen, null, 2);
        });
    }

    @Test
    public void testForExeptionNameLong() {
        Rahmen rahmen = new Rahmen();
        String modul = "sssssssssssssssssssdddddddddddddddsssssssssssssssssssssssssssssssss";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Fahrrad fahrrad = new Fahrrad(rahmen, modul, 2);
        });
    }

    @Test
    public void testForExeptionNameNOthing() {
        Rahmen rahmen = new Rahmen();
        String modul = "";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Fahrrad fahrrad = new Fahrrad(rahmen, modul, 2);
        });
    }

    @Test
    public void testString() {
        Rahmen rahmen = new Rahmen();
        Fahrrad fahrrad = new Fahrrad(rahmen, "12", 2);
        assertEquals("Fahrrad{" + "rahmen=" + fahrrad.getRahmen() + ", model=" + fahrrad.getModel() + '}', fahrrad.toString());
    }

    @Test
    public void test4e() {
        Rahmen rahmen = new Rahmen();
        Rahmen rahmen2 = new Rahmen(2);
        Fahrrad fahrrad = new Fahrrad(rahmen, "12", 2);
        Fahrrad fahrrad2 = new Fahrrad(rahmen2, "12", 2);
        assertNotEquals(true, fahrrad.equals(fahrrad2));
    }

    @Test
    public void testGewichtPlus() {
        Rahmen rahmen = new Rahmen();
        Fahrrad fahrrad = new Fahrrad(rahmen, "12", 12.055f);
        assertEquals(12.055f, fahrrad.getKg());

    }

    @Test
    public void testGewichtMius() {
        Rahmen rahmen = new Rahmen();
        Fahrrad fahrrad = new Fahrrad(rahmen, "12", 11.945f);
        assertEquals(11.945f, fahrrad.getKg());

    }

    @Test
    public void simpleEqualsContract() {
        EqualsVerifier.simple().forClass(Fahrrad.class).withOnlyTheseFields("model", "rahmen").verify();
    }

}
