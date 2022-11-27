package com.serkan.customerrelationshipmanagement;

import com.serkan.customerrelationshipmanagement.model.User;
import com.serkan.customerrelationshipmanagement.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerRelationshipManagementApplication implements CommandLineRunner {
	private final UserRepository userRepository;

	public CustomerRelationshipManagementApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(CustomerRelationshipManagementApplication.class, args);
	}

	@Override
	public void run(String... args) {
		User user = userRepository.save(new User("1",null,"serkan@gmail.com","password123",null)) ;
		System.out.println(user);
	}
}
