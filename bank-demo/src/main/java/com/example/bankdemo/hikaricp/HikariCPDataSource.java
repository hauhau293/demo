package com.example.bankdemo.hikaricp;

import java.sql.Connection;
import java.sql.SQLException;
import com.example.bankdemo.constant.DbConfiguration;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariCPDataSource {

    private static HikariConfig config = new HikariConfig();

    private static HikariDataSource hikariDataSource;

    static {
        config.setDriverClassName(DbConfiguration.DB_DRIVER);
        config.setJdbcUrl(DbConfiguration.CONNECTION_URL);
        config.setUsername(DbConfiguration.USER_NAME);
        config.setPassword(DbConfiguration.PASSWORD);
        config.setAutoCommit(false);
        config.setMaximumPoolSize(10);
        config.setIdleTimeout(0);
        config.setConnectionTimeout(2000);

        hikariDataSource = new HikariDataSource(config);
    }

    private HikariCPDataSource() {
    }

    public static Connection getConnection() throws SQLException {
        return hikariDataSource.getConnection();
    }
}