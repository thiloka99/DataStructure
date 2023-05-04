class TestMain{
	public static void main(String args[]){
		Account a1 = new Account("001","kamal",5000);
		Account a2 = new Account("002","nimal",1000);
		
		a1.printDetails();
		System.out.println("the 001 account balance is : " +a1.transferTo(a2,200));
        a2.printDetails();
	}
}