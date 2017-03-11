
set foreign_key_checks = 0;

delete from account;
delete from account_type;
delete from bank;
delete from bank_contact;
delete from bond;
delete from budget;
delete from budget_transaction;
delete from credential;
delete from currency;
delete from finances_user;
delete from ifinances_keys;
delete from investment;
delete from market;
delete from portfolio;
delete from stock;
delete from time_test;
delete from transaction;
delete from user_account;
delete from user_address;

set foreign_key_checks = 1;
