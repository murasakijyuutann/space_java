package JDBC;

import java.sql.*;
import java.util.Scanner;

public class UserRepository {

    private final Connection conn;

    public UserRepository(Connection conn) {
        this.conn = conn;
    }

    public void insertUser(String name, String email, String passwordHash, String provider) {
        String sql = "INSERT INTO users (name, email, password_hash, provider) VALUES (?, ?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, passwordHash);
            pstmt.setString(4, provider);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("[OK] User inserted successfully! :)");
            }

        } catch (Exception e) {
            System.err.println("[ERR] Insert failed :( " + e.getMessage());
        }
    }

    public void updateUserEmailById(int id, String newEmail) {
        String sql = "UPDATE users SET email = ? WHERE id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newEmail);
            pstmt.setInt(2, id);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("[OK] User updated successfully! :)");
            } else {
                System.out.println("[!] No user found with that ID.");
            }

        } catch (Exception e) {
            System.err.println("[ERR] Update failed :( " + e.getMessage());
        }
    }

    public void printUsers(String columnName) {
        String sql = "SELECT * FROM users";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("Users table in appdb:");
            while (rs.next()) {
                System.out.println(" - " + rs.getString(columnName));
            }

        } catch (Exception e) {
            System.err.println("[ERR] Query failed :( " + e.getMessage());
        }
    }
}
