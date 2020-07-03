package ru.example.store;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.example.store.dao.CustomerDAO;
import ru.example.store.dao.DAO;
import ru.example.store.model.Customer;

public class Main {

    public static void main(String[] args){
        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
            System.out.println(factory);
            DAO<Customer, String> customerDAO = new CustomerDAO(factory);
            final Customer customer = new Customer();
            customer.setId(3);
            customer.setAddress("Лизюкова 14");
            customer.setName("Евгений");
            customer.setEmail("dajs545462@mail.ru");
            customer.setPhone("+79307893366");
            System.out.println(customer.toString());
            customerDAO.create(customer);
        } finally {
            factory.close();
        }


    }
}