package com.zara.testZara.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * 
 * @author Álvaro Aglio Sánchez
 *
 */
@SpringBootTest
public class PricesControllerTest {

	private MockMvc mvc;
	
	@Autowired
	private PricesController pricesController;
	
	@BeforeEach
	public void setUp() {
		mvc = MockMvcBuilders.standaloneSetup(pricesController).build();
	}
	
	/**
	 * Test 1 de la prueba técnica
	 * 
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {

		ResultActions response = mvc.perform(get("/prices/getPrice?productId=35455&brandId=1&date=2020-06-14 10:00:00").contentType(MediaType.APPLICATION_JSON));
		response.andExpect(status().isOk());
		String content = response.andReturn().getResponse().getContentAsString();
		JSONObject jObject = new JSONObject(content);
		System.out.println("<--------------------------------------------------->");
		System.out.println("Datos obtenidos: " + content);
		System.out.println("Precio correspondiente al producto para la fecha indicada: " + jObject.get("price"));
		System.out.println("<--------------------------------------------------->");
	}
	
	/**
	 * Test 2 de la prueba técnica
	 * 
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception {
		
		ResultActions response = mvc.perform(get("/prices/getPrice?productId=35455&brandId=1&date=2020-06-14 16:00:00").contentType(MediaType.APPLICATION_JSON));
		response.andExpect(status().isOk());
		String content = response.andReturn().getResponse().getContentAsString();
		JSONObject jObject = new JSONObject(content);
		System.out.println("<--------------------------------------------------->");
		System.out.println("Datos obtenidos: " + content);
		System.out.println("Precio conrrespondiente al producto para la fecha indicada: " + jObject.get("price"));
		System.out.println("<--------------------------------------------------->");
	}
	
	/**
	 * Test 3 de la prueba técnica
	 * 
	 * @throws Exception
	 */
	@Test
	public void test3() throws Exception {
		
		ResultActions response = mvc.perform(get("/prices/getPrice?productId=35455&brandId=1&date=2020-06-14 21:00:00").contentType(MediaType.APPLICATION_JSON));
		response.andExpect(status().isOk());
		String content = response.andReturn().getResponse().getContentAsString();
		JSONObject jObject = new JSONObject(content);
		System.out.println("<--------------------------------------------------->");
		System.out.println("Datos obtenidos: " + content);
		System.out.println("Precio correspondiente al producto para la fecha indicada: " + jObject.get("price"));
		System.out.println("<--------------------------------------------------->");
	}
	
	/**
	 * Test 4 de la prueba técnica
	 * 
	 * @throws Exception
	 */
	@Test
	public void test4() throws Exception {
		
		ResultActions response = mvc.perform(get("/prices/getPrice?productId=35455&brandId=1&date=2020-06-15 10:00:00").contentType(MediaType.APPLICATION_JSON));
		response.andExpect(status().isOk());
		String content = response.andReturn().getResponse().getContentAsString();
		JSONObject jObject = new JSONObject(content);
		System.out.println("<--------------------------------------------------->");
		System.out.println("Datos obtenidos: " + content);
		System.out.println("Precio correspondiente al producto para la fecha indicada: " + jObject.get("price"));
		System.out.println("<--------------------------------------------------->");
	}
	
	/**
	 * Test 5 de la prueba técnica
	 * 
	 * @throws Exception
	 */
	@Test
	public void test5() throws Exception {
		
		ResultActions response = mvc.perform(get("/prices/getPrice?productId=35455&brandId=1&date=2020-06-16 21:00:00").contentType(MediaType.APPLICATION_JSON));
		response.andExpect(status().isOk());
		String content = response.andReturn().getResponse().getContentAsString();
		JSONObject jObject = new JSONObject(content);
		System.out.println("<--------------------------------------------------->");
		System.out.println("Datos obtenidos: " + content);
		System.out.println("Precio correspondiente al producto para la fecha indicada: " + jObject.get("price"));
		System.out.println("<--------------------------------------------------->");
	}
}
