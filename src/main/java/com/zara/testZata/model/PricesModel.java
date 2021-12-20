package com.zara.testZata.model;

import java.util.Date;

/**
 * 
 * @author Álvaro Aglio Sánchez
 *
 */
public class PricesModel {

	private long productId;
	private long brandId;
	private long priceList;
	private double price;
	private Date startDate;
	private Date endDate;
	
	/**
	 * Constructor por defecto
	 */
	public PricesModel() {
		super();
	}

	/**
	 * Constructor por parámetros
	 * 
	 * @param productId
	 * @param brandId
	 * @param priceList
	 * @param price
	 * @param startDate
	 * @param endDate
	 */
	public PricesModel(long productId, long brandId, long priceList, double price, Date startDate, Date endDate) {
		super();
		this.productId = productId;
		this.brandId = brandId;
		this.priceList = priceList;
		this.price = price;
		this.startDate = startDate;
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
}
