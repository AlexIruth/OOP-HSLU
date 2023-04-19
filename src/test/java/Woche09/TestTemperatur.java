/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Woche09;

import ch.hslu.sw09.Temperatur;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 *
 * @author alexi
 */
public class TestTemperatur {

    @Test
    public void testTooLowTemp() {
        assertThrows(IllegalArgumentException.class, () -> {
            Temperatur.createFromKelvin(-1);
        });

    }
    @Test
void testExceptionCreateFromKelvin() {
final Exception e =
assertThrows(IllegalArgumentException.class, () -> {
Temperatur.createFromKelvin(-300f);
});
        assertEquals("Kelvin not below 0",e.getMessage()); 
}
    @Test
void testExceptionCreateFromCelsius() {
final Exception e =
assertThrows(IllegalArgumentException.class, () -> {
Temperatur.createFromCelsius(-300f);
});
        assertEquals("Celsius value not below -273.15f", e.getMessage()); 
}

} 
