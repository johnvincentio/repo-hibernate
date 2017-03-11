package com.infiniteskills.data;

import org.hibernate.Session;

import com.infiniteskills.data.entities.Bank;

/*
Hibernate: select bank0_.BANK_ID as BANK_ID1_1_0_, bank0_.ADDRESS_LINE_1 as ADDRESS_2_1_0_, bank0_.ADDRESS_LINE_2 as ADDRESS_3_1_0_, bank0_.ADDRESS_TYPE as ADDRESS_4_1_0_, bank0_.CITY as CITY5_1_0_, bank0_.STATE as STATE6_1_0_, bank0_.ZIP_CODE as ZIP_CODE7_1_0_, bank0_.CREATED_BY as CREATED_8_1_0_, bank0_.CREATED_DATE as CREATED_9_1_0_, bank0_.IS_INTERNATIONAL as IS_INTE10_1_0_, bank0_.LAST_UPDATED_BY as LAST_UP11_1_0_, bank0_.LAST_UPDATED_DATE as LAST_UP12_1_0_, bank0_.NAME as NAME13_1_0_ from BANK bank0_ where bank0_.BANK_ID=?
Method Executed
Second National Trust
*/
public class App1 {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try {
			org.hibernate.Transaction transaction = session.beginTransaction();
			
			Bank bank = (Bank) session.get(Bank.class, 1L);
			System.out.println("Method Executed");
			
			System.out.println(bank.getName());
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
