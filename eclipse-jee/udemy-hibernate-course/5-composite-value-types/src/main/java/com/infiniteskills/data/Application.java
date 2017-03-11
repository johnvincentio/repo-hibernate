package com.infiniteskills.data;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.infiniteskills.data.entities.Address;
import com.infiniteskills.data.entities.User;

public class Application {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			Transaction transaction = session.beginTransaction();

/*
 * select * from finances_user;
 * 
 * insert into FINANCES_USER (USER_ADDRESS_LINE_1, USER_ADDRESS_LINE_2, CITY, STATE, ZIP_CODE, BIRTH_DATE, CREATED_BY, CREATED_DATE, EMAIL_ADDRESS, 
 * FIRST_NAME, LAST_NAME, LAST_UPDATED_BY, LAST_UPDATED_DATE) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
 */
			User user = new User();
			Address address = new Address();
			user.setAge(22);
			user.setBirthDate(new Date());
			user.setCreatedBy("Kevin");
			user.setCreatedDate(new Date());
			user.setEmailAddress("kmb3");
			user.setFirstName("kevin");
			user.setLastName("bowersox");
			user.setLastUpdatedBy("kmb");
			user.setLastUpdatedDate(new Date());
			
			address.setAddressLine1("line 1");
			address.setAddressLine2("line2");
			address.setCity("Philadelphia");
			address.setState("PA");
			address.setZipCode("12345");
			
			user.setAddress(address);
			session.save(user);
			
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
