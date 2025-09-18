package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UserService {
    private final Connection conn;

    public UserService(Connection conn) {
        this.conn = conn;
    }

    public void showAllUsers() {
        String sql = "SELECT * FROM users";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("Users:");
            while (rs.next()) {
                System.out.println(" - " + rs.getString("name"));
            }

        } catch (Exception e) {
            System.err.println("[ERR] Query failed :( " + e.getMessage());
        }
    }

    public void insertUserFromInput(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password hash: ");
        String passwordHash = scanner.nextLine();
        System.out.print("Enter provider (local/google): ");
        String provider = scanner.nextLine();

        String sql = "INSERT INTO users (name, email, password_hash, provider) VALUES (?, ?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setNull(3, java.sql.Types.VARCHAR); // for password_hash
            pstmt.setString(4, provider);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("[OK] User inserted! :)");
            }

        } catch (Exception e) {
            System.err.println("[ERR] Insert failed :( " + e.getMessage());
        }
    }

    public void updateUserFromInput(Scanner scanner) {
        System.out.print("Enter user ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("New name: ");
        String name = scanner.nextLine();

        String sql = "UPDATE users SET name = ? WHERE id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, id);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("[OK] User updated! :)");
            } else {
                System.out.println("[WARN] No user found with ID: " + id);
            }

        } catch (Exception e) {
            System.err.println("[ERR] Update failed :( " + e.getMessage());
        }
    }

    public void deleteUserFromInput(Scanner scanner) {
        System.out.print("Enter user ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());

        String sql = "DELETE FROM users WHERE id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("[OK] User deleted! :)");
            } else {
                System.out.println("[WARN] No user found with ID: " + id);
            }

        } catch (Exception e) {
            System.err.println("[ERR] Delete failed :( " + e.getMessage());
        }
    }
}
