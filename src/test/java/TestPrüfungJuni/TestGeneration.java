/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPrüfungJuni;

import PrüfungJuni.Generation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author alexi
 */
public class TestGeneration {

    @Test
    public void testG1() {
        Generation generation = Generation.G1;
        Assertions.assertEquals(2012, generation.getDate());
    }

    @Test
    public void testG2() {
        Generation generation = Generation.G2;
        Assertions.assertEquals(2013, generation.getDate());
    }

    @Test
    public void testG3() {
        Generation generation = Generation.G3;
        Assertions.assertEquals(2019, generation.getDate());

    }

}
