/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ch.hslu.sw08.Element;



/**
 *
 * @author alexi
 */
public enum Aggregatszustand {
    SOLID("fest"),GAS("gasförmig"),LIQUID("flüssig");

    public final String text;
    
    private Aggregatszustand(String text) 
    {
      this.text = text;
    }
   
   
}
