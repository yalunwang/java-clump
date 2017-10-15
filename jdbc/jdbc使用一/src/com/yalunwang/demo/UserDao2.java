package com.yalunwang.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;
/*
 * 使用了JDBC工具类
 */
public class UserDao2 {
	@Test
	public void select() throws Exception
	{
		Connection conn=null;
		PreparedStatement	prepareStatement =null;
		ResultSet rs=null;
		try {
			conn= JDBCUtil.getConnection();
			String sql="select * from user where username=?";
			prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, "zhangsan");
			rs= prepareStatement.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("username"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			JDBCUtil.release(conn, prepareStatement, rs);	
		}
		
	    
	}
}
