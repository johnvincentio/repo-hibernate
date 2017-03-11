package com.infiniteskills.data;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.Session;

import com.infiniteskills.data.entities.Account;
import com.infiniteskills.data.entities.Budget;
import com.infiniteskills.data.entities.Transaction;

/*
select * from account;
select * from transaction;
select * from budget;
select * from budget_transaction;
*/
/*
Hibernate: insert into BUDGET (GOAL_AMOUNT, NAME, PERIOD) values (?, ?, ?)
Hibernate: insert into ACCOUNT (CLOSE_DATE, CREATED_BY, CREATED_DATE, CURRENT_BALANCE, INITIAL_BALANCE, LAST_UPDATED_BY, LAST_UPDATED_DATE, NAME, OPEN_DATE) values (?, ?, ?, ?, ?, ?, ?, ?, ?)
Hibernate: insert into TRANSACTION (ACCOUNT_ID, AMOUNT, CLOSING_BALANCE, CREATED_BY, CREATED_DATE, INITIAL_BALANCE, LAST_UPDATED_BY, LAST_UPDATED_DATE, NOTES, TITLE, TRANSACTION_TYPE) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
Hibernate: insert into TRANSACTION (ACCOUNT_ID, AMOUNT, CLOSING_BALANCE, CREATED_BY, CREATED_DATE, INITIAL_BALANCE, LAST_UPDATED_BY, LAST_UPDATED_DATE, NOTES, TITLE, TRANSACTION_TYPE) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
Hibernate: insert into BUDGET_TRANSACTION (BUDGET_ID, TRANSACTION_ID) values (?, ?)
Hibernate: insert into BUDGET_TRANSACTION (BUDGET_ID, TRANSACTION_ID) values (?, ?)
*/
public class Application {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			org.hibernate.Transaction transaction = session.beginTransaction();
			
			Account account = createNewAccount();

			Budget budget = new Budget();
			budget.setGoalAmount(new BigDecimal("10000.00"));
			budget.setName("Emergency Fund");
			budget.setPeriod("Yearly");
			
			budget.getTransactions().add(createNewBeltPurchase(account));
			budget.getTransactions().add(createShoePurchase(account));
			
			session.save(budget);
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

	private static Transaction createNewBeltPurchase(Account account) {
		Transaction beltPurchase = new Transaction();
		beltPurchase.setAccount(account);
		beltPurchase.setTitle("Dress Belt");
		beltPurchase.setAmount(new BigDecimal("50.00"));
		beltPurchase.setClosingBalance(new BigDecimal("0.00"));
		beltPurchase.setCreatedBy("Kevin Bowersox");
		beltPurchase.setCreatedDate(new Date());
		beltPurchase.setInitialBalance(new BigDecimal("0.00"));
		beltPurchase.setLastUpdatedBy("Kevin Bowersox");
		beltPurchase.setLastUpdatedDate(new Date());
		beltPurchase.setNotes("New Dress Belt");
		beltPurchase.setTransactionType("Debit");
		return beltPurchase;
	}

	private static Transaction createShoePurchase(Account account) {
		Transaction shoePurchase = new Transaction();
		shoePurchase.setAccount(account);
		shoePurchase.setTitle("Work Shoes");
		shoePurchase.setAmount(new BigDecimal("100.00"));
		shoePurchase.setClosingBalance(new BigDecimal("0.00"));
		shoePurchase.setCreatedBy("Kevin Bowersox");
		shoePurchase.setCreatedDate(new Date());
		shoePurchase.setInitialBalance(new BigDecimal("0.00"));
		shoePurchase.setLastUpdatedBy("Kevin Bowersox");
		shoePurchase.setLastUpdatedDate(new Date());
		shoePurchase.setNotes("Nice Pair of Shoes");
		shoePurchase.setTransactionType("Debit");
		return shoePurchase;
	}

	private static Account createNewAccount() {
		Account account = new Account();
		account.setCloseDate(new Date());
		account.setOpenDate(new Date());
		account.setCreatedBy("Kevin Bowersox");
		account.setInitialBalance(new BigDecimal("50.00"));
		account.setName("Savings Account");
		account.setCurrentBalance(new BigDecimal("100.00"));
		account.setLastUpdatedBy("Kevin Bowersox");
		account.setLastUpdatedDate(new Date());
		account.setCreatedDate(new Date());
		return account;
	}
}
