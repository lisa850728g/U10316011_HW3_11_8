import java.util.*;

class Account{
	//create private variables
	private int id = 0;
	private String name = "C";
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;
	
	//new an object transactions, its type is ArrayList
	ArrayList transactions = new ArrayList();
	ArrayList list(){
		return transactions;
	}

	//no-arg constructor
	Account(){
		id = 0;
		name = "C";
		balance = 0;
		dateCreated = new java.util.Date();
	}
	
	//constructor
	Account(int newId , String newName , double newBalance){
		id = newId;
		name = newName;
		balance = newBalance;
		dateCreated = new java.util.Date();
	}
	
	//get method of id
	int getId(){
		return id;
	}
	
	//set method of id
	void setId(int newId){
		id = newId;
	}
	
	//get method of name
	String getName(){
		return name;
	}
	
	//set method of name
	void setName(String newName){
		name = newName;
	}
	
	//get method of balance
	double getBalance(){
		return balance;
	}
	
	//set method of balance
	void setBalance(int newBalance){
		balance = newBalance;
	}
	
	//get method of annualInterestRate
	double getAnnualInterestRate(){
		return annualInterestRate ;
	}
	
	//set method of annualInterestRate
	void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
	
	//get method of dateCreated
	java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	//get method of monthlyInterestRate
	double getMonthlyInterestRate(){
		return annualInterestRate / 12 ;
	}
	
	//get method of monthlyInterest
	double getMonthlyInterest(){
		return balance * annualInterestRate / 100 / 12;
	}
	
	//withdraw method
	void withdraw(double takeMoney){
		//decrease balance
		balance -= takeMoney;
		//add an object in transactions
		transactions.add(new Transaction('W',takeMoney,balance,"Thanks!"));
	}
	
	//deposit method
	void deposit(double putMoney){
		//plus balance
		balance += putMoney;
		//add an object in transactions
		transactions.add(new Transaction('D',putMoney,balance,"Thanks!"));
	}
	
	//toString method
	public String toString(){
		return "\nName: " + getName() + "\nYour id: " + getId() +  "\nInterest rate: " + getAnnualInterestRate() +
			"%\nBalance: " + getBalance();
	}
}
