package dao;

import lombok.*;
import model.Product;

/**
 * Author : Danyil Smirnov.
 * Created : 02/07/2020.
 */
@Data
public class ProductDAO implements DAO<Product, String> {

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
