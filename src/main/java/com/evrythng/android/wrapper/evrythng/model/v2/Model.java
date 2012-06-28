/*
 * (c) Copyright 2012 EVRYTHNG Ltd London / Zurich
 * www.evrythng.net
 * 
 */
package com.evrythng.android.wrapper.evrythng.model.v2;

import com.fasterxml.jackson.annotation.JsonProperty;


public abstract class Model {

	@JsonProperty("created_at")
	private String createdAt;

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
}
