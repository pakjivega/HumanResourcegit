package com.pakjivega.prototypehumanresource;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DatabaseConnect<T> {

	private static final String DRIVER = "com.mysql.jdbc.Driver";

	// private static final String URL = "jdbc/mydb";
	// private static final String USER = "";
	// private static final String PASSWD = "";

	public int updateRow(String querySQL) {
		Connection conection = null;
		Context ctx;
		DataSource ds;
		Statement statement = null;
		int rowsUpdated = 0;
		try {
			ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/mydb");
			Class.forName(DRIVER);
			conection = ds.getConnection();
			statement = conection.createStatement();
			rowsUpdated = statement.executeUpdate(querySQL);
		} catch (ClassNotFoundException e) {
			System.out.println("Error driver " + e.getMessage() + " not found");
		} catch (SQLException e) {
			System.out.println("Error in SQL: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error in Naming: " + e.getMessage());
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
				}
			}
			if (conection != null) {
				try {
					conection.close();
				} catch (SQLException e) {
				}
			}
		}
		return rowsUpdated;
	}

	public List<T> selectRows(String querySQL, Class classDB) {
		Connection conection = null;
		Context ctx;
		Statement statement = null;
		ResultSet rsRows = null;
		List<T> listObjects = new ArrayList<T>();
		DataSource ds;
		try {
			ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/mydb");
			Class.forName(DRIVER);
			conection = ds.getConnection();
			statement = conection.createStatement();
			rsRows = statement.executeQuery(querySQL);
			while (rsRows.next()) {
				T objectDB = (T) Class.forName(classDB.getName()).newInstance();
				Method[] metods = objectDB.getClass().getDeclaredMethods();
				for (int i = 0; i < metods.length; i++) {
					if (metods[i].getName().startsWith("set")) {
						metods[i].invoke(
								objectDB,
								rsRows.getObject(metods[i].getName().substring(3)));
					}
					if (objectDB.getClass().getName().equals("java.lang.String")) {
						objectDB = (T) rsRows.getString(1);
					}
				}
				listObjects.add(objectDB);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error Driver " + e.getMessage() + " not found");
		} catch (SQLException e) {
			System.out.println("Error in SQL " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error in Naming: " + e.getMessage());
		}
		return listObjects;
	}

}
