import java.util.*;

class Transaction{
	//create private variables
	private char type;
	private double amount;
	private double balance;
	private String description;
	private java.util.Date dateCreated;
	
	//no-arg constructor
	Transaction(){
		char type = 'W';
		double amount = 0;
		double balance = 0;
		String description = "J";
		dateCreated = new java.util.Date();
	}
	
	//constructor
	Transaction(char type,double amount,double balance,String description){
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
		dateCreated = new java.util.Date();
	}
	
	//get method of type
	char getType(){
		return type;
	}
	//set method of type
	void setType(char type){
		this.type = type;
	}
	
	//get method of amount
	double getAmount(){
		return amount;
	}
	//set method of amount
	void setAmount(double amount){
		this.amount = amount;
	}
	
	//get method of balance
	double getBalance(){
		return balance;
	}
	//set method of balace
	void setBalance(double balance){
		this.balance = balance;
	}
	
	//get method of description
	String getDescription(){
		return description;
	}
	//set method of description
	void setDescription(String description){
		this.description = description;
	}
	
	//get method of dateCreated
	java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	//toString method
	public String toString(){
		return "\n" + getType() + "\t" + getAmount() + "\t" + getBalance() + "\t" + getDateCreated() + "\t" + getDescription();
	}
}
