package cloning;

public class BankAccount implements Cloneable{
	
	public double balance =0;
	
	public BankAccount (double balance) {
		
		this.balance =balance;
	}
	
	public Object clone () throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	public static void main (String[]args) throws CloneNotSupportedException {
		
		BankAccount b1=new BankAccount(1000);
		BankAccount b2=(BankAccount)b1.clone();
		
		// b2.balance=2000;
		
		System.out.println(b1.balance);
		System.out.println(b2.balance);
		
	}
	

}
