package bean;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Component
public class Employee {

	public Employee() {
		System.out.println("Employee default constructor");
	}
	
}
