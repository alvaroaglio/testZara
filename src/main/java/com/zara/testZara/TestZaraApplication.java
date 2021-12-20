package com.zara.testZara;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 
 * @author Álvaro Aglio Sánchez
 *
 */
@SpringBootApplication
@EnableJpaRepositories
public class TestZaraApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestZaraApplication.class, args);
	}
}
