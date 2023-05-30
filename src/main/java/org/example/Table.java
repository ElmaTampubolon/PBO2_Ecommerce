package org.example;

package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Table {

    public static void createNewTable() {

        // URL database SQLite
        String url = "jdbc:sqlite:C:/SQLite/ecommerce.db";

        //create table
        String sql1 = "CREATE TABLE IF NOT EXISTS addresses (\n"
                + " user id INTEGER PRIMARY KEY,\n"
                + " type TEXT NOT NULL,\n"
                + " line1 VARCHAR NOT NULL,\n"
                + " line2 VARCHAR,\n"
                + " city VARCHAR,\n"
                + " province VARCHAR NOT NULL,\n"
                + " postcode VARCHAR NOT NULL\n"
                + ");";

        String sql2 = "CREATE TABLE IF NOT EXISTS users (\n"
                + " id INTEGER PRIMARY KEY,\n"
                + " seller INTEGER NOT NULL,\n"
                + " title VARCHAR NOT NULL,\n"
                + " description TEXT,\n"
                + " price VARCHAR NOT NULL,\n"
                + " stock INTEGER NOT NULL,\n"
                + ");";

        String sql3 = "CREATE TABLE IF NOT EXISTS reviews (\n"
                + " order INTEGER PRIMARY KEY,\n "
                + " star INTEGER NOT NULL,\n"
                + " description TEXT,\n"
                + ");";

        String sql4 = "CREATE TABLE IF NOT EXISTS products (\n"
                + " id INTEGER PRIMARY KEY,\n"
                + " seller INTEGER NOT NULL,\n"
                + " title VARCHAR NOT NULL,\n"
                + " description TEXT,\n"
                + " price VARCHAR NOT NULL,\n"
                + " stock INTEGER NOT NULL,\n"
                + ");";

        String sql5 = "CREATE TABLE IF NOT EXISTS orders (\n"
                + " id INTEGER PRIMARY KEY,\n"
                + " buyer INTEGER NOT NULL,\n"
                + " note INTEGER NOT NULL,\n"
                + " total INTEGER NOT NULL,\n"
                + " discount INTEGER NOT NULL,\n"
                + " isPaid BOOLEAN,\n"
                + ");";

        String sql6 = "CREATE TABLE IF NOT EXISTS OrderDetails (\n"
                + " order INTEGER NOT NULL,\n"
                + " product INTEGER PRIMARY KEY,\n"
                + " quantity INTEGER NOT NULL,\n"
                + " price INTEGER NOT NULL\n"
                + ");";

        try {
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            stmt.execute(sql1); //SQL table "addresses"
            stmt.execute(sql2); //SQL table "users"
            stmt.execute(sql3); //SQL table "reviews"
            stmt.execute(sql4); //SQL table "products"
            stmt.execute(sql5); //SQL table "orders"
            stmt.execute(sql6); //SQL table "OrderDetails"
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


