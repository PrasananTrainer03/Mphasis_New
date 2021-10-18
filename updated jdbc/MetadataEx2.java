package com.java.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class MetadataEx2 {

	public static void main(String[] args) throws SQLException {
		Connection con = ConnectionHelper.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from emp");  
		ResultSet rs=ps.executeQuery();  
		ResultSetMetaData rsmd=rs.getMetaData();  
		  
		System.out.println("Total columns: "+rsmd.getColumnCount());  
		int cnt = rsmd.getColumnCount();
		for(int i=1;i<=cnt;i++) {
			System.out.println(rsmd.getColumnName(i) + "   " +rsmd.getColumnTypeName(i));
		}
//		System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
//		System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  
		  
	}
}
