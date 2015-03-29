import java.util.*;

class Transaction{
	private char type;
	private double amount;
	private double balance;
	private String description;
	private java.util.Date dateCreated;
	
	Transaction(){
		char type = 'W';
		double amount = 0;
		double balance =0;
		String description = "J";
	}
	
	Transaction(char type,double amount,double balance,String description){
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}
	
	char getType(){
		return type;
	}
	void setType(char type){
		this.type = type;
	}
	
	double getAmount(){
		return amount;
	}
	void setAmount(double amount){
		this.amount = amount;
	}
	
	double getBalance(){
		return balance;
	}
	void setBalance(double balance){
		this.balance = balance;
	}
	
	String getDescription(){
		return description;
	}
	void setDescription(String description){
		this.description = description;
	}
	
	java.util.Date getDateCreated(){
		return dateCreated;
	}
}
