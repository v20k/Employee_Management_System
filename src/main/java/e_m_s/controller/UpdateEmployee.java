package e_m_s.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import e_m_s.dao.Employee_DAO;
import e_m_s.dto.Company;
import e_m_s.dto.Employee;
import e_m_s.dto.Radio;

@WebServlet(urlPatterns = "/update",initParams = {@WebInitParam(name = "Chennai",value = "3000.0"),
                                                  @WebInitParam (name = "Kanchipuram",value = "5000.0"),
                                                  @WebInitParam(name = "Thiruvallur",value = "6000.0")  })
public class UpdateEmployee extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		 HttpSession session = req.getSession();
		  Company login = (Company) session.getAttribute("login");
		if(login!=null) {
			
			
			
		
		String id=req.getParameter("id");
		int Eid=Integer.parseInt(id);
		String name = req.getParameter("name");
	    String agee = req.getParameter("age");
	int age = Integer.parseInt(agee);

	String gen = req.getParameter("gender");
	
	  String gender1 = req.getParameter("gender");
	Radio gender = Radio.valueOf(gender1);

	
	
	String role = req.getParameter("role");
	
	  ServletContext context = getServletContext(); 
	  String uniform =context.getInitParameter(role); 
//	  System.out.println(E_uniform_charges);
    double uniform_charges=Double.parseDouble(uniform);
	 
	
	  String charges = req.getParameter("E_bus_charges");
	  
	    ServletConfig confi = getServletConfig();
        String bus = confi.getInitParameter(charges);
//        System.out.println(bus);
    double bus_charges = Double.parseDouble(bus);
//    System.out.println(bus_charges);
    
    Employee employee=new Employee();
    
    employee.setE_id(Eid);
    employee.setE_name(name);
    employee.setE_age(age);
    employee.setGen(gen);
    employee.setGender(gender);
    employee.setRole(role);
    employee.setE_uniform_charges(uniform_charges);
    employee.setE_bus_charges(bus_charges);
    employee.setDate(new Date());
    employee.setLocal_date(LocalDate.now());
    employee.setLocal_time(LocalTime.now());
    employee.setLocal_date_time(LocalDateTime.now());
    employee.setCompany(login);
    
    Employee_DAO dao=new Employee_DAO();
    dao.mergeEmployee(employee);

    req.getRequestDispatcher("ViewEmployee.jsp").forward(req, resp);
		
		}else {
			resp.sendRedirect("CompanyLogin.jsp");
		}
	}
}
