/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Probelauf;

/**
 *
 * @author alexi
 */
public class Teilnehmer {

    private final double id;
    private final String name;
    private final String firstname;

    public Teilnehmer(double id, String name, String firstname) {
        if (id < 20200500000d) {
            throw new IllegalArgumentException();
        }
        this.id = id;
        this.name = name;
        this.firstname = firstname;

    }

    public double getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFirstname() {
        return firstname;
    }

    @Override
    public String toString() {
        return "Teilnehmer{" + "id=" + id + ", name=" + name + ", firstname=" + firstname + '}';
    }

}
