import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    @ManyToMany
    private final List<Address> addressList = new ArrayList<>();
    @OneToMany
    private final List<CreditCard> creditCards = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void addCreditCard(CreditCard card) {
        this.creditCards.add(card);
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void addAddress(Address address) {
        this.addressList.add(address);
    }
}
