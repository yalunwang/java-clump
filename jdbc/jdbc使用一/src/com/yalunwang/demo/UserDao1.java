package com.yalunwang.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

/*
 * 使用 PrepaerdStatement
 */
public class UserDao1 {
	@Test
	public void select() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		// 获得连接
		String url = "jdbc:mysql://47.94.23.210:3306/jdbcdemo";
		String user = "root";
		String password = "jBrkaTs00b8c";
		Connection conn = DriverManager.getConnection(url, user, password);
		String sql="select * from user where username=?";
		PreparedStatement prepareStatement = conn.prepareStatement(sql);
		prepareStatement.setString(1, "zhangsan");
		ResultSet rs = prepareStatement.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString("username"));
			
		}
		// 释放资源
		rs.close();
		prepareStatement.close();
		conn.close();
	}
	@Test
	public void insert() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		// 获得连接
		String url = "jdbc:mysql://47.94.23.210:3306/jdbcdemo";
		String user = "root";
		String password = "jBrkaTs00b8c";
		Connection conn = DriverManager.getConnection(url, user, password);
		String sql="insert user (username,password) values (?,?)";
		PreparedStatement prepareStatement = conn.prepareStatement(sql);
		prepareStatement.setString(1, "xiaoli2");
		prepareStatement.setString(2, "66666");
		int ret = prepareStatement.executeUpdate();
		System.out.println(ret);
		// 释放资源
		prepareStatement.close();
		conn.close();
	}
	
}
