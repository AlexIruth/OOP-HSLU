package ch.hslu.sw07;

import java.util.Objects;

/**
 *
 * @author alexi
 */
public class Person implements Comparable<Person> {

    private final long id;
    private String firstname;
    private String name;

    public Person(long id, String firstname, String name) {
        this.id = id;
        this.firstname = firstname;
        this.name = name;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getName() {
        return this.name;
    }

    public long getid() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ID: " + id + "Firstname" + firstname + "Name" + name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Person) {
            return this.id == ((Person) object).id;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Person other) 
    {
        return Long.compare(this.id, other.id);
    }

}
