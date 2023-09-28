package com.example.Cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
//Sau khi bạn đã kích hoạt @EnableFeignClients, bạn có thể tiến hành sử dụng các Feign Client
//được tạo ra trong ứng dụng của bạn để giao tiếp với các microservices khác trong mô hình kiến trúc microservices.
public class CartApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartApplication.class, args);
	}

}

