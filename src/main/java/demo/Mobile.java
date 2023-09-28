package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy(false)
@Scope("singleton")
public class Mobile {
	@Value("Iphone")
	String brand;
	@Value("8")
	int ram;
	@Value("79000")
	double price;
	
	@Autowired
	Sim sim;

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", ram=" + ram + ", price=" + price + ", sim=" + sim + "]";
	}

//	@Value("Iphone")
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
//	@Value("8")
//	public void setRam(int ram) {
//		this.ram = ram;
//	}
//
//	@Value("79000")
//	public void setPrice(double price) {
//		this.price = price;
//	}

	

}
