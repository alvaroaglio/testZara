package com.zara.testZara;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.zara.testZara.controller.PricesController;

/**
 * 
 * @author Álvaro Aglio Sánchez
 *
 */
@SpringBootTest
class TestZaraApplicationTests {
	
	@Autowired
	private PricesController pricesController;

	@Test
	public void contextLoads() throws Exception {
		assertThat(pricesController).isNotNull();
	}

}
