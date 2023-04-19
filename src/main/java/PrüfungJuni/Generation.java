/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package PrüfungJuni;

/**
 *
 * @author alexi
 */
public enum Generation {
    G1(2012), G2(2013), G3(2019);
    private final int date;

    private Generation(int date) {
        this.date = date;

    }

    public int getDate() {
        return this.date;
    }

}
