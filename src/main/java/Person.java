import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    @ManyToMany(mappedBy = "address")
    private final List<Address> addressList = new ArrayList<>();
    @OneToMany(mappedBy = "creditcard")
    private final List<CreditCard> creditCards = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
