package e_m_s.dao;

import java.util.List;

import e_m_s.dto.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Employee_DAO {

	EntityManagerFactory factory=Persistence.createEntityManagerFactory("gamma");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	public void saveEmployee(Employee e) {
		transaction.begin();
		manager.persist(e);
		transaction.commit();
	}
	
	public  List<Employee> viewEmployee() {
		
		Query employee = manager.createQuery("select e from Employee e");
		return employee.getResultList();
	}
	
	public Employee findEmployee(int id) {
	   return	manager.find(Employee.class, id);
	}
	
	public void removeEmployee(Employee employee) {
		transaction.begin();
		manager.remove(employee);
		transaction.commit();
	}
	
	public void mergeEmployee(Employee employee) {
		transaction.begin();
		manager.merge(employee);
        transaction.commit();
	}
	
	
}
