import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    private static final String PERSISTENCE_UNIT_NAME = "creditcards";
    private static EntityManagerFactory factory;
    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        /*
        Query q = em.createQuery("select t from table t");
        List<Todo> todoList = q.getResultList();
        for (Todo todo : todoList) {
            System.out.println(todo);
        }
        System.out.println("Size: " + todoList.size());
         */

        em.getTransaction().begin();

        Person max = new Person();

        Address a1 = new Address();

        Bank b1 = new Bank();

        CreditCard c1 = new CreditCard();
        CreditCard c2 = new CreditCard();

        Pincode p1 = new Pincode();
        Pincode p2 = new Pincode();

        max.setName("Max mustermann");
        max.addCreditCard(c1);
        max.addCreditCard(c2);
        max.addAddress(a1);

        a1.setStreet("Inndalsveien");
        a1.setNumber(28);

        b1.setName("Pengebank");
        b1.addCard(c1);
        b1.addCard(c2);

        p1.setPincode("123");
        p1.setCount(1);

        c1.setBalance(-5000);
        c1.setLimit(-10000);
        c1.setNumber(12345);
        c1.setPincode(p1);

        p2.setPincode("123");
        p2.setCount(1);

        c2.setBalance(1);
        c2.setLimit(2000);
        c2.setNumber(123);
        c2.setPincode(p2);



        em.persist(max);
        em.persist(a1);
        em.persist(b1);
        em.persist(c1);
        em.persist(c2);
        em.persist(p1);
        em.persist(p2);

        em.getTransaction().commit();
        em.close();




        // TODO: Populate database
        //  Confirm that it works

        /*
        pseudo idea:

        Person max = new Person("Max Mustermann")

        max.newCard(limit = 10 000, Pincode "123")
        max.newCard(limit = 2 000)
         */



    }

}
