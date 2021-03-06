package com.zara.testZara.queryDslRepository;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQuery;
import com.zara.testZara.entity.Prices;
import com.zara.testZara.entity.QPrices;

/**
 * 
 * @author Álvaro Aglio Sánchez
 *
 */
@Repository
public class PricesQueryDslRepository {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PricesQueryDslRepository.class);

	private QPrices qPrices = QPrices.prices;

	@PersistenceContext
	private EntityManager em;
	
	/**
	 * Método que busca una lista de precios dada una fecha, un id de producto y un id de cadena
	 * 
	 * @param date Date
	 * @param productId long
	 * @param brandId long
	 * 
	 * @return lista de precios
	 */
	public List<Prices> getPriceByDate(Date date, long productId, long brandId) {
		
		LOGGER.info("getPriceByDate -- Obteniendo de bbdd los registros para los datos: Id producto: " + productId + ", cadena: " + brandId + ", fecha" + date.toString());

		JPAQuery<Prices> query = new JPAQuery<Prices>(em);

		return query.select(qPrices).from(qPrices)
				.where(qPrices.productId.eq(productId).and(qPrices.brandId.eq(brandId)).and(qPrices.startDate.before(date)).and(qPrices.endDate.after(date))).fetch();
	}
}
