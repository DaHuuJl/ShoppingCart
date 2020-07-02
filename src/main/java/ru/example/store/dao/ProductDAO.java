package ru.example.store.dao;

import ru.example.store.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jetbrains.annotations.NotNull;
import ru.example.store.utils.HibernateSessionFactoryUtil;

/**
 * Author : Danyil Smirnov.
 * Created : 02/07/2020.
 */
public class ProductDAO implements DAO<Product, String> {
    /**
     * Connection factory to database.
     */
    private final SessionFactory factory;

    public ProductDAO(@NotNull final SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(Product product) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(product);
        transaction.commit();
        session.close();
    }

    @Override
    public Product read(String s) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Product.class, s);
    }

    @Override
    public void update(Product product) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(product);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Product product) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(product);
        transaction.commit();
        session.close();
    }
}
