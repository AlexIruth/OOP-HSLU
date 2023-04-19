/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Probelauf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alexi
 */
public class TeilnehmerIT {

    @Test
    public void testCon() {
        double id = 202005000000d;
        String firdtname = "alex";
        String name = "iruth";
        Teilnehmer teilnehmer = new Teilnehmer(id, name, firdtname);
        assertEquals(202005000000d, teilnehmer.getId());
        assertEquals("alex", teilnehmer.getFirstname());
        assertEquals("iruth", teilnehmer.getName());

    }

    @Test
    public void testString() {
        double id = 202005000000d;
        String firdtname = "alex";
        String name = "iruth";
        Teilnehmer teilnehmer = new Teilnehmer(id, name, firdtname);
        assertEquals("Teilnehmer{" + "id=" + teilnehmer.getId() + ", name=" + teilnehmer.getName() + ", firstname=" + teilnehmer.getFirstname() + '}', teilnehmer.toString());
    }

    @Test
    public void testTOoBigNUmb() {
        double id = 202005000000d;
        String firdtname = "alex";
        String name = "iruth";
        Teilnehmer teilnehmer = new Teilnehmer(id, name, firdtname);
        assertEquals(202005000000d, teilnehmer.getId());
    }

}
