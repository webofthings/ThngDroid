/*
 * (c) Copyright 2012 EVRYTHNG Ltd London / Zurich
 * www.evrythng.com
 * 
 */
package com.evrythng.android.wrapper.evrythng.model.v3;


/**
 * <h1>Thng.java</h1>
 * 
 * Model representation for <em>thngs</em>.
 * 
 * @author Pedro De Almeida (almeidap)
 * @project thng-crud
 * @package com.evrythng.thng.crud.resource.thng.model
 * @copyright 2012 Evrythng Ltd London / Zurich
 **/
public class Thng extends AbstractModel {

	private String name;

	private String description;

	private Double latitude;

	private Double longitude;

	private String user;

	/**
	 * Reference to {@link Product#id}.
	 */
	private String product;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

}
