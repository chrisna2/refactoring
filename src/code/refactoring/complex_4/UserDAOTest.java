package code.refactoring.complex_4;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Before;
import org.junit.Test;

public class UserDAOTest {
	
	private UserDAO userDAO;

	@Before
	public void setUp() throws Exception {
		userDAO = new UserDAO();
		
	}

	
	@Test
	public void testConnection() {
		Connection con = userDAO.getConnection();
		assertNotNull(con);
	}
	
	@Test
	public void testCUD() throws Exception {
		UserVO userVO = new UserVO("100", "Password", "name", "user@naver.com");
		userDAO.removeUser(userVO.getUserId());
		userDAO.addUser(userVO);
		
		UserVO updateUserVO = new UserVO(userVO.getUserId(), "uPassword", "update name", "update@naver.com");
		userDAO.updateUser(updateUserVO);
		
	}

}
