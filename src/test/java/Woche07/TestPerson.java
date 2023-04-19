/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Woche07;

import ch.hslu.sw07.Person;
import ch.hslu.sw07.PersonComperator;
import org.assertj.core.api.Assertions;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author alexi
 */
public class TestPerson {

    @Test
    public void testConstructoor() {
        Person person = new Person(10, "Max", "Muster");
        assertEquals("Max", person.getFirstname());
        assertEquals("Muster", person.getName());
        assertEquals(10, person.getid());

    }

    @Test
    public void testSamePerson() {
        Person person1 = new Person(10, "Max", "Muster");
        Person person2 = new Person(10, "Max", "Muster");
        assertTrue(person1.equals(person2));
    }

    @Test
    public void testDiffernentPerson() {
        Person person1 = new Person(10, "Max", "Muster");
        Person person2 = new Person(14, "Monika", "Fuchs");
        assertFalse(person1.equals(person2));
    }

    @Test
    public void testSamePersonHash() {
        Person person1 = new Person(10, "Max", "Muster");
        Person person2 = new Person(10, "Max", "Muster");
        assertEquals(person1.hashCode(), person2.hashCode());
    }

    @Test
    public void testCompareLessPerson() {
        Person person1 = new Person(10, "Max", "Muster");
        Person person2 = new Person(14, "Monika", "Fuchs");
        assertEquals(-1, person1.compareTo(person2));
    }

    @Test
    public void testCompareGreatPerson() {
        Person person1 = new Person(17, "Max", "Muster");
        Person person2 = new Person(14, "Monika", "Fuchs");
        assertEquals(1, person1.compareTo(person2));
    }

    @Test
    public void testCompareSamePerson() {
        Person person1 = new Person(10, "Max", "Muster");
        Person person2 = new Person(10, "Max", "Muster");
        assertEquals(0, person1.compareTo(person2));
    } 

    @Test
    public void testCompareNames() {
        Person person1 = new Person(10, "Max", "Muster");
        Person person2 = new Person(14, "Monika", "Fuchs");
        PersonComperator comp = new PersonComperator();
        //assertEquals(1, comp.compare(person1, person2));
        assertThat(comp.compare(person1, person2)).isGreaterThan(0);
    }

}
