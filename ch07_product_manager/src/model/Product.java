package model;

public class Product {
	private String code;
	private String description;
	private double price;
	
	// CONSTRUCTOR
	public Product(String code, String description, double price) {
		super();	// calling the constructor of java.ffkjfdfk.lang, the "God" class
		this.code = code;
		this.description = description;
		this.price = price;
	}
	// CONSTRUCTOR TWO
	public Product() {
		super();
	}
	
	//GETTERS AND SETTERS
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	// The @override thing:
	// It's a message to future devs:  fyi: This method overrides something.
	// tells you, this method overrides another method, the default behavior of the object class
	@Override	
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price=" + price + "]";
	}
	
}
