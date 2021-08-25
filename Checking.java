package bankAccountApp;

public class Checking extends Account {

	//list properties specific to checking account
	private int debitCardPin;
	private long DebitCardId;
	//Constructor to initialize checking account properties
	public Checking(String name,String sSN,double initDeposite) {
		super(name, sSN, initDeposite);
		accountNumber="1"+accountNumber;
		setDebitCard();
	}
	@Override
	public void setRate() {
		rate=getBaseRate()*.15;
	}
	
	//list any methods specific to the checking accounts
	public void setDebitCard() {
		DebitCardId=(long)(Math.random()*Math.pow(10, 12));
		debitCardPin=(int)(Math.random()*Math.pow(10, 3));
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("Checking Account Features"+
				"\nDebit Card ID :"+DebitCardId+
				"\nDebit Card PIN :"+debitCardPin);
	}
}
