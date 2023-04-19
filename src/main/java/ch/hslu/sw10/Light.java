/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw10;

/**
 *
 * @author alexi
 */
public class Light implements Switchable {

    private int lumen;

    public Light() {
        this.lumen = 0;
    }

    @Override
    public void switchOn() {
        this.lumen = 10;
    }

    @Override
    public void switchOff() {
        this.lumen = 0;
    }

    @Override
    public boolean isSwitchedOn() {
        return this.lumen > 0;
    }

    @Override
    public boolean isSwitchedOff() {
        return !(this.lumen > 0);
    }

}
