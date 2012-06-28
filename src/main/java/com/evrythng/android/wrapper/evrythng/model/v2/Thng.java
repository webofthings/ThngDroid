/*
 * (c) Copyright 2012 EVRYTHNG Ltd London / Zurich
 * www.evrythng.net
 * 
 */
package com.evrythng.android.wrapper.evrythng.model.v2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Thng extends Model {

	private String id;

	private String name;
	private String description;
	
	@JsonProperty("is_public")
	private Boolean isPublic = false;

	private Double latitude = 0d;
	private Double longitude = 0d;

	/**
	 * Creates a new empty instance of {@link Thng}.
	 * This also allows dynamic instantiation.
	 */
	public Thng() {
	}

	public Thng(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Thng(String name, String description, Boolean isPublic) {
		this(name, description);
		this.isPublic = isPublic;
	}
        
        public Thng(String name, String description, Boolean isPublic, double latitude, double longitude) {
		this(name, description);
		this.isPublic = isPublic;
                this.latitude = new Double(latitude);
                this.longitude = new Double(longitude);
	}

	/* *** GETTTERS / SETTERS *** */

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	
	public Boolean getIsPublic() {
		return isPublic;
	}


	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

}
