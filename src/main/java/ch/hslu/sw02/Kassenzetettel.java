package ch.hslu.sw02; 


import java.util.ArrayList;


public class Kassenzetettel
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int zahlbetrag;
    private String geschaeft;
    private ArrayList<Artikel> artikel;
    private String cummulusnummer;
    private int erhaltenepunkte;
    private int zahlungshoehe;
    private String zahlungsmittel;
    private int rueckgeld;
    
    public Kassenzetettel(int ZAHLBETRAG, String Geschaeft)
    {
        
    
        // Instanzvariable initialisieren
         artikel = new ArrayList<Artikel>();
         zahlbetrag = ZAHLBETRAG;
         geschaeft = Geschaeft;
         cummulusnummer = "unkown";
         erhaltenepunkte = 0;
         zahlungshoehe = 0;
         zahlungsmittel = "unkown";
         rueckgeld = 0;
        
         
    }

   public void artikelhinzufügen(Artikel Neuerartikel)
   { 
       artikel.add(Neuerartikel);
    }
       
   
}
