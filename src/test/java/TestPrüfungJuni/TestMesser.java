/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPrüfungJuni;

import PrüfungJuni.Messer;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author alexi
 */
public class TestMesser {

    @Test
    public void testCon() {
        Messer messer = new Messer(33);
        assertEquals(33, messer.getSharpnessInHrc());

    }

    @Test
    public void testCon2() {
        Messer messer = new Messer();
        assertEquals(56, messer.getSharpnessInHrc());
    }

}
