package com.junsu.moviequiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class MovieData {
	private Connection con;
	private Statement stmt;
	private DataSource dataFactory;
	
	public void checkAnswer() {
	
		boolean result = false;
		
		try {
			con = dataFactory.getConnection();
			String query = "SELECT * FROM MOVIE";
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				
				String name = rs.getString("NAME");
				String director = rs.getString("DIRECTOR");
				String synop = rs.getString("SYNOP");
			
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
