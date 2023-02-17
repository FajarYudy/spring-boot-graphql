package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectGraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectGraphqlApplication.class, args);
	}

//	@Bean
//	ApplicationRunner applicationRunner(UserRepository userRepository){
//		return args -> {
//			List<User> users = userRepository.findAll();
//			if (users.isEmpty()){
//				User userAdmin = userRepository.save(new User(null, "admin","Administrator","admin@gmail.com","12345"));
//				User userGuest = userRepository.save(new User(null, "guest","Guest","guest@gmail.com","12345"));
//				User userMonitoring = userRepository.save(new User(null, ",monitoring","Monitoring","monitoring@gmail" +
//						".com",
//						"12345"));
//			}
//		};
//	}
}
