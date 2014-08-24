package com.pakjivega.prototypehumanresource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnect {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost/hr";
	private static final String USER = "root";
	private static final String PASSWD = "";
	
	public int updateRow(String consultaSQL) {
		Connection conection = null;
		Statement statement = null;
		int rowsUpdated = 0;
		try {
			Class.forName(DRIVER);
			conection = DriverManager.getConnection(URL, USER, PASSWD);
			statement = conection.createStatement();
			rowsUpdated = statement.executeUpdate(consultaSQL);
		} catch (ClassNotFoundException e) {
			System.out.println("Error driver " + e.getMessage() + " not found");
		} catch (SQLException e) {
			System.out.println("Error in SQL" + e.getMessage());
		} finally {
			if (statement != null) {
				try {statement.close();} catch (SQLException e) {}
			}
			if (conection != null) {
				try {conection.close();} catch (SQLException e) {}
			}
		}
		return rowsUpdated;
	}
	public ResultSet selectRows(String consultaSQL) {
		Connection conection = null;
		Statement statement = null;
		ResultSet rowsUpdated = null;
		try {
			Class.forName(DRIVER);
			conection = DriverManager.getConnection(URL,USER, PASSWD);
			statement = conection.createStatement();
			rowsUpdated = statement.executeQuery(consultaSQL);
		} catch (ClassNotFoundException e) {
			System.out.println("Error Driver " + e.getMessage() + " not found");
		} catch (SQLException e) {
			System.out.println("Error in SQL " + e.getMessage());
		}
		return rowsUpdated;
	}
	 
}
