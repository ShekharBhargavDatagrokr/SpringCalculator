package SpringCalculator.CLI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"SpringCalculator"})
public class SpringCalculator1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCalculator1Application.class, args);
	}

}
