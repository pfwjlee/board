package ac.yongin.cs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ac.yongin.cs.board.dao.BoardDAO;
import ac.yongin.cs.board.vo.BoardVO;

public class GetBoardController implements Controller {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String seq = request.getParameter("seq");
		BoardVO vo = new BoardVO();
		vo.setSeq(Integer.parseInt(seq));
		
		BoardDAO boardDao = new BoardDAO();
		BoardVO board = boardDao.getBoard(vo);
		
		HttpSession session = request.getSession();
		session.setAttribute("board", board);
		return "getBoard";
	}

}
