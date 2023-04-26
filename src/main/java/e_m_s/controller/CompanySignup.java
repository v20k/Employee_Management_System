package e_m_s.controller;
 
import java.io.IOException;
import java.time.Year;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import e_m_s.dao.Company_DAO;
import e_m_s.dto.Company;

@WebServlet("/signup")
public class CompanySignup extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		Company company=new Company();
		company.setC_name(name);
		company.setC_email(email);
		company.setC_password(password);
		company.setStarted_year(Year.now());
		
		Company_DAO dao=new Company_DAO();
		dao.saveCompany(company);
		req.getRequestDispatcher("CompanyLogin.jsp").forward(req, resp);
	}
}
