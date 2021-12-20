package com.zara.testZara.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zara.testZara.entity.Prices;

/**
 * 
 * @author Álvaro Aglio Sánchez
 *
 */
@Repository
public interface PricesRepository extends JpaRepository<Prices, Serializable>{

}
