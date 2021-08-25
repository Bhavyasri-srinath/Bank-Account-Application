package bankAccountApp;

public interface IBaseRate {
//write a method returns a base rate
	default double getBaseRate() {
		return 2.5;
	} 
}
