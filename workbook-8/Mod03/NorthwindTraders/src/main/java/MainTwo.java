import java.sql.*;

public class MainTwo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind",
                "root",
                "DaR0d32^^0n37");

        Statement statement = connection.createStatement();

        String query = """
                SELECT ProductID, ProductName, UnitPrice, UnitsInStock
                FROM northwind.products""";

        ResultSet results = statement.executeQuery(query);

        while(results.next()){
            int productID = results.getInt(1); //or 1 for  retrieving column
            String productName = results.getString(2);
            double unitPrice = results.getDouble(3);
            int unitsInStock = results.getInt(4);

            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: " + unitPrice);
            System.out.println("Stock: " + unitsInStock);
            System.out.println("-------------");
        }
        connection.close();
    }
}
