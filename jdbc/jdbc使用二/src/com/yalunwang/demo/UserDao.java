package com.yalunwang.demo;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.junit.Test;
/*
 * dbcp连接池
 * /
 */
public class UserDao {
	//第一种手动配置
	@Test
	public void demo1() {
		// 需求：使用DBCP连接池获得连接 遍历emp表的名字
		
		String url = "jdbc:mysql://47.94.23.210:3306/jdbcdemo";
		String user = "root";
		String password = "jBrkaTs00b8c";
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl(url);
		ds.setUsername("root");
		ds.setPassword(password);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// 获得连接
			conn = ds.getConnection();
			
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
	//第二种配置文件
	@Test
	public void demo2() throws Exception {
		Properties properties=new Properties();
	    InputStream in=	UserDao.class.getClassLoader().getResourceAsStream("db.properties");
	    properties.load(in);
		DataSource createDataSource = BasicDataSourceFactory.createDataSource(properties);
		
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// 获得连接
			conn = createDataSource.getConnection();
			
			// 获得发送sql的对象
			String sql = "select * from user where username='lisi' ";
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
