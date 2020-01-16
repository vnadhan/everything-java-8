package java8.streams;

import java.util.Date;
import java.util.List;

public class Transaction {

	private int Id;
	private List<Product> products;
	private int price;
	private Date date;

	public int getId() {
		return Id;
	}

	public Transaction(int id, List<Product> products, int price, Date date) {
		super();
		Id = id;
		this.products = products;
		this.price = price;
		this.date = date;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getPrice() {
		return price;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
