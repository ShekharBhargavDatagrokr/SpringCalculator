package SpringCalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import SpringCalculator.SharedFunction.CalculatorFunctions;

@RestController
public class CalculatorController {
	
	@Autowired
	private CalculatorFunctions cf;
	
	@RequestMapping("/")
	public String show() {
		return "Welcome to the Spring Calculator Application";
	}
	
	@GetMapping("/add")
	public double add(@RequestHeader double num1, @RequestHeader double num2) {
		return cf.add(num1,num2);
	}
	
	@GetMapping("/subtract")
	public double subtract(@RequestHeader double num1, @RequestHeader double num2) {
		return cf.subtract(num1,num2);
	}
	
	@GetMapping("/multiply")
	public double multiply(@RequestHeader double num1, @RequestHeader double num2) {
		return cf.multiply(num1,num2);
	}
	
	@GetMapping("/divide")
	public double divide(@RequestHeader double num1, @RequestHeader double num2) {
		return cf.divide(num1,num2);
	}

}
