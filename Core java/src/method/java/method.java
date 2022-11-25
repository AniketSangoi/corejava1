package method.java;

public class method {
	public static void main(String[]args){
		int n=2;
		int m=3;
		method obj =new method();
		int value =obj.Sum(n,m);
		
		System.out.println(value);
	}
public int Sum (int a,int b) {
	return a+b;
	
}
}
