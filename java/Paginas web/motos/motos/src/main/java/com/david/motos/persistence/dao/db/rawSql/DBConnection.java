package com.david.motos.persistence.dao.db.rawSql;

import com.david.motos.common.AppPropertiesReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private final AppPropertiesReader appPropertiesReader = AppPropertiesReader.getInstance();

    public DBConnection() {
        System.out.println("DBConnection instance created.");
    }

    public Connection connection() {
        System.out.println("Establishing connection with the database...");
        try {
            Connection connection = DriverManager.getConnection(
                    appPropertiesReader.getProperty("cod.datasource.url"),
                    appPropertiesReader.getProperty("cod.datasource.username"),
                    appPropertiesReader.getProperty("cod.datasource.password"));
            System.out.println("Connection established with the database");
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database: " + e.getMessage(), e);
        }
    }

    public Connection getConnection(){
        return connection();
    }


}
