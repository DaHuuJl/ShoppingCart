package ru.example.store.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.example.store.model.Order;
import org.hibernate.SessionFactory;
import org.jetbrains.annotations.NotNull;

import ru.example.store.utils.HibernateSessionFactoryUtil;

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
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(order);
        transaction.commit();
        session.close();
    }

    @Override
    public Order read(String s) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Order.class, s);
    }

    @Override
    public void update(Order order) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(order);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Order order) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(order);
        transaction.commit();
        session.close();
    }
}
