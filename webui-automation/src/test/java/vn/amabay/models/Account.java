package vn.amabay.models;

import org.apache.commons.lang3.RandomStringUtils;

public class Account {
	private String fullName;
	private String email;
	private String phone;
	private String password;
	private String rePassword;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getRePassword() {
		return rePassword ;
	}
	public void setRePassword(String rePassword) {
		this.rePassword=rePassword;
	}
	public String getEmail() {
		return email ;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public Account(String fullName,String email, String phone, String password, String rePassword) {
		this.fullName=fullName;
		this.email = String.format("%s_%s",RandomStringUtils.randomAlphabetic(10), email);
		this.phone=phone;
		this.password=password;
		this.rePassword=rePassword;
	}

}
