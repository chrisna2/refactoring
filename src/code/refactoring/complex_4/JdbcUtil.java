package code.refactoring.complex_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * ���ø� �޼����� Ȱ�� : Ŀ�ؼ� Ǯ�� �̷��� ����� �����̴�.
 * @author kosta
 *
 */
public abstract class JdbcUtil {
	
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
	
	//���� ����
	public void excute(String query) throws SQLException {
		
		//#1
		String sql = query;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			//#2
			setParameter(pstmt);
			
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
	
	//���� ���� �Ǵ� �κе�.
	protected abstract void setParameter(PreparedStatement pstmt) throws SQLException;
	
}
