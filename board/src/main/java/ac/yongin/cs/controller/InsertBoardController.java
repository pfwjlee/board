package ac.yongin.cs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ac.yongin.cs.board.dao.BoardDAO;
import ac.yongin.cs.board.vo.BoardVO;
import ac.yongin.cs.common.HttpUtil;

public class InsertBoardController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
//		request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setWriter(writer);
		vo.setContent(content);
		
		BoardDAO dao = new BoardDAO();
		dao.insertBoard(vo);
		
		HttpUtil.forward(request, response, "getBoardList_proc.do");
	}

}
