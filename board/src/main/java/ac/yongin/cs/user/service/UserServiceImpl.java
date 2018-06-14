package ac.yongin.cs.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ac.yongin.cs.user.dao.UserDAO;
import ac.yongin.cs.user.vo.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDao;
	
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
	
	public UserVO getUser(UserVO vo) {
		return userDao.getUser(vo);
	}

}
