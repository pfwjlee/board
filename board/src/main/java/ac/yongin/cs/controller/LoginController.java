package ac.yongin.cs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ac.yongin.cs.common.HttpUtil;
import ac.yongin.cs.user.dao.UserDAO;
import ac.yongin.cs.user.vo.UserVO;

public class LoginController implements Controller {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("LoginController");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(password);
		
		UserDAO dao = new UserDAO();
		UserVO user = dao.getUser(vo);
		
		if(user != null) {
			return "getBoardList_proc.do";
		}
		else {
			return "login";
		}			
	}
}
