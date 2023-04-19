package WOche06MaxTest;

import ch.hslu.sw03.Temperatur.Semesterwoche3.Max;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MaxTest
        
{
@Test
public void testMax()
{
 assertEquals(2, Max.max(2,0));
}

@Test
public void testMaxFirstNummber()
{
 assertEquals(5, Max.max(5, 4));
}

@Test
public void testMaxSecondNummber()
{
 assertEquals(3, Max.max(2, 3));
}

@Test
public void testMaxSameNummber()

{
  assertEquals(4, Max.max(4, 4));  
}

}

        

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

