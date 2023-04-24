package Mobile;

public class Mobile 
{
	int id;
	String name;
	double price;
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public Mobile(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
