public class Account{
	private String id;
	private String name;
	private int balance = 0;
	
	Account(String id, String name, int balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public void setName(){
		this.name = name;
	}
	public int getBalance(){
		return balance;
	}
	public void setBalance(int balance){
		this.balance = balance;
	}
	public int credit(int amount){
		balance = balance + amount;
		return balance;
	}
	public int debit(int amount){
		if(amount <= balance){
			balance = balance - amount;
		}
		else{
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	public int transferTo(Account another, int amount){
		if(amount <= balance){
			another.credit(amount);
			balance = balance - amount;
		}
		else{
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	public void printDetails(){
		System.out.println("Account [ id = "+id+", name = "+name+", balance = "+balance+"]");
	}
}
class TestMain{
	public static void main(String args[]){
		Account a1 = new Account("001","kamal",5000);
		Account a2 = new Account("002","nimal",1000);
		a1.credit(500);
		a1.printDetails();
		a1.debit(100);
		a1.printDetails();
		a2.printDetails();
		System.out.println();
		
		System.out.println("After the transfer 001 account balance is : " +a1.transferTo(a2,1000));
        a2.printDetails();
	}
}