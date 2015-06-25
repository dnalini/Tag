package com.jdbc.util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseMetadata {

	public void metaData() {
		Connection con = DatabaseUtils.getConnection();
		DatabaseMetaData dbmd;
		try {
			dbmd = con.getMetaData();
			System.out.println("Driver Name: " + dbmd.getDriverName());
			System.out.println("Driver Version: " + dbmd.getDriverVersion());
			System.out.println("UserName: " + dbmd.getUserName());
			System.out.println("Database Product Name: "+ dbmd.getDatabaseProductName());
			System.out.println("Database Product Version: "+ dbmd.getDatabaseProductVersion());

			String table[] = { "TABLE" };
			ResultSet rs = dbmd.getTables(null, null, null, table);

			while (rs.next()) {
				System.out.println(rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		DatabaseMetadata metadata = new DatabaseMetadata();
		metadata.metaData();
		
	}
}
