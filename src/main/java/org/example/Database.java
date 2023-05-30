package org.example;
import java.sql.DriverManager;
import java.sql.*;
public class Database {
    private Connection connection;

    public Database() {
        try {
            this.connection = null;
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:ecommerce.db");
        } catch
        (ClassNotFoundException | SQLException e) {
            System.out.println(e + "");
        }
    }
