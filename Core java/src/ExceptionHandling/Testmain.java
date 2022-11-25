package ExceptionHandling;

public class Testmain {
	
	public static void main(String[]args) {
		
		int a=20;
		int b=0;
		
		try {
			int c=a/b;
			System.out.println("sum:"+c);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally block");
		}
		
		
	}
	

}
