package com.plurasight;

import java.sql.*;

public class DatabasePractice {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world",
                "root",
                "DaR0d32^^0n37");

        Statement statement = connection.createStatement();

        String query = """
                Select Name
                From City
                Where countrycode='USA'""";

        ResultSet results = statement.executeQuery(query);

        while(results.next()){
            String city = results.getString("Name"); //or 1 for  retrieving column
            System.out.println(city);
        }

        connection.close();
    }

}
