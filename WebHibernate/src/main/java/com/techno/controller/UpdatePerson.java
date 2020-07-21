package com.techno.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techno.dao.PersonDao;
import com.techno.entites.Person;

@WebServlet("/update")
public class UpdatePerson extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public UpdatePerson() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		int id=Integer.parseInt(request.getParameter("id"));

		String pname=request.getParameter("pname");

		int age=Integer.parseInt(request.getParameter("age"));
		
		Person p = new Person(id,pname,age);
		
		PersonDao.updatePerson(p);
		
		response.sendRedirect("show.jsp");
	}

}
