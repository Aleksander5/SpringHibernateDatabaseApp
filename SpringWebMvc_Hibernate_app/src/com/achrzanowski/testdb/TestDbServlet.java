package com.achrzanowski.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	/*	String user = "mvc_db_remote_user";
		String password = "mvcdbuser";
		
		String jdbcUrl = "jdbc:mysql://25.70.108.167/mvc_hb_database?useSSL=false";
		String driver = "com.mysql.jdbc.Driver"; */
		
		String user = "****";
		String password = "****";
		
		String jdbcUrl = "jdbc:mysql://remotemysql.com:3306/i11ATeNKNH?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			PrintWriter out = response.getWriter();
			
			out.println("Connecting to database: " +jdbcUrl);
			
			Class.forName(driver);
			
			Connection myConnection = DriverManager.getConnection(jdbcUrl, user, password);
			
			out.println("Connection succesful.");
			
			myConnection.close();
		}
		catch(Exception ex){
			ex.printStackTrace();
			throw new ServletException(ex);
		}
	}

}
