package com.pakjivega.prototypehumanresource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DatabaseConnect {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	//private static final String URL = "jdbc/mydb";
	//private static final String USER = "";
	//private static final String PASSWD = "";
	
	public int updateRow(String consultaSQL) {
		Connection conection = null;
		Context ctx;
		//= new InitialContext();
		DataSource ds;// = (DataSource)ctx.lookup("java:comp/env/jdbc/mydb");
		Statement statement = null;
		
		int rowsUpdated = 0;
		try {
			ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mydb");
			Class.forName(DRIVER);
			conection = ds.getConnection();
			//conection = DriverManager.getConnection(URL, USER, PASSWD);
			statement = conection.createStatement();
			rowsUpdated = statement.executeUpdate(consultaSQL);
		} catch (ClassNotFoundException e) {
			System.out.println("Error driver " + e.getMessage() + " not found");
		} catch (SQLException e) {
			System.out.println("Error in SQL: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error in Naming: " + e.getMessage());
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
		Context ctx;
		Statement statement = null;
		ResultSet rowsUpdated = null;
		DataSource ds;
		try {
			ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mydb");
			Class.forName(DRIVER);
			conection = ds.getConnection();
			//conection = DriverManager.getConnection(URL,USER, PASSWD);
			statement = conection.createStatement();
			rowsUpdated = statement.executeQuery(consultaSQL);
		} catch (ClassNotFoundException e) {
			System.out.println("Error Driver " + e.getMessage() + " not found");
		} catch (SQLException e) {
			System.out.println("Error in SQL " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error in Naming: " + e.getMessage());
		}
		return rowsUpdated;
	}
	 
}
