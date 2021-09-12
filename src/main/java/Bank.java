import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Bank {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    @OneToMany(mappedBy = "bank")
    private List<CreditCard> cards = new ArrayList<>();
}
