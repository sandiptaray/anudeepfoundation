package resturant;

public class Resturant {
	String fname;
	int price;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public  Resturant(String fname, int price) {
		super();
		this.fname = fname;
		this.price = price;
	}
	public Resturant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		System.out.println("\t\t"+getFname()+"\t\t\t\t₹"+getPrice());
	}
	
	

}

