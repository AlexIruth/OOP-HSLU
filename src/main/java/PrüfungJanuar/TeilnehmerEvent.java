/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrüfungJanuar;

import java.util.EventObject;

/**
 *
 * @author alexi
 */
public class TeilnehmerEvent extends EventObject {

    private String anlass;
    private float note;

    public TeilnehmerEvent(Teilnehmer teilnehmer, String anlass, float note) {
        super(teilnehmer);
        this.anlass = anlass;
        this.note = note;
    }

    public String getAnlass() {
        return this.anlass;
    }

    public float getNote() {
        return note;
    }

    @Override
    public String toString() {
        return anlass + " " + " " + note;
    }
  


}
