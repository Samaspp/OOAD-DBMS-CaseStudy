package com.abcdcompany.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	// open a connection

	// close a connection

	// get the connection

	public static Connection getConnection()

	{
		// ssl secure software layer. each network packet will have ip address on where to go. socket estabkish connection btw client and server. sslfalse gives the condition each packet need not e authenticated
		String connectionURL = "jdbc:mysql://localhost:3306/feedback_db?useSSL=false"; // localhost: system ip 127.0.0.1 3306n is thr port number made by os.

		String userName = "root";

		String password = "experion@123";

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(connectionURL, userName, password);

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return connection;

	}

	// close the connection

	public static void closeConnection(Connection connection)

	{

		try {

			connection.close();

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}
	
}

