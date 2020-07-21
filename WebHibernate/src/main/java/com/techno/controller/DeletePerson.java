package com.techno.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techno.dao.PersonDao;
import com.techno.entites.Person;
@WebServlet("/delete")
public class DeletePerson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DeletePerson() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id=Integer.parseInt(request.getParameter("id"));
		Person p=PersonDao.getPerson(id);
		
		PersonDao.deletePerson(p);
		response.sendRedirect("show.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
