/*
 * defines an object named ausstattung which contains name, price and an id
 * 
 */

public class Ausstattung {
	
	private String name;
	private double price;
	private int id;
	
	public Ausstattung(int id)
	{
		this.name ="";
		this.price =0.0;
		this.id = id;
	}
	
	/*
	 * some getter and setters
	 *
	 */
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
		return this.id;
	}
	public void setIdentifier(int id) {
		this.id = id;
	}
}
