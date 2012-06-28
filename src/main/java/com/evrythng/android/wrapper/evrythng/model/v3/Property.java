/*
 * (c) Copyright 2012 EVRYTHNG Ltd London / Zurich
 * www.evrythng.com
 * 
 */
package com.evrythng.android.wrapper.evrythng.model.v3;

/**
 * <h1>Property.java</h1>
 * 
 * Model representation for <em>properties</em>.
 * 
 * @author Pedro De Almeida (almeidap)
 * @project thng-crud
 * @package com.evrythng.thng.crud.resource.property.model
 * @copyright 2012 Evrythng Ltd London / Zurich
 **/
public class Property extends AbstractVersionableModel {

	/**
	 * Manual link reference to {@link Thng#id}.
	 */
	private String thng;

	private String key;

	private String value;

	public String getThng() {
		return thng;
	}

	public void setThng(String thng) {
		this.thng = thng;
	}

	/**
	 * Creates a new empty instance of {@link Property}.
	 * This also allows dynamic instantiation.
	 */
	public Property() {
		/* Do nothing. */
	}

	/**
	 * Creates a new instance of {@link Property}.
	 * 
	 * @param key
	 * @param value
	 */
	public Property(String key, String value) {
		this.key = key;
		this.value = value;
	}

	/**
	 * Creates a new instance of {@link Property}.
	 * 
	 * @see #Property(String, String)
	 * @param key
	 * @param value
	 */
	public Property(String key, Object value) {
		this(key, value.toString());
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
