/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestJanuar;

import PrüfungJanuar.Bewertung;
import PrüfungJanuar.Teilnehmer;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author alexi
 */
public class TestTeilnehmer {

    @Test
    public void testConstructor() {
        long id = 30200500000001l;
        String Firstname = "max";
        String name = "muster";
        Teilnehmer teilnehmer = new Teilnehmer(id, name, Firstname);
        Assertions.assertEquals(id, teilnehmer.getId());
        Assertions.assertEquals(name, teilnehmer.getName());
        Assertions.assertEquals(Firstname, teilnehmer.getFirstNameString());
    }

    @Test
    public void testToString() {
        long id = 302005000000011l;
        String Firstname = "max";
        String name = "muster";
        Teilnehmer teilnehmer = new Teilnehmer(id, name, Firstname);
        Assertions.assertEquals("Teilnehmer[id=" + id + ";name=" + name + ";firstname" + Firstname + "]", teilnehmer.toString());
    }

   @Test
public void simpleEqualsContract() {
EqualsVerifier.simple().forClass(Teilnehmer.class).withOnlyTheseFields("Id").verify();
}

    @Test
    public void testForExeptionIdtoShort() {
        long id = 23;
        String name = "maxi";
        String firstname = "muster";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Teilnehmer teilnehmer = new Teilnehmer(id, name, firstname);
        });
    }

    @Test
    public void testForExeptionNameIsTOShort() {
        long id = 302005000000011l;
        String name = "ma";
        String firstname = "muster";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Teilnehmer teilnehmer = new Teilnehmer(id, name, firstname);
        });
    }

    @Test
    public void testForExeptionNameIsNull() {
        long id = 302005000000011l;
        String name = null;
        String firstname = "muster";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Teilnehmer teilnehmer = new Teilnehmer(id, name, firstname);
        });

    }

    @Test
    public void testThrowExeptionAvrage() {

        long id = 302005000000011l;
        String name = "Max";
        String firstname = "muster";
        Teilnehmer teilnehmer = new Teilnehmer(id, name, firstname);
        Assertions.assertThrows(IllegalStateException.class, () -> {
            teilnehmer.AvrageMark();
        });

    }

    @Test
    public void testAvrage() {
        long id = 302005000000011l;
        String name = "Max";
        String firstname = "muster";
        Teilnehmer teilnehmer = new Teilnehmer(id, name, firstname);
        teilnehmer.addfach("mathe", Bewertung.B);
        teilnehmer.addfach("physik", Bewertung.A);
        teilnehmer.addfach("musik", Bewertung.F);
        float avrage = teilnehmer.AvrageMark();
        Assertions.assertEquals(14.5f / 3f, avrage);

    }

}
