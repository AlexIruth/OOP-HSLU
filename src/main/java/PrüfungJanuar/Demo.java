/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrüfungJanuar;

/**
 *
 * @author alexi
 */
public class Demo implements TeilnehmerListener {

    public static void main(String[] args) {
        long id = 302005000000011l;
        String name = "Max";
        String firstname = "muster";
        Teilnehmer teilnehmer = new Teilnehmer(id, name, firstname);
        teilnehmer.addTeilnehmerListener(new Demo());
        teilnehmer.addfach("OOP", Bewertung.B);

    }

    @Override
    public void newHighSore(TeilnehmerEvent tEvent) {
        System.out.println(tEvent);
    }
    
    
    
    
    
    
    
    

}
