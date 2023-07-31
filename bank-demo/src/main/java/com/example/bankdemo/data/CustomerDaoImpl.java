package com.example.bankdemo.data;

import com.example.bankdemo.hikaricp.HikariCPDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    private HikariCPDataSource hikariDataSource;

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public List<Customer> findAll() throws SQLException {
        List<Customer> customers = new ArrayList<>();
        String sql = "SELECT * FROM customers";
        try (Connection connection = hikariDataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                Customer customer = new Customer();
                customer.setId(resultSet.getInt("id"));
                customer.setUsername(resultSet.getString("username"));
                customer.setPassword(resultSet.getString("password"));
                customer.setBalance(resultSet.getInt("balance"));
                customers.add(customer);
            }
        }
        return customers;
    }
    @Override
    public void save(Customer customer) {

    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void delete(int id) {

    }
}
