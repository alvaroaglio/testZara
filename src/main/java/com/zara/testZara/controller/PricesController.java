package com.zara.testZara.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.zara.testZara.service.PricesService;
import com.zara.testZata.model.PricesModel;

/**
 * 
 * @author Álvaro Aglio Sánchez
 *
 */
@RestController
@Validated
@RequestMapping("/prices")
public class PricesController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PricesController.class);

	@Autowired
	private PricesService pricesService;
	
	/**
	 * Método que busca el precio de un producto dada una fecha, un id de producto y un id de cadena
	 * 
	 * @param productId long
	 * @param brandId  long
	 * @param date Date
	 * 
	 * @return ResponseEntity PricesModel
	 */
	@GetMapping(value = "/getPrice", produces = "application/json")
	public ResponseEntity<PricesModel> getPriceByDate(@RequestParam(name = "productId") long productId, @RequestParam(name = "brandId") long brandId, @RequestParam(name = "date") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date) {

		LOGGER.info("getPriceByDate -- Obteniendo precio para los datos: Id producto: " + productId + ", cadena: " + brandId + ", fecha" + date.toString());
		
		try {			
			
			return new ResponseEntity<PricesModel>(pricesService.getPriceByDate(date, productId, brandId), HttpStatus.OK);
			
		} catch (Exception e) {
			
			LOGGER.error("getPriceByDate -- Error al obtener el precio para los datos: Id producto: " + productId + ", cadena: " + brandId + ", fecha" + date.toString(), e.getMessage());
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Exception", e);
			
		}

	}
}
