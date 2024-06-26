package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(KalkulatorApplication.class, args);

		Calculator calculator = new Calculator();

		double sum = calculator.add(1.5, 2.9);
		double diff = calculator.substract(6.4, 1);

		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + diff);

		System.exit(1);
	}

}
