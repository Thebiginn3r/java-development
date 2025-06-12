import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Gimme last name: ");
            String lastNameSearch = scanner.nextLine();

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila",
                    "root",
                    "DaR0d32^^0n37");

            String query = """
                    SELECT first_name, last_name
                    FROM customer
                    WHERE last_name LIKE ?
                    ORDER BY first_name
                    """;

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, lastNameSearch);

            ResultSet results = preparedStatement.executeQuery();

            while(results.next()){
                String firstName = results.getString("first_name");
                String lastName = results.getString("last_name");

                System.out.println("Firstname: " + firstName);
                System.out.println("Lastname: " + lastName);
            }

            results.close();
            preparedStatement.close();
            connection.close();
            scanner.close();

        } catch (Exception e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
}
