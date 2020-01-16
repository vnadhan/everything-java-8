package java8.streams;

public class Product {
	
	public Product(int id, int price) {
		super();
		Id = id;
		this.price = price;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private int Id;
	private int price;

}
