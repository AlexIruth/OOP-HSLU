/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StaubsaugerTest;

import java.util.Objects;

/**
 *
 * @author alexi
 */
public class Motor {

    private String umdrehung;

    public Motor(String umdrehung) {
        this.umdrehung = umdrehung;
    }

    public Motor() {
        this.umdrehung = "Dreht";
    }

    public void setUmdrehung(String umdrehung) {
        this.umdrehung = umdrehung;
    }

    public String getUmdrehung() {
        return umdrehung;
    }

    @Override
    public String toString() {
        return "Motor{" + "umdrehung=" + umdrehung + '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Motor && umdrehung != null) {
            return this.umdrehung.equals(((Motor) object).umdrehung);
        } else {
            return umdrehung == null && ((Motor) object).umdrehung == null;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(umdrehung);
    }

}
