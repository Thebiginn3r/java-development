import java.sql.*;

public class JDBCSandBox {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind",
                "root",
                "DaR0d32^^0n37");

        Statement statement = connection.createStatement();

        String query = """
                SELECT ProductName
                FROM northwind.products""";

        ResultSet results = statement.executeQuery(query);

        while(results.next()){
            String name = results.getString(1); //or 1 for  retrieving column
            System.out.println(name);
        }

        connection.close();
    }
}
