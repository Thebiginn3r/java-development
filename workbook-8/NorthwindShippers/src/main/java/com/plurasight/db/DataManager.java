package com.plurasight.db;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataManager {
    private DataSource dataSource;

    public DataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertIntoDirect(String companyName, String phoneNumber) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "insert into shippers (CompanyName, Phone) values (?,?)")) {
            preparedStatement.setString(1, companyName);
            preparedStatement.setString(2, phoneNumber);

            int rows = preparedStatement.executeUpdate();

            System.out.println("Rows Inserted: " + rows);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void insertIntoWithGeneratedKeys(String companyName, String phoneNumber) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "insert into shippers (CompanyName, Phone) values (?,?)", Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, companyName);
            preparedStatement.setString(2, phoneNumber);

            int rows = preparedStatement.executeUpdate();

            System.out.println("Rows Inserted: " + rows);

            try (ResultSet keys = preparedStatement.getGeneratedKeys()) {
                if (keys.next()) {
                    System.out.println("A new key was added: " + keys.getInt(1));
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void updateRecord(String newDescription, int filmId) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE film SET description = ? WHERE film_id = ?")) {
            preparedStatement.setString(1, newDescription);
            preparedStatement.setInt(2, filmId);

            int rows = preparedStatement.executeUpdate();

            System.out.println("Rows Updated: " + rows);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void deleteRecord(String countryName) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM country WHERE country = ?")) {
            preparedStatement.setString(1, countryName);

            int rows = preparedStatement.executeUpdate();
            System.out.println("Rows Deleted: " + rows);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}