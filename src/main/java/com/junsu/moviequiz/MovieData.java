package com.junsu.moviequiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class MovieData {
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;
	
	public boolean checkAnswer(String answer) {
	
		boolean result = false;
		
		try {
			con = dataFactory.getConnection();
			String query = "SELECT NAME FROM MOVIE";
			query += "WHERE MOVIE_NUM = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, queryanswer);
			ResultSet rs = pstmt.executeQuery();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
