package com.example.bankdemo.data;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDao {
    Customer findById(int id);

    List<Customer> findAll() throws SQLException;

    void save(Customer customer);

    void update(Customer customer);

    void delete(int id);


}
