package code.refactoring.complex_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * 일반화 처리 5 : 템플릿 메서드 생선
 * @author kosta
 */
public class UserDAO {
	
	/*
	 * 사용자변경 부분 							| 공통되는 패턴들						
	 * -> 추상메서드					 		 -> 공통 함수
	 * 
	 * 1) sql 셋팅 -> 변경되는 부분				|
	 * 											| 2) DB Connect
	 * 3) 파라미터 셋팅 -> 변경되는 부분		|
	 * 											| 4) SQl 실행
	 * 											| 5) 커넥션 클로즈
	 */
	
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
		
		//추상 클래스를 선언하게되면 이런식의 추상 메서드를 구현하라고 나온다.
		//사용자가 변경해 주어야 하는 부분
		JdbcUtil jdbcUtil = new JdbcUtil() {
			@Override
			protected void setParameter(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, userVO.getUserId());
				pstmt.setString(2, userVO.getPassword());
				pstmt.setString(3, userVO.getName());
				pstmt.setString(3, userVO.getEmail());
			}
		};
		
		//sql 셋팅 -> 변경되는 부분 같은 경우 파라미터로 던지는 쪽이 더 좋음
		String sql = "insert into USERS values(?,?,?,?)";
		
		//반복되는 패턴 실행
		jdbcUtil.excute(sql);
	}

	public void removeUser(String userId) throws SQLException {
		
		//추상 클래스를 선언하게되면 이런식의 추상 메서드를 구현하라고 나온다.
		//사용자가 변경해 주어야 하는 부분
		JdbcUtil jdbcUtil = new JdbcUtil() {
			@Override
			protected void setParameter(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, userId);
			}
		};
		
		//sql 셋팅 -> 변경되는 부분 같은 경우 파라미터로 던지는 쪽이 더 좋음
		String sql = "delete from USERS where userId = ?";
		
		//반복되는 패턴 실행
		jdbcUtil.excute(sql);
		
	}

	public void updateUser(UserVO updateUserVO) throws SQLException {
		
		//추상 클래스를 선언하게되면 이런식의 추상 메서드를 구현하라고 나온다.
		//사용자가 변경해 주어야 하는 부분
		JdbcUtil jdbcUtil = new JdbcUtil() {
			@Override
			protected void setParameter(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, updateUserVO.getPassword());
				pstmt.setString(2, updateUserVO.getName());
				pstmt.setString(3, updateUserVO.getEmail());
				pstmt.setString(4, updateUserVO.getUserId());
			}
		};
		
		//sql 셋팅 -> 변경되는 부분 같은 경우 파라미터로 던지는 쪽이 더 좋음
		String sql = "update USERS set password = ?, name = ?, email = ? where userId = ?";
		
		//반복되는 패턴 실행
		jdbcUtil.excute(sql);
		
		
	}
	
	//현재 이 경우에는 반복되는 패턴이 적용되지 않음
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
	
	
	/* AS-IS
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

	 */

}
