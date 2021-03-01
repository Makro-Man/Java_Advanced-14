package ua.lviv.lgs;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Arrays;
import java.util.HashSet;

public class Application {
    public static void main(String[] args) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();
        Cart cart = new Cart("smth","name1");

        Item item1 = new Item("smth1");
        Item item2 = new Item("smth2");
        Item item3 = new Item("smth3");
        Item item4 = new Item("smth4");
        cart.setItemSet(new HashSet<>(Arrays.asList(item1, item2, item3, item4)));

        session.persist(cart);

        transaction.commit();
        session.close();
    }
}
