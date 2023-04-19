/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Woche08;

import PrüfungJuni.RasenmäherTypeA;
import ch.hslu.sw08.Temperatur;
import nl.jqno.equalsverifier.EqualsVerifier;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 *
 * @author alexi
 */
public class Temperatur08 {

    @Test
    public void testConvertToCelsius() {
        assertEquals(-273.15f, Temperatur.convertKelvinToCelsius(0f));
    }

    @Test
    public void testConvertToKelvin() {
        assertEquals(0f, Temperatur.convertCelsiusToKelvin(-273.15f));
    }
    
    
    
    @Test
    public void simpleEqualsContract() {
        EqualsVerifier.simple().forClass(Temperatur.class).withOnlyTheseFields("kelvin").verify();

    }

}
