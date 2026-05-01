package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Student {
    public void insert(){
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "Rahul@7505";
        try {
// Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

// Connect to MySQL
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

// 1. Create Database
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS JAVA");

// 2. Use Database
            stmt.executeUpdate("USE JAVA");

// 3. Create Table
            String createTable = "CREATE TABLE IF NOT EXISTS student (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "name VARCHAR(50), " +
                    "marks INT)";
            stmt.executeUpdate(createTable);

// 4. Insert Data
            String insertData = "INSERT INTO student(name, marks) VALUES" +
                    "('Tanmay', 85)," +
                    "('Rahul', 90)";
            stmt.executeUpdate(insertData);

            System.out.println("Database, Table created & Data inserted!");

// Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.insert();
    }
}


