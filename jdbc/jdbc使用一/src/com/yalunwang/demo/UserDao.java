package com.yalunwang.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;
/*
 * jdbc入门
 */
public class UserDao {
	
	@Test
	public void selectDemo() throws Exception
	{
		//加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://47.94.23.210:3306/jdbcdemo";
		String username="root";
		String pwd="jBrkaTs00b8c";
		//获取连接
		Connection connection=DriverManager.getConnection(url,username,pwd);
		//创建Statement
		Statement createStatement = connection.createStatement();
		String sql="select * from user";
		//获取ResultSet
		ResultSet resultSet = createStatement.executeQuery(sql);
		while (resultSet.next()) {
			System.out.println(	resultSet.getString("username"));
			
		}
		//释放资源
		resultSet.close();
		createStatement.close();
		connection.close();
	}
	@Test
	public void insertDemo() throws Exception
	{
		//加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://47.94.23.210:3306/jdbcdemo";
		String username="root";
		String pwd="jBrkaTs00b8c";
		//获取连接
		Connection connection=DriverManager.getConnection(url,username,pwd);
		//创建Statement
		Statement createStatement = connection.createStatement();
		String sql = "insert into user(username, password) values('yalunwang','123456')";
		//获取ResultSet
		int ret = createStatement.executeUpdate(sql);
		
		System.out.println("影响的行数："+	ret);
	    //释放资源
		
		createStatement.close();
		connection.close();
	}
}
