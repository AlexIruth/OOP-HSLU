/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw10;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexi
 */
public class Motor implements Switchable {

    private int rpm;
    private MotorState state;
    private final List<PropertyChangeListener> changeListeners = new ArrayList<>();

    public Motor() {
        this.rpm = 0;
        this.state = MotorState.OFF;
    }

    @Override
    public void switchOn() {

        if (isSwitchedOff()) {
            this.rpm = 10;
            this.state = MotorState.ON;

            final PropertyChangeEvent pcEvent = new PropertyChangeEvent(
                    this, "state", MotorState.OFF, MotorState.ON);
            this.firePropertyChangeEvent(pcEvent);
        }

    }

    @Override
    public void switchOff() {
        if (isSwitchedOn()) {
            this.rpm = 0;
            this.state = MotorState.OFF;
            final PropertyChangeEvent pcEvent = new PropertyChangeEvent(
                    this, "state", MotorState.ON, MotorState.OFF);
            this.firePropertyChangeEvent(pcEvent);
        }

    }

    @Override
    public boolean isSwitchedOff() {
        return this.state == MotorState.OFF || this.state == MotorState.FAILURE;

    }

    @Override
    public boolean isSwitchedOn() {
        return this.rpm > 0;
    }

    public int getRpm() {
        return this.rpm;

    }

    public void addPropertyChangeListener(final PropertyChangeListener listener) {
        this.changeListeners.add(listener); // 1: Car (rpm: 300, on: true, referenzwert: 10002);
    }

    public void removePropertyChangeListener(final PropertyChangeListener listener) {
        this.changeListeners.remove(listener);
    }

    private void firePropertyChangeEvent(final PropertyChangeEvent pcEvent) {
        for (final PropertyChangeListener listener : this.changeListeners) {
            listener.propertyChange(pcEvent);
        }

    }
    
    @Override
    public String toString()
    { 
        return "Motor: " + "\n rpm: " + this.rpm + "state: " + this.state;
    }
}
