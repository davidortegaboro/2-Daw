package com.david.motos.persistence.dao.db.rawSql;

import java.sql.*;
import java.util.List;

public class RawSql {

    private static final DBConnection dbConnection = new DBConnection();

    public static ResultSet select(String sql, List<Object> params) {
        try {

            PreparedStatement preparedStatement = setParameters(sql, params);
            return preparedStatement.executeQuery();
        } catch (Exception e) {
            throw new RuntimeException("Error executing SQL query: " + sql + " " + e.getMessage());
        }

    }

    private static PreparedStatement setParameters(String sql, List<Object> values) {
        try {
            Connection connection = dbConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            if (values != null) {
                for (int i = 0; i < values.size(); i++) {
                    Object value = values.get(i);
                    preparedStatement.setObject(i + 1, value);
                }
            }
            // Imprimir los parámetros
            System.out.println("SQL: " + sql + ", Parameters: " + values);
            return preparedStatement;
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void insert(String sql, List<Object> params) {
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            for (int i = 0; i < params.size(); i++) {
                statement.setObject(i + 1, params.get(i));
            }

            int affectedRows = statement.executeUpdate();

            if (affectedRows == 0) {
                throw new RuntimeException("Creating user failed, no rows affected.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static int update(String sql, List<Object> params) {
        return RawSql.statement(sql, params);
    }

    public static int delete(String sql, List<Object> params) {
        return RawSql.statement(sql, params);
    }

    private static int statement(String sql, List<Object> params) {
        try {
            PreparedStatement preparedStatement = setParameters(sql, params);
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Error executing SQL query: " + sql);
        }
    }



}
