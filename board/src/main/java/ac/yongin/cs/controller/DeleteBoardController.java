package ac.yongin.cs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ac.yongin.cs.board.dao.BoardDAO;
import ac.yongin.cs.board.vo.BoardVO;
import ac.yongin.cs.common.HttpUtil;

public class DeleteBoardController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String seq = request.getParameter("seq");
		
		BoardVO vo = new BoardVO();
		vo.setSeq(Integer.parseInt(seq));
		
		BoardDAO dao = new BoardDAO();
		dao.deleteBoard(vo);
		
		return "getBoardList_proc.do";
	}

}
