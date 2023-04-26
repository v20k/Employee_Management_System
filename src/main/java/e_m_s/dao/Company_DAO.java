package e_m_s.dao;

import e_m_s.dto.Company;
import e_m_s.dto.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Company_DAO {


	
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("gamma");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	public void saveCompany(Company c) {
		transaction.begin();
		manager.persist(c);
		transaction.commit();
	}
	
	public Company findLogin(String email,String password){
		try {
			Query login = manager.createQuery("select c from Company c where c.C_email=?1 and c.C_password=?2");
			login.setParameter(1, email);
			login.setParameter(2, password);
			 Company loginAllDetails = (Company) login.getSingleResult();
			return loginAllDetails;
		} catch (Exception e) {
			return null;
		}
	}
	
	public Company getCompany(int i) {
//		return manager.find(com, factory)
		Query emp = manager.createQuery("select c from Company c where c.C_id=?1");
		emp.setParameter(1,i);
		 Company company = (Company) emp.getSingleResult();
		return company;
	}
	
	
	public Company findCompany(int id) {
	 return	manager.find(Company.class,id);
	}
	
	public void mergeCompany(Company c) {
		transaction.begin();
		manager.merge(c);
		transaction.commit();
	}
	
//	public void deleteEmployeeLinkByCompany(Company login,Employee employee ){
//		transaction.begin();
//		manager.remove(login.getEmployee().remove(employee));
//		transaction.commit();
//	}
	
}
