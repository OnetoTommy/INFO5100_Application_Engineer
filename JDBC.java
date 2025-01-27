package edu.neu.mgen;

import java.sql.*;

public class JDBC {
  static final String dbURL = "jdbc:mysql://127.0.0.1:3306/students";
  static final String name = "root";
  static final String password = "12345678";

  public static void main(String[] args) {

    String QUERY = "SELECT * FROM students WHERE id = 1";

    Connection cnn = null;

    try{
      Class.forName ("com.mysql.cj.jdbc.Driver");

      cnn = DriverManager.getConnection(dbURL, name, password);
      // Disable auto-commit
      cnn.setAutoCommit(false);

      Statement stmt = cnn.createStatement();
      ResultSet rs = stmt.executeQuery(QUERY);

      if (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        int age = rs.getInt("age");

        System.out.println("ID=" + id + ", Name=" + name + ", Age=" + age);
      }

      String updateName = "Kai";
      int updateAge = 30;

      // Modify tha dataset
      String updateQuery = "UPDATE students SET name = ?, age = ? WHERE id = ?";
      PreparedStatement updateStmt = cnn.prepareStatement(updateQuery);
      updateStmt.setString(1, updateName);
      updateStmt.setInt(2, updateAge);
      updateStmt.setInt(3, 3);
      updateStmt.executeUpdate();

      System.out.println("Updated Database: ID=" + 3 + ", Name=" + updateName + ", Age=" + updateAge);

      // set values for the new row
      int newid = 4;
      String newName = "David";
      int newAge = 19;

      String checkQuery = "SELECT COUNT(*) FROM students WHERE id = ?";
      PreparedStatement checkStmt = cnn.prepareStatement(checkQuery);
      checkStmt.setInt(1, newid);
      ResultSet resultSet = checkStmt.executeQuery();
      resultSet.next();
      int count = resultSet.getInt(1);
      if (count > 0) {
        System.out.println("ID " + newid + " already exists. Skipping insert.");
    } else {
        // Step 2: Insert the new record if the ID doesn't exist
        String addQuery = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
        PreparedStatement insertStmt = cnn.prepareStatement(addQuery);

      insertStmt.setInt(1, newid);
      insertStmt.setString(2, newName);
      insertStmt.setInt(3, newAge);
      insertStmt.executeUpdate();

      System.out.println("Insert Database: ID=" + newid + ", Name=" + newName + ", Age=" + newAge);
    }  
      // Step 5: Rollback changes
      cnn.rollback();
      System.out.println("Changes rolled back successfully.");

      // Commit the transaction to ensure changes are saved
      cnn.commit();
    } catch (ClassNotFoundException e) {
      System.out.println("MySQL Driver not found.");
      e.printStackTrace();
  } catch (SQLException e) {
      e.printStackTrace();
      try {
          if (cnn != null) {
              cnn.rollback(); 
              System.out.println("Rolled back due to an error.");
          }
      } catch (SQLException rollbackEx) {
          rollbackEx.printStackTrace();
      }
  } 
}
}


