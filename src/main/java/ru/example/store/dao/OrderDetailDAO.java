package ru.example.store.dao;


import ru.example.store.model.OrderDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jetbrains.annotations.NotNull;
import ru.example.store.utils.HibernateSessionFactoryUtil;

/**
 * Author : Danyil Smirnov.
 * Created : 02/07/2020.
 */
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
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(orderDetail);
        transaction.commit();
        session.close();
    }

    @Override
    public OrderDetail read(String s) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(OrderDetail.class, s);
    }

    @Override
    public void update(OrderDetail orderDetail) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(orderDetail);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(OrderDetail orderDetail) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(orderDetail);
        transaction.commit();
        session.close();
    }
}
