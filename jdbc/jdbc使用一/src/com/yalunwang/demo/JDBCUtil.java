package com.yalunwang.demo;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {
	static String driverClass = "";
	static String url = "";
	static String user = "";
	static String password = "";
	static {
		
		// 需求： 通过properties对象读取 外部配置的内容
		Properties prop = new Properties();

		try {
			InputStream in = JDBCUtil.class.getClassLoader().getResourceAsStream("db.properties");
			// 加载外部的配置文件
			prop.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 读取外部配置文件的内容
		driverClass = prop.getProperty("driverClass");
		url = prop.getProperty("url");
		user = prop.getProperty("user");
		password = prop.getProperty("password");
	
		// 注册驱动
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	//获取连接
	public static Connection getConnection() throws Exception {
		Connection con = DriverManager.getConnection(url, user, password);

		return con;
	}
	// 释放资源
	public static void release(Connection conn, Statement stmt, ResultSet rs) {
		// 释放资源
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rs = null;

		release(conn, stmt);
	}
// 释放资源
	public static void release(Connection conn, Statement stmt) {
		// 释放资源
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stmt = null;

		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conn = null;
	}

}
