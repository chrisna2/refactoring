package code.refactoring.complex_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	
	public Connection getConnection() {
		
		String url = "url";
		String id = "id";
		String pw = "password";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	// 문제점 
	// 중복코드 - QUery 와 인자들 뺴고는 모든 내용이 중복이 발생됨
	// 변경이 되는 부분과 변경이 되지않는 부분으로 분리
	
	public void addUser(UserVO userVO) throws SQLException {
		String sql = "insert into USERS values(?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userVO.getUserId());
			pstmt.setString(2, userVO.getPassword());
			pstmt.setString(3, userVO.getName());
			pstmt.setString(3, userVO.getEmail());
			
			pstmt.executeUpdate();		
			
		} finally {
			if(pstmt != null) {
				pstmt.close();
			}
			
			if(conn != null) {
				conn.close();
			}
		}
	}

	public void removeUser(String userId) throws SQLException {
		String sql = "delete from USERS where userId = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			
			pstmt.executeUpdate();		
			
		} finally {
			if(pstmt != null) {
				pstmt.close();
			}
			
			if(conn != null) {
				conn.close();
			}
		}
	}

	public void updateUser(UserVO updateUserVO) throws SQLException {
		String sql = "update USERS set password = ?, name = ?, email = ? where userId = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, updateUserVO.getPassword());
			pstmt.setString(2, updateUserVO.getName());
			pstmt.setString(3, updateUserVO.getEmail());
			pstmt.setString(4, updateUserVO.getUserId());
			
			pstmt.executeUpdate();		

		} finally {
			if(pstmt != null) {
				pstmt.close();
			}
			
			if(conn != null) {
				conn.close();
			}
		}
		
	}
	
	public UserVO findByUserId(String userId) throws SQLException {
		String sql = "select * from USERS where userId = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			
			pstmt.executeQuery();		
			
			if (!rs.next()) return null;
			
			return new UserVO(rs.getString("userId"),
								rs.getString("password"),
								rs.getString("name"),
								rs.getString("email"));
		} finally {
			if (rs != null) rs.close();
			if (pstmt!= null) pstmt.close();
			if (conn != null) conn.close();
		}
	}

}
