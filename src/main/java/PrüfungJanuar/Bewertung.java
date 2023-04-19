/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package PrüfungJanuar;

/**
 *
 * @author alexi
 */
public enum Bewertung {
    A(6f), B(5.5f), C(5f), D(4.5f), E(4f), F(3f);
    private final float mark;

    private Bewertung(float mark) {
        this.mark = mark;

    }

    public float getMark() {
        return this.mark;
    }

}
