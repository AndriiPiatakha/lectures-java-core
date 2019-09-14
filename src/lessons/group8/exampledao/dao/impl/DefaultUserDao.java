package lessons.group8.exampledao.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lessons.group8.exampledao.dao.UserDao;
import lessons.group8.exampledao.models.UserData;

public class DefaultUserDao implements UserDao {
	
	private static final String JDBC_MYSQL_HOST = "jdbc:mysql://localhost:3306/";
	private static final String MYSQL_JDBC_DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private static final String DB_NAME = "test_schema";
	private static final String PARAMS = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";

	@Override
	public UserData getUserById() {
		Connection conn = getConnection();
		if (conn != null) {
			System.out.println("Yeees, we have connection!");
		} else {
			System.out.println("Ohhhh.. we don't have connection.");
		}
		
		return null;
	}

	private Connection getConnection() {
		try {
			Class.forName(MYSQL_JDBC_DRIVER_NAME);
			return DriverManager.getConnection(JDBC_MYSQL_HOST 
					+ DB_NAME + PARAMS, 
					USERNAME, 
					PASSWORD);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
