package com.bms.client;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bms.service.RBI;
import com.bms.serviceimple.SBI;
import com.bms.config.HibernateUtil;
import com.bms.service.*;

public class Test {
	
	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		RBI b =new SBI();
		Scanner sc= new Scanner(System.in);
		//System.out.println("Welcome to SBI....!");
		//System.out.println("Enter the choice you have to perform: ");
		//System.out.println("1.CreateAccount\n 2.GetAccountDetails\n 3.DepositeAmount\n 4.WithdrawAmount");
		
		
		int ch = 0;
		do {
			
			System.out.println("Welcome to SBI....!");
			System.out.println("Enter the choice you have to perform: ");
			System.out.println("1.CreateAccount\n 2.GetAccountDetails\n 3.BalanceCheck \n4.DepositeAmount\n 5.WithdrawAmount\n 6.Exit \n");
			
		 ch = sc.nextInt();
		
		
		switch (ch) {
        case 1:
            b.CreatAccount();
            break;

        case 2:
            b.GetaccountDetails();
            break;

        case 3:
            b.checkbalance();
            break;

        case 4:
            b.depositeAmount();
            break;

        case 5:
            b.WithdraAmount();
            break;

        case 6:
            System.out.println("Exiting the program. Thank you!");
            break;

        default:
            System.out.println("Invalid choice! Please try again.");
    }

		}  while (ch != 6);

sc.close();
				
			
		}
		
		
	}


