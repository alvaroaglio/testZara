package com.zara.testZara.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zara.testZara.component.Utils;
import com.zara.testZara.queryDslRepository.PricesQueryDslRepository;
import com.zara.testZata.model.PricesModel;

/**
 * 
 * @author Álvaro Aglio Sánchez
 *
 */
@Service
public class PricesService {

	@Autowired
	private PricesQueryDslRepository pricesQueryDslRepository;
	
	@Autowired
	private Utils utils;
	
	/**
	 * Método que busca un precio dada una fecha, un id de producto y un id de cadena
	 * 
	 * @param date Date
	 * @param productId long
	 * @param brandId long
	 * 
	 * @return PricesModel
	 */
	public PricesModel getPriceByDate(Date date, long productId, long brandId) {
		return utils.buildPriceModel(Collections.max(pricesQueryDslRepository.getPriceByDate(date, productId, brandId), Comparator.comparing(c -> c.getPriority())));
	}
}
