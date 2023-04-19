/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw10;

import java.beans.PropertyChangeEvent;

/**
 *
 * @author alexi
 */
public class Car implements Switchable, PropertyChangeListener {

    private String model;
    private boolean running;
    private Light lightFrontLeft;
    public Light lightFrontRight;
    public Motor motor;

    public Car(String model) {
        this.model = model;
        this.lightFrontLeft = new Light();
        this.lightFrontRight = new Light();
        this.motor = new Motor();
        this.motor.addPropertyChangeListener(this);
        
        

    }

    public String getModel() {
        return model;
    }

    @Override
    public void switchOn() {
        this.running = true;
        this.lightFrontLeft.switchOn();
        this.lightFrontRight.switchOn();
        this.motor.switchOn();
    }

    @Override
    public void switchOff() {
        this.running = false;
        this.lightFrontLeft.switchOff();
        this.lightFrontRight.switchOff();
        this.motor.switchOff();
        this.motor.removePropertyChangeListener(this);
    }

    @Override
    public boolean isSwitchedOn() {
        return this.running;

    }

    @Override
    public boolean isSwitchedOff() {
        return !this.running;
    }

    @Override
    public void propertyChange(PropertyChangeEvent pcEvent) {
       System.out.println(pcEvent.getSource().toString() + 
                " " + pcEvent.getPropertyName()+ " oldval: "  + pcEvent.getOldValue() + " newVal: " + pcEvent.getNewValue());
    }

}
 