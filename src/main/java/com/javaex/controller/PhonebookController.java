package com.javaex.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaex.dao.PhonebookDAO;
import com.javaex.vo.PersonVO;


@WebServlet("/pbc")
public class PhonebookController extends HttpServlet {
	// 필드
	private static final long serialVersionUID = 1L;
       
    // 생성자(생략)

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로직
		System.out.println("PhonebookController");
		
		// DB데이터 가져오기
		PhonebookDAO phonebookDAO = new PhonebookDAO();
		List<PersonVO> personList = phonebookDAO.personSelect();
		
		System.out.println(personList);
		
		// 저밑에 있는 list.jsp에게 후반일 html을 만들고 응답문서 만들어 보낸다
		// 1)request객체에 데이터를 넣어준다
		request.setAttribute("pList", personList);
		
		// 2)list.jsp에 request객체와 response객체를 보낸다
		// forward
		RequestDispatcher rd = request.getRequestDispatcher("/list.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
