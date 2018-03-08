package com.coderbd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DataSourceConn {
	public static DataSource getMysqlDataSource() {
		MysqlDataSource dataSource = new MysqlDataSource();

		// Set dataSource Properties
		dataSource.setServerName("localhost");
		dataSource.setPortNumber(3306);
		dataSource.setDatabaseName("jdbc");
		dataSource.setUser("root");
		dataSource.setPassword("1234");
		return dataSource;
	}

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {

			// Get connection from DataSource
			conn = getMysqlDataSource().getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT version()");

			if (rs.next()) {
				System.out.println("Database Version : " + rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
