/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrüfungJanuar;

import PrüfungJuni.Rasenmäher;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author alexi
 */
public class Teilnehmer {

    private final long Id;
    private final String name;
    private final String firstName;
    private static final long limit = 20200500000l;
    private ArrayList<Fach> fachliste = new ArrayList<Fach>();
    private final List<TeilnehmerListener> changeListeners = new ArrayList<>();

    public Teilnehmer(long id, String name, String firstName) {
        if (id < limit) {
            throw new IllegalArgumentException("Wrong nummber");

        }
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("To Short name given");
        }
        this.Id = id;

        this.firstName = firstName;
        this.name = name;

    }

    public long getId() {
        return this.Id;
    }

    public String getName() {
        return this.name;
    }

    public String getFirstNameString() {
        return this.firstName;
    }

    public String toString() {
        return "Teilnehmer[id=" + getId() + ";name=" + name + ";firstname" + firstName + "]";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Teilnehmer) {
            return Long.compare(Id, ((Teilnehmer) object).Id) == 0;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

    public void addfach(String name, Bewertung bewertung) {
        Fach fach = new Fach(bewertung, name);

        fachliste.add(fach);
        if (bewertung == Bewertung.A) {
            TeilnehmerEvent tEvent = new TeilnehmerEvent(this, name, bewertung.getMark());

            fireTeilnehmerEvent(tEvent);

        }

    }

    public int getCountFächer() {

        return fachliste.size();
    }

    public float AvrageMark() {
        if (getCountFächer() == 0) {
            throw new IllegalStateException("Not possible !!!");
        }
        float total = 0;

        for (Fach fach : fachliste) {

            total += fach.getBewertung().getMark();

        }

        return total / getCountFächer();
    }

    public void addTeilnehmerListener(final TeilnehmerListener listener) {
        this.changeListeners.add(listener);
    }

    public void removeTeilnehmerListener(final TeilnehmerListener listener) {
        this.changeListeners.remove(listener);
    }

    private void fireTeilnehmerEvent(final TeilnehmerEvent tEvent) {
        for (final TeilnehmerListener listener : this.changeListeners) {
            listener.newHighSore(tEvent);
        }

    }

  

}
