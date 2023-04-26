package e_m_s.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import e_m_s.dto.Company;
@WebServlet("/Logout")
public class Logout extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		Company login = (Company) session.getAttribute("login");
		if (login!=null) {
			session.setAttribute("login", null);
			resp.sendRedirect("CompanyLogin.jsp");
		}else {
			resp.sendRedirect("CompanyLogin.jsp");
		}
		
		
	}
}
