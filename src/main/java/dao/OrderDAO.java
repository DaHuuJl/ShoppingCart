package dao;

import lombok.*;
import model.Order;
import org.hibernate.SessionFactory;

/**
 * Author : Danyil Smirnov.
 * Created : 02/07/2020.
 */
@Data
public class OrderDAO implements DAO<Order, String>{

    private final SessionFactory factory;


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
