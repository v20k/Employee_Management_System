package e_m_s.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import e_m_s.dao.Company_DAO;
import e_m_s.dao.Employee_DAO;
import e_m_s.dto.Company;
import e_m_s.dto.Employee;

@WebServlet("/delete")
public class DeleteEmployee extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		  Company login = (Company) session.getAttribute("login");
		if(login!=null) {
			

		
		
		
		String DeleteEmployee = req.getParameter("EEid");
		int Eid = Integer.parseInt(DeleteEmployee);
		
		
		Employee_DAO dao=new Employee_DAO();
		Employee employee = dao.findEmployee(Eid);
//		Company_DAO daoo=new Company_DAO();
//		daoo.deleteEmployeeLinkByCompany(login, employee);
		dao.removeEmployee(employee);
	
//		Company_DAO company_dao=new Company_DAO();
//		  Company deleteEmp = company_dao.findCompany(login.getC_id());
		
		
//		Employee_DAO dao=new Employee_DAO();
//		Employee emp=dao.findEmployee(Eid);	   
		req.getRequestDispatcher("ViewEmployee.jsp").forward(req, resp);
		
	}else {
		resp.sendRedirect("CompanyLogin.jsp");
	}
	
	}
	
	
}
