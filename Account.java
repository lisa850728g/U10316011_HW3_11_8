import java.util.*;

class Account{
	private int id = 0;
	private String name = "C";
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;
	
	ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	
	Account(){
		id = 0;
		name = "C";
		balance = 0;
		dateCreated = new java.util.Date();
	}
	
	Account(int newId , String newName , double newBalance){
		id = newId;
		name = newName;
		balance = newBalance;
		dateCreated = new java.util.Date();
	}
	
	int getId(){
		return id;
	}
	
	void setId(int newId){
		id = newId;
	}
	
	String getName(){
		return name;
	}
	
	void setName(String newName){
		name = newName;
	}
	
	double getBalance(){
		return balance;
	}
	
	void setBalance(int newBalance){
		balance = newBalance;
	}
	
	double getAnnualInterestRate(){
		return annualInterestRate ;
	}
	
	void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
	
	java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	double getMonthlyInterestRate(){
		return annualInterestRate / 12 ;
	}
	
	double getMonthlyInterest(){
		return balance * annualInterestRate / 100 / 12;
	}
	
	void withdraw(double takeMoney){
		balance -= takeMoney;
		transaction.add(withdraw(takeMoney));
	}
	
	void deposit(double putMoney){
		balance += putMoney;
		transaction.add(deposit(putMoney));
	}
}
