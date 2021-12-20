package com.zara.testZara.component;

import org.springframework.stereotype.Component;

import com.zara.testZara.entity.Prices;
import com.zara.testZata.model.PricesModel;

/**
 * 
 * @author Álvaro Aglio Sánchez
 *
 */
@Component
public class Utils {

	/**
	 * Método que construye el modelo de precios dada la entidad de precios
	 * 
	 * @param prices Prices
	 * 
	 * @return PricesModel
	 */
	public PricesModel buildPriceModel(Prices prices) {
		return new PricesModel(prices.getProductId(), prices.getBrandId(), prices.getPriceList(), prices.getPrice(), prices.getStartDate(), prices.getEndDate());
	}
}
