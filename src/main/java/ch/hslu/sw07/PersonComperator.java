/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw07;

import java.util.Comparator;

/**
 *
 * @author alexi
 */
public class PersonComperator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        int compare = person1.getName().compareTo(person2.getName());
        if (compare == 0) {
            compare = person1.getFirstname().compareTo(person2.getFirstname());
        }
        return compare;

    }

}
