package exceptionsFiles;

public class NegotivePaymentException extends Exception{
	
	double payment;

	
	public NegotivePaymentException(double payment) {
		//System.out.println("ERROR: Negotive Payment"); 
		this.payment = payment;
	}
	
	public String toString() {
		return "Error: cannot take negative payment " + payment;
	}
}
