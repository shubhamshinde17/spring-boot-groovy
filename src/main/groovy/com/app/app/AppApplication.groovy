package com.app.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan
class AppApplication {

	static void main(String[] args) {
		SpringApplication.run(AppApplication, args)
	}

}
