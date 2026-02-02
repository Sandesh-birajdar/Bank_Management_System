package com.bms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {
	
	@Id
	private long accountno;
	private String name;
	private double balance;
	private long mobileno;
	private long aadharno;
	private String gender;
	private int age;
	private String address;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	
	public long getAccountno() {
		return accountno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getAadharno() {
		return aadharno;
	}

	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	
	@Override
	public String toString() {
		return "Account [accountno=" + accountno + ", name=" + name + ", balance=" + balance + ", mobileno=" + mobileno
				+ ", aadharno=" + aadharno + ", gender=" + gender + ", age=" + age + ", address=" + address + "]";
	}
	
	
	

}
