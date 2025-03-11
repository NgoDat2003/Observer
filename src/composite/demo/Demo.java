package composite.demo;

import composite.entity.Cafe;
import composite.entity.Product;
import composite.entity.Table;

public class Demo {
	public static void main(String[] args) {
		Product product1 = new Product("Cà phê", 30);
		Product product2 = new Product("Trà sữa", 50);
		Product product3 = new Product("Nước suối", 20);

		Table table1 = new Table("Bàn 1");
		Table table2 = new Table("Bàn 2");

		table1.addProduct(product1);
		table1.addProduct(product2);
		table2.addProduct(product3);

		Cafe cafe = new Cafe("Quán Cà Phê ABC");

		cafe.addTable(table1);
		cafe.addTable(table2);

		System.out.println("Doanh thu cua bàn 1 "+ table1.getName()+ ": "+table1.getPrice()+" VND");
		System.out.println("Doanh thu cua bàn 2 "+ table2.getName()+ ": "+table2.getPrice()+" VND");
		System.out.println("Doanh thu của quán " + cafe.getName() + ": " + cafe.getPrice() + " VND");

	}
}
