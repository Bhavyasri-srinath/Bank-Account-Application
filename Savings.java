package bankAccountApp;

public class Savings extends Account {
	//list properties specific to savings account
	    private int safetyDepositeBoxId;
	    private int safetyDepositeBoxKey;
		//Constructor to initialize settings for savings account properties
		public Savings(String name, String sSN, double initDeposite) {
			super(name,sSN,initDeposite);
			accountNumber="2"+accountNumber;
			setSaftyDepositBox();
		}
		@Override
		public void setRate() {
			rate=getBaseRate()*.25;
		}
		//list any methods specific to the savings accounts
		private void setSaftyDepositBox() {
			safetyDepositeBoxId=(int)(Math.random()*Math.pow(10, 3));
			safetyDepositeBoxKey=(int)(Math.random()*Math.pow(10, 4));
		}
		public void showInfo() {
			super.showInfo();
			System.out.println("Saving Account Features"+
					"\nSafety Deposite Box Id :"+safetyDepositeBoxId+
					"\nSafety Deposite Box Key :"+safetyDepositeBoxKey);
			
		}
}
