package com.pluralsight.NorthwindTradersSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class NorthwindTradersSpringBootApplication {
	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(NorthwindTradersSpringBootApplication.class, args);
		JdbcProductDao jdbcProductDao = ac.getBean(JdbcProductDao.class);
		jdbcProductDao.add(new Product(10000, "pen", "2", 4.00));
		System.out.println(jdbcProductDao.getAll());

	}

//	public static void main(String[] args) {
//		ApplicationContext ac = SpringApplication.run(NorthwindTradersSpringBootApplication.class, args);
//		System.out.println("Please choose 1) for list products and choose 2) for adding a product");
//		Scanner scanner = new Scanner(System.in);
//		int choice = scanner.nextInt();
//		scanner.nextLine();
//
//		ProductDao productDao = ac.getBean(ProductDao.class);
//		if(choice == 1) {
//			System.out.println(productDao.getAll());
//		} else {
//			System.out.println("Name product:");
//			String name = scanner.nextLine();
//
//			System.out.println("Product category:");
//			String category = scanner.nextLine();
//
//			System.out.println("Product price:");
//			double price = scanner.nextDouble();
//
//			productDao.add(new Product(productDao.getAll().size(), name, category, price));
//			System.out.println(productDao.getAll());
//		}
//
//		scanner.close();
//
//	}

}
