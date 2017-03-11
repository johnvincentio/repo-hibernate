package com.infiniteskills.data;

import org.hibernate.Session;

import com.infiniteskills.data.entities.Bank;

public class Application {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try {
			org.hibernate.Transaction transaction = session.beginTransaction();
			
			Bank bank = (Bank) session.load(Bank.class, 123L);
			System.out.println("survived load");
			System.out.println("Method Executed");
			
			System.out.println(bank.getName());		// object not found exception
			transaction.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			HibernateUtil.getSessionFactory().close();
		}
	}
}
