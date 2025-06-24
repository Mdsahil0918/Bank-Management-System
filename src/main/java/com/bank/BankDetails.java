package com.bank;

import org.springframework.stereotype.Component;

@Component
public class BankDetails {
	private int userid;
	private String name;
	private String email;
	private long aadharNumber;
	private long mobile;
	private String gender;
	private String address;
	private int amount;

	public BankDetails() {
		super();
	}

	public BankDetails(int userid,String name, String email, long aadharNumber, long mobile, String gender, String address,
			int amount) {
		super();
		this.userid=userid;
		this.name = name;
		this.email = email;
		this.aadharNumber = aadharNumber;
		this.mobile = mobile;
		this.gender = gender;
		this.address = address;
		this.amount = amount;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "BankDetails [userid=" + userid + ", name=" + name + ", email=" + email + ", aadharNumber="
				+ aadharNumber + ", mobile=" + mobile + ", gender=" + gender + ", address=" + address + ", amount="
				+ amount + "]";
	}


	
}
