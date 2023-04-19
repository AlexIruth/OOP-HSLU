/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package StaubsaugerTest;


import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alexi
 */
public class MotorIT {

    @Test

    public void testConDef() {
        Motor motor = new Motor();
        assertEquals("Dreht", motor.getUmdrehung());
    }

    @Test
    public void testCon() {
        Motor motor = new Motor("hallo");
        assertEquals("hallo", motor.getUmdrehung());
    }

    @Test
    public void testEquals() {
        Motor motor = new Motor();
        Motor motor1 = new Motor();
        assertEquals(true, motor.equals(motor1));
    }

    @Test
    public void testEquals2() {
        Motor motor = new Motor();
        Motor motor1 = new Motor("hallo");
        assertNotEquals(true, motor.equals(motor1));

    }

    @Test
    public void simpleEqualsContract() {
        EqualsVerifier.simple().forClass(Motor.class).withOnlyTheseFields("umdrehung").verify();
    }
}
