package ac.yongin.cs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ac.yongin.cs.common.HttpUtil;

public class LogoutController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		session.invalidate();
	
		HttpUtil.forward(request, response, "login.jsp");
	}

}
