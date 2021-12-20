package com.zara.testZara.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author Álvaro Aglio Sánchez
 *
 */
@Entity
@Table(name = "Prices")
public class Prices {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "price_list")
	@NotNull
	private long priceList;

	@Column(name = "brand_id")
	@NotNull
	private long brandId;
	
	@Column(name = "start_date")
	@NotNull
	private Date startDate;
	
	@Column(name = "end_date")
	@NotNull
	private Date endDate;
	
	@Column(name = "product_id")
	@NotNull
	private long productId;
	
	@Column(name = "priority")
	@NotNull
	private long priority;
	
	@Column(name = "price")
	@NotNull
	private double price;
	
	@Column(name = "currency")
	@NotNull
	private String currency;

	/**
	 * Constructor por defecto
	 */
	public Prices() {
		super();
	}

	/**
	 * Constructor por parametros
	 * 
	 * @param priceList
	 * @param brandId
	 * @param startDate
	 * @param endDate
	 * @param productId
	 * @param priority
	 * @param price
	 * @param currency
	 */
	public Prices(@NotNull long priceList, @NotNull long brandId, @NotNull Date startDate, @NotNull Date endDate,
			@NotNull long productId, @NotNull long priority, @NotNull double price, @NotNull String currency) {
		super();
		this.priceList = priceList;
		this.brandId = brandId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.productId = productId;
		this.priority = priority;
		this.price = price;
		this.currency = currency;
	}

	/**
	 * Método que devuelve priceList
	 * @return the priceList
	 */
	public long getPriceList() {
		return priceList;
	}

	/**
	 * Método que asigna el parámetro priceList
	 * @param priceList the priceList to set
	 */
	public void setPriceList(long priceList) {
		this.priceList = priceList;
	}

	/**
	 * Método que devuelve brandId
	 * @return the brandId
	 */
	public long getBrandId() {
		return brandId;
	}

	/**
	 * Método que asigna el parámetro brandId
	 * @param brandId the brandId to set
	 */
	public void setBrandId(long brandId) {
		this.brandId = brandId;
	}

	/**
	 * Método que devuelve startDate
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Método que asigna el parámetro startDate
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * Método que devuelve endDate
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Método que asigna el parámetro endDate
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * Método que devuelve productId
	 * @return the productId
	 */
	public long getProductId() {
		return productId;
	}

	/**
	 * Método que asigna el parámetro productId
	 * @param productId the productId to set
	 */
	public void setProductId(long productId) {
		this.productId = productId;
	}

	/**
	 * Método que devuelve priority
	 * @return the priority
	 */
	public long getPriority() {
		return priority;
	}

	/**
	 * Método que asigna el parámetro priority
	 * @param priority the priority to set
	 */
	public void setPriority(long priority) {
		this.priority = priority;
	}

	/**
	 * Método que devuelve price
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Método que asigna el parámetro price
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Método que devuelve currency
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * Método que asigna el parámetro currency
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
