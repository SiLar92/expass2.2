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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Pincode getPincode() {
        return pincode;
    }

    public void setPincode(Pincode pincode) {
        this.pincode = pincode;
    }
}
