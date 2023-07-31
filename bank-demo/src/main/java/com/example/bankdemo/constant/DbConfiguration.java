package com.example.bankdemo.constant;

public class DbConfiguration {
    public static final String HOST_NAME = "localhost";
    public static final String DB_NAME = "bank";
    public static final String DB_PORT = "3306";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "hau2903";
    public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    // jdbc:mysql://hostname:port/dbname
    public static final String CONNECTION_URL = "jdbc:mysql://" + HOST_NAME + ":" + DB_PORT + "/" + DB_NAME;

    private DbConfiguration() {
    }
}
