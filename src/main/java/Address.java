import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue
    private long id;
    private String street;
    private int number;

    @ManyToMany
    private final List<Person> inhabitants = new ArrayList<>();

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Person> getInhabitants() {
        return inhabitants;
    }
    public void addPerson(Person person) {
        this.inhabitants.add(person);
    }
}
