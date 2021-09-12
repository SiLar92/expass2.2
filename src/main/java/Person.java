import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Person {
    @Id
    private long id;
    private String name;

    @ManyToMany(mappedBy = "address")
    private final List<Address> addressList = new ArrayList<>();
    @OneToMany(mappedBy = "creditcard")
    private final List<CreditCard> creditCards = new ArrayList<>();

}
