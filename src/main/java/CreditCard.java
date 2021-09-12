import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CreditCard {
    @Id
    private long id;
    private int number;
    private int limit;
    private int balance;

    @OneToOne(mappedBy = "pincode");
    private Pincode p;

}
