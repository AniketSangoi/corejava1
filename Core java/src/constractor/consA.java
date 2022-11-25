package constractor;

public class consA {
	private String Fname;
	private String Lname;
	private int id;

	public String getFname() {
		return Fname;
	}

	public String getLname() {
		return Lname;
	}

	public int id() {
		return id;

	}

	public int getId() {
		return id;
	}

	// parameterized constructor
	public consA(String Fname, String Lname, int id) {

		this.Fname = Fname;
		this.Lname = Lname;
		this.id = id;

	}

	public consA() {
		super();
	}

}
