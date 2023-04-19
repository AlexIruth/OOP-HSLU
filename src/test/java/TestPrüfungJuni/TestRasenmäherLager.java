package TestPrüfungJuni;

import PrüfungJuni.Generation;
import PrüfungJuni.RasenmäherLager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author alexi
 */
public class TestRasenmäherLager {

    @Test
    public void testCountG1() {
        RasenmäherLager rasenmäherLager = new RasenmäherLager();
        Assertions.assertEquals(2, rasenmäherLager.getCountRasenmäherGeneration(Generation.G1));
    }

    @Test
    public void testCountG2() {
        RasenmäherLager rasenmäherLager = new RasenmäherLager();
        Assertions.assertEquals(1, rasenmäherLager.getCountRasenmäherGeneration(Generation.G2));

    }

    @Test
    public void testCountG3() {
        RasenmäherLager rasenmäherLager = new RasenmäherLager();
        Assertions.assertEquals(0, rasenmäherLager.getCountRasenmäherGeneration(Generation.G3));
    }

}
