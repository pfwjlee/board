package ac.yongin.cs.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HashMap<String,Controller> list = null;
	public void init(ServletConfig config) throws ServletException
	{
		list = new HashMap<String, Controller>();
		list.put("/login_proc.do",new LoginController());
		list.put("/getBoardList_proc.do",new GetBoardListController());
		list.put("/getBoard_proc.do",new GetBoardController());
		list.put("/insertBoard_proc.do",new InsertBoardController());
		list.put("/updateBoard_proc.do",new UpdateBoardController());
		list.put("/deleteBoard_proc.do",new DeleteBoardController());
		list.put("/logout_proc.do",new LogoutController());
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.setCharacterEncoding("utf-8");
		String url = request.getRequestURI(); 
		String contextPath = request.getContextPath();
		String path = url.substring(contextPath.length());
		System.out.println("path : " + path);
		Controller subController = list.get(path);
		subController.execute(request, response);
	}
}
