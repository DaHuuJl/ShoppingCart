package dao;

import model.Order;
import org.hibernate.SessionFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Author : Danyil Smirnov.
 * Created : 02/07/2020.
 */
public class OrderDAO implements DAO<Order, String>{
    /**
     * Connection factory to database.
     */
    private final SessionFactory factory;

    public OrderDAO(@NotNull final SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(Order order) {

    }

    @Override
    public Order read(String s) {
        return null;
    }

    @Override
    public void update(Order order) {

    }

    @Override
    public void delete(Order order) {

    }
}
