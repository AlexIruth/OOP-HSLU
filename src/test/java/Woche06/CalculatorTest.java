/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Woche06;

import ch.hslu.sw06.Calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alexi
 */
public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void additionSucessful() {

        assertEquals(5, calculator.additon(2, 3));

    }

    @Test
    public void additionSucessfulBigNummber() {
        assertEquals(5000, calculator.additon(2000, 3000));

    }   
    
  
  
     
          
  

}
