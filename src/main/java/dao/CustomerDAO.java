package dao;

import model.Customer;
import org.hibernate.SessionFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Author : Danyil Smirnov.
 * Created : 26/11/2017.
 */
public class CustomerDAO implements DAO<Customer, String> {
    /**
     * Connection factory to database.
     */
    private final SessionFactory factory;

    public CustomerDAO(@NotNull final SessionFactory factory) {
        this.factory = factory;
    }

    public void create(Customer customer) {

    }

    public Customer read(String s) {
        return null;
    }

    public void update(Customer customer) {

    }

    public void delete(Customer customer) {

    }
}
