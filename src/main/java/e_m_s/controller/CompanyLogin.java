package e_m_s.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import e_m_s.dao.Company_DAO;
import e_m_s.dto.Company;
import jakarta.persistence.Query;
@WebServlet("/login")
public class CompanyLogin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		Company_DAO dao=new Company_DAO();
		Company logincredentials = dao.findLogin(email, password);
		

		
		if(logincredentials !=null) {
			HttpSession sesssion = req.getSession();
		     sesssion.setAttribute("login", logincredentials);
			req.getRequestDispatcher("DashBoard.jsp").forward(req, resp);
		}else {
			resp.sendRedirect("CompanySignup.jsp");
		}
		
	}
	
}
