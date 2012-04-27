package com.evrythng.wrapper.android.model;

/*
 * (c) Copyright 2012 EVRYTHNG Ltd London / Zurich www.evrythng.com
 *
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <h1>Product.java</h1>
 * 
 * <p>
 * This represents a Product POJO. It is composed of defined fields, directly
 * complying with the hProduct microformat
 * 
 * @see <a href="http://microformats.org/wiki/hproduct">hProduct</a>, and
 *      flexible fields, in the form of a key/values map.
 *      </p>
 * 
 * @author Dominique Guinard (domguinard) @project thng-crud @package
 *         com.evrythng.thng.crud.resource.product.model @copyright 2012
 *         Evrythng Ltd
 *         London / Zurich
 * 
 */

public class Product extends AbstractModel {

	private String brand;
	private String category;

	/**
	 * Product price, always in US Dollars.
	 */
	private double price;

	private String description;
	/**
	 * Product name or title
	 */
	private String fn;
	/**
	 * A URL to the photo, not the photo itself
	 */
	private String photo;

	/**
	 * Authoritative URL for this product (where more info can be found)
	 */
	private String url;
	/**
	 * A URL to a review or the review itself
	 */
	private String review;
	/**
	 * An array of global identifiers for this product
	 */
	private List<Identifier> identifiers;
	/**
	 * This holds all the flexible metadata of a Product.
	 */
	private Map<String, Object> attributes; // bucket for everything else

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	/**
	 * Gets the flexible metadata of a Product (e.g., {@code "color":
	 * "blue"});
	 * 
	 * @param attributes
	 */
	public Map<String, Object> getAttributes() {
		return attributes;
	}

	/**
	 * Sets the flexible metadata of a Product (e.g., {@code "color":
	 * "blue"} );
	 * 
	 * @param attributes
	 */
	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}

	public List<Identifier> getIdentifiers() {
		return identifiers;
	}

	public void setIdentifiers(List<Identifier> identifiers) {
		this.identifiers = identifiers;
	}

	public void addIdentifier(Identifier identifier) {
		if (identifiers == null) {
			identifiers = new ArrayList<Identifier>(1);
		}
		identifiers.add(identifier);
	}

	public Identifier firstIdentifier() {
		return identifiers.get(0);
	}
}
