package com.infiniteskills.data;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.infiniteskills.data.entities.Bank;

/*
 * select * from bank;
 * select * from bank_contact;
 * 
 * insert into BANK (ADDRESS_LINE_1, ADDRESS_LINE_2, CITY, STATE, ZIP_CODE, CREATED_BY, CREATED_DATE, IS_INTERNATIONAL, LAST_UPDATED_BY, LAST_UPDATED_DATE, NAME) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
 * insert into BANK_CONTACT (BANK_ID, NAME) values (?, ?)
 * insert into BANK_CONTACT (BANK_ID, NAME) values (?, ?)
*/
public class Application {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try {
			Transaction transaction = session.beginTransaction();
			
			Bank bank = new Bank();
			bank.setName("Federal Trust");
			bank.setAddressLine1("33 Wall Street");
			bank.setAddressLine2("Suite 233");
			bank.setCity("New York");
			bank.setState("NY");
			bank.setZipCode("12345");
			bank.setInternational(false);
			bank.setCreatedBy("Kevin");
			bank.setCreatedDate(new Date());
			bank.setLastUpdatedBy("Kevin");
			bank.setLastUpdatedDate(new Date());
			bank.getContacts().add("Joe");
			bank.getContacts().add("Mary");			
			session.save(bank);
			
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
