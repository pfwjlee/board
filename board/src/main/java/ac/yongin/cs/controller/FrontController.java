package ac.yongin.cs.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ac.yongin.cs.controller.Controller;
import ac.yongin.cs.user.dao.UserDAO;
import ac.yongin.cs.user.vo.UserVO;

public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HashMap<String, Controller> mappings = null;
	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));
		System.out.println(uri + "==>" + path);

		if (path.equals("/login_proc.do")) {
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			
			UserVO vo = new UserVO();
			vo.setId(id);
			vo.setPassword(password);
			
			UserDAO dao = new UserDAO();
			UserVO user = dao.getUser(vo);
			
			if(user != null) {
				response.sendRedirect("getBoardList.do");
			}
			else {
				response.sendRedirect("login.jsp");
			}			
		} else if (path.equals("/logout_proc.do")) {

		} else if (path.equals("/getBoardList.do")) {

		} else if (path.equals("/getBoard.do")) {

		} else if (path.equals("/insertBoard_proc.do")) {

		} else if (path.equals("/updateBoard_proc.do")) {

		} else if (path.equals("/deleteBoard_proc.do")) {

		}
	}
}
