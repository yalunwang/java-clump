package com.yalunwang.demo;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
/*
 * c3p0连接池使用
 */
public class UserDaoC3p0 {
	//手动配置
	@Test
	public void demo1() throws PropertyVetoException {
		String url = "jdbc:mysql://47.94.23.210:3306/jdbcdemo";
		String user = "root";
		String password = "jBrkaTs00b8c";
		// 配置连接池
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		cpds.setDriverClass("com.mysql.jdbc.Driver"); // loads the jdbc driver
		cpds.setJdbcUrl(url);
		cpds.setUser(user);
		cpds.setPassword(password);
		cpds.setMaxPoolSize(20);//设置连接池的最大连接数  
        cpds.setMinPoolSize(2);//设置连接池的最小连接数  
		cpds.setInitialPoolSize(10);//设置连接池的初始连接数  
        cpds.setMaxStatements(100);//设置连接池的缓存Statement的最大数
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			// 获得连接
			conn = cpds.getConnection();

			// 获得发送sql的对象
			String sql = "select * from user";
			stmt = conn.prepareStatement(sql);
			// 发送sql执行 返回结果
			rs = stmt.executeQuery();
			// 处理结果
			while (rs.next()) {
				String name = rs.getString("username");
				System.out.println(name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 释放资源
			JDBCUtil.release(conn, stmt, rs);
		}
	}
	//配置文件方式
	@Test
	public void demo2() throws PropertyVetoException {
	
		// 配置连接池
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			// 获得连接
			conn = cpds.getConnection();

			// 获得发送sql的对象
			String sql = "select * from user";
			stmt = conn.prepareStatement(sql);
			// 发送sql执行 返回结果
			rs = stmt.executeQuery();
			// 处理结果
			while (rs.next()) {
				String name = rs.getString("username");
				System.out.println(name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 释放资源
			JDBCUtil.release(conn, stmt, rs);
		}
	}
}
