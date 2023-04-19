/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestJanuar;

import PrüfungJanuar.Bewertung;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author alexi
 */
public class TestBewertung {

    @Test
    public void testMark() {
        Bewertung bewertung = Bewertung.A;
        Assertions.assertEquals(6f,bewertung.getMark());
    }
    @Test
    public void testMarkB() {
        Bewertung bewertung = Bewertung.B;
        Assertions.assertEquals(5.5f,bewertung.getMark());
    }
    
}
