<%@ page import="ac.yongin.cs.board.dao.BoardDAO"%>
<%@ page import="ac.yongin.cs.board.vo.BoardVO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");
	String seq = request.getParameter("seq");
		
	BoardVO vo = new BoardVO();
	vo.setSeq(Integer.parseInt(seq));
	
	BoardDAO dao = new BoardDAO();
	dao.deleteBoard(vo);
	
	response.sendRedirect("getBoardList.jsp");
%>