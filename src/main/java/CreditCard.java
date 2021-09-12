import javax.persistence.*;

@Entity
public class CreditCard {
    @Id
    @GeneratedValue
    private long id;
    private int number;
    private int limit;
    private int balance;

    @OneToOne
    private Pincode pincode;
}
