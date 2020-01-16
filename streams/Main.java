package java8.streams;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Main {
	
	private static int product_id = 0;
	private static int transaction_id = 0;

	public static void main(String[] args) {
		Product p1 = new Product(++product_id, new Random().nextInt(200));
		Product p2 = new Product(++product_id, new Random().nextInt(200));
		Product p3 = new Product(++product_id, new Random().nextInt(200));
		Product p4 = new Product(++product_id, new Random().nextInt(200));
		
		List<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p3);
		products.add(p4);
		products.add(p3);
		
		// Convert a stream of Products into a intStream of prices of product
		// Use method reference to point to getPrice method of Product
		int price = products.stream().mapToInt(Product::getPrice).sum();
		// another way of doing it. 
		price = products.stream().mapToInt(p->p.getPrice()).sum();
		
		Transaction t1 = new Transaction(++transaction_id, products, price, new Date());
		System.out.println(" Transaction Amt : " + t1.getPrice());
		
	}

}
