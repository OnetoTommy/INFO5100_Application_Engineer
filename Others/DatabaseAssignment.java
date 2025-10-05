package edu.neu.mgen;

import java.sql.*;

public class DatabaseAssignment {
    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://127.0.0.1:3306/students"; 
        String username = "root"; 
        String password = "12345678"; 

        Connection connection = null;

        try {
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            connection = DriverManager.getConnection(dbURL, username, password);
            connection.setAutoCommit(false); // Enable manual transaction control

            // Step 2: Read a record
            String selectQuery = "SELECT * FROM students WHERE id = 2"; // Change id to the desired record
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);

            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                System.out.println("Original Record: ID=" + id + ", Name=" + name + ", Age=" + age);

                // Step 3: Modify the record in Java
                String updatedName = name + "_Modified";
                int updatedAge = age + 1;

                // Step 4: Update the record in the database
                String updateQuery = "UPDATE students SET name = ?, age = ? WHERE id = ?";
                PreparedStatement updateStmt = connection.prepareStatement(updateQuery);
                updateStmt.setString(1, updatedName);
                updateStmt.setInt(2, updatedAge);
                updateStmt.setInt(3, id);
                updateStmt.executeUpdate();

                System.out.println("Updated Record in Database: ID=" + id + ", Name=" + updatedName + ", Age=" + updatedAge);

                // Step 5: Rollback changes
                connection.rollback();
                System.out.println("Changes rolled back successfully.");
            } else {
                System.out.println("Record not found.");
            }

            // Commit the transaction to ensure changes are saved
            connection.commit();

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                if (connection != null) {
                    connection.rollback(); // Rollback changes if any error occurs
                    System.out.println("Transaction rolled back due to an error.");
                }
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
        } finally {
            // Step 6: Close the connection
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Database connection closed.");
                }
            } catch (SQLException closeEx) {
                closeEx.printStackTrace();
            }
        }
    }
}

