package e_m_s.dto;

import java.time.Year;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int C_id;
	private String C_name;
	@Column(unique = true )
	private String C_email;
	private String C_password;
    private Year started_year;
    
    @OneToMany(mappedBy = "company",fetch = FetchType.LAZY)
    private List<Employee> employee;
    
    
	
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public int getC_id() {
		return C_id;
	}
	public void setC_id(int c_id) {
		C_id = c_id;
	}
	public String getC_name() {
		return C_name;
	}
	public void setC_name(String c_name) {
		C_name = c_name;
	}
	public String getC_email() {
		return C_email;
	}
	public void setC_email(String c_email) {
		C_email = c_email;
	}
	public String getC_password() {
		return C_password;
	}
	public void setC_password(String c_password) {
		C_password = c_password;
	}
	public Year getStarted_year() {
		return started_year;
	}
	public void setStarted_year(Year started_year) {
		this.started_year = started_year;
	}
    
    
    
	
}
