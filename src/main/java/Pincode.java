import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pincode {
    @Id
    @GeneratedValue
    private long id;
    private String pincode;
    private int count;
}
