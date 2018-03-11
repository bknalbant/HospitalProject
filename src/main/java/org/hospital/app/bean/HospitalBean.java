package org.hospital.app.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="hospitalB")
@SessionScoped
public class HospitalBean {

	private String firstname;
	private String lastname;
	private String standard;
	
	
	
	public String createPatient() {
		System.out.println("patient created!!");
		return "success";
	}
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	 
}
