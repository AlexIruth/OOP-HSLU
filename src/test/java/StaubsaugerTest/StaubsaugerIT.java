/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package StaubsaugerTest;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alexi
 */
public class StaubsaugerIT {

    @Test
    public void test() {
        Motor motor = new Motor();
        Staubsauger staubsauger = new Staubsauger(motor, "G1", 10f);
        assertEquals(motor, staubsauger.getMotor());
    }

    @Test
    public void test2() {
        Motor motor = new Motor();
        Staubsauger staubsauger = new Staubsauger(motor, "G1", 10f);
        assertEquals("G1", staubsauger.getModel());
    }

    @Test
    public void testForExeptionNull() {
        Motor motor = new Motor();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Staubsauger staubsauger = new Staubsauger(motor, null, 10f);
        });
    }

    @Test
    public void testForExeptionleer() {
        Motor motor = new Motor();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Staubsauger staubsauger = new Staubsauger(motor, "", 10f);
        });
    }

    @Test
    public void testForExeptionNAme() {
        Motor motor = new Motor();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Staubsauger staubsauger = new Staubsauger(motor, "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd", 2f);
        });
    }

    @Test
    public void test4() {
        Motor motor = new Motor();
        Motor motor2 = new Motor("hallo");
        Staubsauger staubsauger = new Staubsauger(motor, "G1", 10f);
        Staubsauger staubsauger2 = new Staubsauger(motor2, "G1", 2f);
        assertNotEquals(true, staubsauger.equals(staubsauger2));
    }

    @Test
    public void testRundungminus() {
        Motor motor = new Motor();
        Staubsauger staubsauger = new Staubsauger(motor, "G1", 9.825f);
        assertEquals(9.825f, staubsauger.getKg());

    }

    @Test
    public void testRundungplus() {
        Motor motor = new Motor();
        Staubsauger staubsauger = new Staubsauger(motor, "G1", 9.925f);
        assertEquals(9.925f, staubsauger.getKg());

    }

    @Test
    public void simpleEqualsContract() {
        EqualsVerifier.simple().forClass(Staubsauger.class).withOnlyTheseFields("model","motor").verify();
    }
}
