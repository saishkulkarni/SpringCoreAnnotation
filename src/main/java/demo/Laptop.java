package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	String brand;
	int ram;
	double price;

	public Laptop(@Value("Dell") String brand,@Value("8") int ram,@Value("87500") double price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}

}
