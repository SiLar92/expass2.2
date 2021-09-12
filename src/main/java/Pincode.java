import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pincode {
    @Id
    private long id;
    private String pincode;
    private int count;
}
