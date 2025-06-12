import java.sql.*;
import java.util.Scanner;

public class NorthwindTradersMore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("What do you want to do?");
            System.out.println("1) Display all products");
            System.out.println("2) Display all customers");
            System.out.println("0) Exit");

            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    displayProducts();
                    break;
                case 2:
                    displayCustomers();
                    break;
                case 0:
                    System.out.println("have a nice day");
                    return;
                default:
                    System.out.println("invalid option. try again");
                    break;
            }
        }
    }

    public static void displayProducts(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet results = null;
        try {
           // Scanner scanner = new Scanner(System.in);
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind",
                    "root",
                    "DaR0d32^^0n37");

            String query = """
                    SELECT ProductID, ProductName, UnitPrice, UnitsInStock
                    FROM products
                    """;

            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, lastNameSearch);

            results = preparedStatement.executeQuery();

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

            results.close();
            preparedStatement.close();
            connection.close();
            scanner.close();

        } catch (Exception e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }

    }

    public static void displayCustomers(){
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Gimme last name: ");
            String lastNameSearch = scanner.nextLine();

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind",
                    "root",
                    "DaR0d32^^0n37");

            String query = """
                    SELECT *
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
