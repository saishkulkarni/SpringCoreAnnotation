package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Mobile mobile = (Mobile) context.getBean("mobile");
		System.out.println(mobile);
		Laptop laptop = (Laptop) context.getBean("laptop");
		System.out.println(laptop);
	}
}
