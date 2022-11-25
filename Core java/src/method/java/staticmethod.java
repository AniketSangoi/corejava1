package method.java;

public class staticmethod {
	public static void main (String[]args){
		
		int n=2;
		int m=3;
		
		int value =staticmethod.sum(n,m);
		
		System.out.println(value);
		
		}
public static int sum(int a,int b) {
	return a+b;
}
}
