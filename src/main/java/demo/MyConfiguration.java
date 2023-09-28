package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MyConfiguration {

	@Bean
	public Sim getSim()
	{
		return new Jio();
	}
}
