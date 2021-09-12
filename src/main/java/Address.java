import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    private long id;
    private String street;
    private int number;

    @ManyToMany(mappedBy = "person")
    private final List<Person> inhabitants = new ArrayList<>();

}
