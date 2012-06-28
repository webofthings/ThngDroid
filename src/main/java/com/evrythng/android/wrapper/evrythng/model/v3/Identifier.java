package com.evrythng.android.wrapper.evrythng.model.v3;

/*
 * (c) Copyright 2012 EVRYTHNG Ltd London / Zurich www.evrythng.com
 *
 */
/**
 * <h1>Identifier.java</h1>
 * 
 * <p>
 * This represents a product identifier.
 * </p>
 * 
 * @author Dominique Guinard (domguinard) @project thng-crud @package
 *         com.evrythng.thng.crud.resource.product.model @copyright 2012
 *         Evrythng Ltd
 *         London / Zurich
 * 
 */
public class Identifier {

	private String type;
	private String value;

	/**
	 * Creates a new instance of {@link Identifier}.
	 */
	public Identifier() {
		/*
		 * Allow instantiation through reflection.
		 */
	}

	/**
	 * Creates a new instance of {@link Identifier} with the provided
	 * {@code type} and {@code value}.
	 * 
	 * @param type
	 *            e.g., GTIN
	 * @param value
	 *            e.g., 00843163050105
	 */
	public Identifier(String type, String value) {
		this.type = type;
		this.value = value;
	}

	/**
	 * Type of identifier, examples are: model, mpn, upc, isbn, epc, issn, ean,
	 * jan, sn, vin, sku
	 * 
	 * @return
	 */
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type.toLowerCase();
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
