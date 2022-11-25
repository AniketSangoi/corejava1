package constractor;

public class TestconsA {

	public static void main(String[] args) {

		consA obj = new consA("Aniket", "Sangoi", 1);

		String fn = obj.getFname();

		System.out.println(fn);

		System.out.println(obj.getLname());

		System.out.println(obj.getId());

	}
}
