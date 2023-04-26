package e_m_s.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int E_id;
	private String E_name;
	private int E_age;
	private String gen;
	@Enumerated(EnumType.STRING)
	private Radio gender;
	private String role;
	private double E_uniform_charges;
	private double E_bus_charges;
	private Date date;
	private LocalDate local_date;
	private LocalTime local_time;
	private LocalDateTime local_date_time;

	@ManyToOne
	@JoinColumn
	private Company company;
	
	
	
	
	
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public Radio getGender() {
		return gender;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public void setGender(Radio gender) {
		this.gender = gender;
	}
	public int getE_id() {
		return E_id;
	}
	public void setE_id(int e_id) {
		E_id = e_id;
	}
	public String getE_name() {
		return E_name;
	}
	public void setE_name(String e_name) {
		E_name = e_name;
	}
	public int getE_age() {
		return E_age;
	}
	public void setE_age(int e_age) {
		E_age = e_age;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getE_uniform_charges() {
		return E_uniform_charges;
	}
	public void setE_uniform_charges(double e_uniform_charges) {
		E_uniform_charges = e_uniform_charges;
	}
	public double getE_bus_charges() {
		return E_bus_charges;
	}
	public void setE_bus_charges(double e_bus_charges) {
		E_bus_charges = e_bus_charges;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public LocalDate getLocal_date() {
		return local_date;
	}
	public void setLocal_date(LocalDate local_date) {
		this.local_date = local_date;
	}
	public LocalDateTime getLocal_date_time() {
		return local_date_time;
	}
	public void setLocal_date_time(LocalDateTime local_date_time) {
		this.local_date_time = local_date_time;
	}
	public LocalTime getLocal_time() {
		return local_time;
	}
	public void setLocal_time(LocalTime local_time) {
		this.local_time = local_time;
	}
	
}
