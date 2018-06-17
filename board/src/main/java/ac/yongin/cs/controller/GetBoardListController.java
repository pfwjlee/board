package ac.yongin.cs.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ac.yongin.cs.board.dao.BoardDAO;
import ac.yongin.cs.board.vo.BoardVO;
import ac.yongin.cs.common.HttpUtil;

public class GetBoardListController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BoardVO vo = new BoardVO();
		BoardDAO boardDao = new BoardDAO();
		List<BoardVO> boardList = boardDao.getBoardList(vo);
		
		request.setAttribute("boardList", boardList);
		HttpUtil.forward(request, response, "getBoardList.jsp");
	}
}
