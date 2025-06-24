package com.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class BankDetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "User_name")
	private String name;
	private String email;
	private long aadharNumber;
	private long mobile;
	private String gender;
	private String address;
	private int amount;
	private int accountnumber;
	private int pinnumber;
	private String ifsccode;
	private String branch;

	public BankDetailsEntity() {
		super();
	}

	public BankDetailsEntity(int id, String name, String email, long aadharNumber, long mobile, String gender,
			String address, int amount, int accountnumber, int pinnumber, String ifsccode, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.aadharNumber = aadharNumber;
		this.mobile = mobile;
		this.gender = gender;
		this.address = address;
		this.amount = amount;
		this.accountnumber = accountnumber;
		this.pinnumber = pinnumber;
		this.ifsccode = ifsccode;
		this.branch = branch;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public int getPinnumber() {
		return pinnumber;
	}

	public void setPinnumber(int pinnumber) {
		this.pinnumber = pinnumber;
	}

	public String getIfsccode() {
		return ifsccode;
	}

	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "BankDetailsEntity [id=" + id + ", name=" + name + ", email=" + email + ", aadharNumber=" + aadharNumber
				+ ", mobile=" + mobile + ", gender=" + gender + ", address=" + address + ", amount=" + amount
				+ ", accountnumber=" + accountnumber + ", pinnumber=" + pinnumber + ", ifsccode=" + ifsccode
				+ ", branch=" + branch + "]";
	}

}
