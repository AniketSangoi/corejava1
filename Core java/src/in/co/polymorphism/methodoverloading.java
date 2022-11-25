package in.co.polymorphism;

public class methodoverloading {
	
	public static void main(String[]args) {
		
		display(2);
		display(2,4);
		display("Hello","Aniket","ji");
	}

	private static void display(int i,int j) {
		
		System.out.println("Arguments:"+i+"&"+j);
	}
	
	private static void display(int s) {
		System.out.println("Arguments:"+s);
	}
	private static void display(String s,String t,String u) {
		System.out.println("Arguments:"+s+","+t+","+u);
	}
}
