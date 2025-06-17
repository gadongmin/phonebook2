package com.javaex.controller;

import java.io.IOException;
import java.util.List;

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
		
		// html + list
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
