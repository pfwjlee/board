<%@ page import="ac.yongin.cs.board.dao.BoardDAO"%>
<%@ page import="ac.yongin.cs.board.vo.BoardVO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");
	
	BoardVO vo = new BoardVO();
	vo.setTitle(title);
	vo.setWriter(writer);
	vo.setContent(content);
	
	BoardDAO dao = new BoardDAO();
	dao.insertBoard(vo);
	
	response.sendRedirect("getBoardList_proc.do");
%>