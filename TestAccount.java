import java.util.*;

public class TestAccount{
  //main method
	public static void main(String[] args){
		
		//new an object and 傳值
		Account account = new Account(1122 , "Georage" , 1000);
		
		//invoke methods in Account
		account.setAnnualInterestRate(1.5);
		account.deposit(30.0);
		account.deposit(40.0);
		account.deposit(50.0);
		account.withdraw(5.0);
		account.withdraw(4.0);
		account.withdraw(2.0);
		
		//print toString()'s information in Account
		System.out.println(account.toString());

    //jump to the next line
		System.out.println();
		System.out.print("Type\tAmount\tBalance\tDate");

    //create an object and invoke list() method in Account
		ArrayList list = account.list();
		//for loop , from 0 to the size of list
		for(int i = 0 ; i < list.size() ; i++){
		  //create an object and invoke list's get method 並傳i值進入，最後強制轉型成Transaction
			Transaction transaction = (Transaction)(list.get(i));
			//print toString()'s information in Transaction
			System.out.print(transaction.toString());
		}
	}
}
