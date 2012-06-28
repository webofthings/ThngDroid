/*
 * (c) Copyright 2012 EVRYTHNG Ltd London / Zurich
 * www.evrythng.net
 * 
 */
package com.evrythng.android.wrapper.evrythng.model.v2;

public class Property<K> extends Model {

	private String key;
	private K value;

	/**
	 * Creates a new empty instance of {@link Property}.
	 * This also allows dynamic instantiation.
	 */
	public Property() {
	}

	public Property(String key, K value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public K getValue() {
		return value;
	}

	public void setValue(K value) {
		this.value = value;
	}

}
