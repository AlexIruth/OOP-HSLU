/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrüfungJanuar;

/**
 *
 * @author alexi
 */
public class Fach {

    private String anlass;
    private Bewertung bewertung;

    public Fach(Bewertung bewertung, String anlass) {
        this.bewertung = bewertung;
        this.anlass = anlass;
    }

    public Bewertung getBewertung() {
        return this.bewertung;
    }
    
    
}


