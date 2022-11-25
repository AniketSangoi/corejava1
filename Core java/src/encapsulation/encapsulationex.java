package encapsulation;

public class encapsulationex {
	private String Fname;
	private String Lname;
	private int id;
	
	public String getFname() {
		return Fname;
	}
	
	public void SetFname(String Fname) {
		
		this.Fname=Fname;
		
	}
	public String getLname() {
		return Lname;
		
	}
	public void SetLname(String Lname) {
		
		this.Lname=Lname;
	}
	
	public int getid () {
		return id;
	}
	public void Setid(int id) {
		this.id=id;
	}
	public static void main (String[]args) {
		encapsulationex en=new encapsulationex();
	
		en.SetFname("ram");
		en.SetLname("XYZ");
		en.Setid(1);
		
		String Fname=en.getFname();
	System.out.println(Fname);
	
	String Lname=en.getLname();
	System.out.println(Lname);
	
	int id =en.getid();
	System.out.println(id);
	
	}
	
	
	
	
}
