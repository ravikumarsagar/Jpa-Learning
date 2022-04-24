package com.jpalearning;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpalearning.entities.Car;
import com.jpalearning.repo.CarRepo;

@SpringBootApplication
public class JpalearningApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(JpalearningApplication.class, args);
		
		CarRepo carRepo=context.getBean(CarRepo.class);
		
		Car car=new Car();
		car.setName("BMW");
		car.setCity("Delhi");
		car.setInfo("BMW Sport Car");		
		Car car2=carRepo.save(car);
		System.out.println(car2);
		System.out.println(car2);
		
		//carRepo.deleteAll();
		
		
	}

}
