package dao;

import lombok.*;
import model.OrderDetail;
import org.hibernate.SessionFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Author : Danyil Smirnov.
 * Created : 02/07/2020.
 */
@Data
public class OrderDetailDAO implements DAO<OrderDetail, String> {
    /**
     * Connection factory to database.
     */
    private final SessionFactory factory;

    public OrderDetailDAO(@NotNull final SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(OrderDetail orderDetail) {

    }

    @Override
    public OrderDetail read(String s) {
        return null;
    }

    @Override
    public void update(OrderDetail orderDetail) {

    }

    @Override
    public void delete(OrderDetail orderDetail) {

    }
}
