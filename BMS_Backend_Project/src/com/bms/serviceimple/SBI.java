package com.bms.serviceimple;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.bms.config.HibernateUtil;
import com.bms.model.Account;
import com.bms.service.RBI;

public class SBI implements RBI {
	
	Account ac = new Account();
	Scanner sc = new Scanner(System.in);
	
	

	
	
	@Override
	public void CreatAccount() {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		// TODO Auto-generated method stub
		   System.out.println("Welcome to SBI,Enter the following details");
		   System.out.println("Enter your  Name: ");
		   ac.setName(sc.next());
		   
		   System.out.println("Enter your AccountNumber: ");
		   ac.setAccountno(sc.nextLong());
		   
		   System.out.println("Enter your Balance: ");
		   ac.setBalance(sc.nextDouble());
		   
		   System.out.println("Enter your MobileNo.: ");
		   long mobileno = sc.nextLong();
		   
		   if (String.valueOf(mobileno).length() == 10) {
			    ac.setMobileno(mobileno);
			    System.out.println("Valid Mobile Number");
			} else {
			    System.out.println("Invalid! Please enter 10 digits only.");
			}
		   
		   
		   System.out.println("Enter your AadharNo: ");
		   ac.setAadharno(sc.nextLong());
		   
		   System.out.println("Enter your Gender: ");
		   ac.setGender(sc.next());
		   
		   System.out.println("Enter your Age: ");
		   ac.setAge(sc.nextInt());
		   
		   System.out.println("Enter your Address: ");
		   ac.setAddress(sc.next());
		   
		   s.persist(ac);
		   tx.commit();
		   sf.close();
		   
		
	}

	@Override
	public void GetaccountDetails() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx1 = s.beginTransaction();

		System.out.println("Enter the Account Number to get Data: ");
		long an=sc.nextInt();
		String select="from Account where accountno=:an";
		Query<Account> query = s.createQuery(select,Account.class);
		query.setParameter("an", an);
		Account aco = query.getSingleResult();
		//System.out.println(aco);
		System.out.println("Your Name is : "+aco.getName());
		System.out.println("Your Account Number is : "+aco.getAccountno());
		System.out.println("Your account balance is: "+aco.getBalance());
		System.out.println("Your Mobile number: "+aco.getMobileno());
		System.out.println("Your AadharNo is: "+aco.getAadharno());
		System.out.println("Your Gender is : "+aco.getGender());
		System.out.println("Your age is: "+aco.getAge());
		System.out.println("Your Address is : "+aco.getAddress());
		
		
	}

	@Override
	public void checkbalance() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s1 = sf.openSession();
		Transaction tx = s1.beginTransaction();
		System.out.println("Enter the Account Number to get Data: ");
		long an=sc.nextInt();
		String select="from Account where accountno=:number";
		Query<Account> query = s1.createQuery(select,Account.class);
		query.setParameter("number", an);
		Account aco = query.getSingleResult();
		
		System.out.println("Your Name is : "+aco.getName());
		System.out.println("Your Account Number is : "+aco.getAccountno());
		System.out.println("Your account balance is: "+aco.getBalance());
	
		
	}

	@Override
	public void depositeAmount() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		
		
		System.out.println("Put Your account number ");
		long id = sc.nextLong();
		Account acc=s.get(Account.class, id );
		System.out.println("Enter the amount you want to deposite: ");
		double amount = sc.nextDouble();
		double balance = acc.getBalance();

		
		
		double newBalance = amount + balance;
		
		acc.setBalance(newBalance);
		s.update(acc);
		s.beginTransaction().commit();
		
		System.out.println("Updated Balance is: "+acc.getBalance());
		
	}

	@Override
	public void WithdraAmount() {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		
		System.out.println("Enter the Account Number: ");
		long id = sc.nextLong();
		Account acc1=s.get(Account.class, id);
		
		System.out.println("Enter the amount you want to Withdraw");
		double amount = sc.nextDouble();
		double balance = acc1.getBalance();
		
		
		
		if(balance > amount) {
			double updateBal = balance - amount;
			acc1.setBalance(updateBal);
			s.update(acc1);
			s.beginTransaction().commit();
			System.out.println("Withdraw succesful Updated Balance is : "+acc1.getBalance());
			
		}
		else {
			System.out.println("Insufficent fund");
		}
		
		
	}

	
	

}
