/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Woche08;

import ch.hslu.sw08.Temperatur;
import ch.hslu.sw08.TemperaturVerlauf.TemperaturVerlauf;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author alexi
 */
public class TestTemperaturVerlauf {

    @Test
    public void testAdd() {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        Temperatur temperatur = new Temperatur(10f);
        temperaturVerlauf.add(temperatur);
        assertEquals(1, temperaturVerlauf.getCount());
    }

    @Test
    public void testClear() {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        Temperatur temperatur = new Temperatur(10f);
        temperaturVerlauf.add(temperatur);
        temperaturVerlauf.clear();
        assertEquals(0, temperaturVerlauf.getCount());
    }
    
    @Test
    public void testMaxTemperatur()
    {
         TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        Temperatur temperatur = new Temperatur(10f);
        temperaturVerlauf.add(temperatur);
         Temperatur temperatur2 = new Temperatur(100f);
        temperaturVerlauf.add(temperatur2);
        assertEquals(100f,temperaturVerlauf.getMaxTemperatur());
    }
}
