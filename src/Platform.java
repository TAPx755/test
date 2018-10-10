/*
 * class for the object platform which contains the name price and the id
 * 
 */
public class Platform {
	
	private String name;
	private double price;
	private int id;
	
	public Platform(int id)
	{
		this.name="";
		this.price=0.0;
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
}
