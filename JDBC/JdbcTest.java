package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class JdbcTest {

    public static void main(String[] args) {
        String url = "jdbc:mysql://15.164.97.103:3306/appdb";
        String username = "mjyuu";
        String password = "2825097";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("[OK] Connected to MySQL! :)");

            Scanner scanner = new Scanner(System.in);
            UserService service = new UserService(conn);

            while (true) {
                System.out.println("\n==== User Menu ====");
                System.out.println("1. Show all users");
                System.out.println("2. Insert user");
                System.out.println("3. Update user");
                System.out.println("4. Delete user");
                System.out.println("0. Exit");
                System.out.print("Select an option: ");

                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        service.showAllUsers();
                        break;
                    case "2":
                        service.insertUserFromInput(scanner);
                        break;
                    case "3":
                        service.updateUserFromInput(scanner);
                        break;
                    case "4":
                        service.deleteUserFromInput(scanner);
                        break;
                    case "0":
                        System.out.println("Exiting... Bye :)");
                        return;
                    default:
                        System.out.println("[ERR] Invalid option.");
                }
            }

        } catch (Exception e) {
            System.err.println("[ERR] Connection failed :( " + e.getMessage());
        }
    }
}
