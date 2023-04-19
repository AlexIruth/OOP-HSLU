/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPrüfungJuni;

import PrüfungJuni.Messer;
import PrüfungJuni.Rasenmäher;
import PrüfungJuni.RasenmäherTypeA;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import nl.jqno.equalsverifier.EqualsVerifier;

/**
 *
 * @author alexi
 */
public class TestRasenmäher {

    @Test
    public void testKonstruktor() {
        Messer messer = new Messer();
        Rasenmäher rasenmäher = new RasenmäherTypeA(messer);
        assertEquals(messer, rasenmäher.getMesser());
        assertNotNull(rasenmäher.getAntrieb());

    }

    @Test
    public void testSerialNummber() {
        Messer messer = new Messer();
        Rasenmäher rasenmäher = new RasenmäherTypeA(messer);
        Rasenmäher rasenmäher2 = new RasenmäherTypeA(messer);

        assertNotNull(rasenmäher.getSerialNummber());
        assertEquals(7, rasenmäher.getSerialNummber().length());
        assertNotEquals(rasenmäher.getSerialNummber(), rasenmäher2.getSerialNummber());

    }

 @Test
    public void simpleEqualsContract() {
        EqualsVerifier.simple().forClass(Rasenmäher.class).withIgnoredFields("antrieb", "messer", "generation").verify();
    }


    @Test
    public void testCompareLessRasenmäher() {
        Messer messer1 = new Messer();
        Rasenmäher rasenmäher1 = new RasenmäherTypeA(messer1);
        Rasenmäher rasenmäher2 = new RasenmäherTypeA(messer1);
        assertEquals(-1, rasenmäher1.compareTo(rasenmäher2));
    }

    @Test
    public void testCompareIsGreater() {
        Messer messer1 = new Messer();
        Rasenmäher rasenmäher1 = new RasenmäherTypeA(messer1);
        Rasenmäher rasenmäher2 = new RasenmäherTypeA(messer1);
        assertEquals(1, rasenmäher2.compareTo(rasenmäher1));
    }

    @Test
    public void testCompareSame() {
        Messer messer1 = new Messer();
        Rasenmäher rasenmäher1 = new RasenmäherTypeA(messer1);
        assertEquals(0, rasenmäher1.compareTo(rasenmäher1));

    }

 
    }
     



