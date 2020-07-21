package com.techno.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techno.dao.PersonDao;
import com.techno.entites.Person;
@WebServlet("/save")
public class PersonSave extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public PersonSave() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String pname=request.getParameter("pname");
		int age=Integer.parseInt(request.getParameter("age"));
		
		Person p= new Person(pname,age);
		
		PersonDao.savePerson(p);
		//response.sendRedirect("index.jsp");
		RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
		request.setAttribute("msg", "person added !");
		rd.forward(request, response);
		
	}

}
