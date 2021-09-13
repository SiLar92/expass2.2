import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Bank {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    @OneToMany
    private final List<CreditCard> cards = new ArrayList<>();

    public List<CreditCard> getCards() {
        return cards;
    }

    public void addCard(CreditCard card) {
        this.cards.add(card);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
