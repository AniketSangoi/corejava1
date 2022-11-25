package basicjava;

public class calculator1 {
	
	public static void main(String[]args) {
		
		char op=2;
		int a=100;
		int b=80;
		
		if (op==1) {
			int c=a=b;
			System.out.println("add="+c);
		}
		
		else if (op==2) {
			int c=a-b;
			System.out.println("sub="+c);
		}
		else if (op==3) {
			int c=a*b;
			System.out.println("mul="+c);
		}
		else if (op==4) {
			int c=b/a;
			System.out.println("divide="+c);
		}
		else {
			System.out.println("invailid");
		}
	}

}
