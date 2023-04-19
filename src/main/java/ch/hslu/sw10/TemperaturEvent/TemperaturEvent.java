/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw10.TemperaturEvent;

import java.util.EventObject;

/**
 *
 * @author alexi
 */
public class TemperaturEvent extends EventObject {

    private EventTyp typ;
    private float value;

    public TemperaturEvent(TemperaturVerlauf temperaturVerlauf, EventTyp typ, float value) {
        super(temperaturVerlauf);
        this.typ = typ;
        this.value = value;
    }

    public EventTyp getTyp() {
        return this.typ;
    }

    public float getValue() {
        return this.value;
    }

}
