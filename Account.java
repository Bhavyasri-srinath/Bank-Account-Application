package bankAccountApp;

public abstract class Account implements IBaseRate {
	//list common properties for saving and checking accounts
	private String name;
	private String sSN;
	private double balance;
	protected String accountNumber;
	private static int index=19000;
	protected double rate;
	//Constructor to set base properties and initialize the account
	public Account(String name,String sSN,double initDeposite ) {
		this.name=name;
		this.sSN=sSN;
		balance=initDeposite;
		//set account number
		index++;
		this.accountNumber=setAccountNumber();
		setRate();
	}
	public void compound() {
		double accruedInterest=balance*(rate/100);
		balance=balance+accruedInterest;
		System.out.println("Accrued Interest: Rs"+accruedInterest);
		printBalance();
	}
	//list Common methods -transaction
	public void deposite(double amount) {
		balance=balance+amount;
		System.out.println("ammount deposited :"+amount);
		printBalance();
	}
	public void withdraw(double amount) {
		balance=balance-amount;
		System.out.println("ammount withdrawed :"+amount);
		printBalance();
	}
	public void transfer(double amount,String toWhere) {
		balance=balance-amount;
		System.out.println(" the amount Rs."+amount+" is transferred to "+toWhere);
		printBalance();
	}
	public void printBalance(){
		System.out.println("Your Balance is now :Rs"+balance);
	}
	
	public abstract void setRate();
	
	private	String setAccountNumber() {
		String lastTwoDigitsOfSSN=sSN.substring(sSN.length()-2,sSN.length());
		int uniqueID=index;
		int rand=(int)(Math.random()*Math.pow(10, 3));
		return lastTwoDigitsOfSSN+uniqueID+rand;
	}
	public void showInfo(){
		System.out.println(
				"Name :"+name+
				"\nAccount Number :"+accountNumber+
				"\nBalance :"+balance+
				"\nRate: "+rate+"%");
	}
}
