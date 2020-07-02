package dao;

import model.Product;
import org.hibernate.SessionFactory;
import org.jetbrains.annotations.NotNull;

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

    }

    @Override
    public Product read(String s) {
        return null;
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }
}
