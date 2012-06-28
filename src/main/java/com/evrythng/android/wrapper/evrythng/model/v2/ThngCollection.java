/*
 * (c) Copyright 2012 EVRYTHNG Ltd London / Zurich
 * www.evrythng.net
 * 
 */
package com.evrythng.android.wrapper.evrythng.model.v2;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *  
 * @author almeidap
 * 
 */
public class ThngCollection extends Model {

    private String id;
    private String name;
    private String description;
	
	@JsonProperty("is_public")
    private Boolean isPublic;
	
	@JsonProperty("number_of_thngs")
    private int numberOfThngs;

    /**
     * Creates a new empty instance of {@link ThngCollection}.
     * This also allows dynamic instantiation.
     */
    public ThngCollection() {
    }

    public ThngCollection(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public ThngCollection(String name, String description, Boolean isPublic) {
        this(name, description);
        this.isPublic = isPublic;
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

    public int getNumberOfThngs() {
        return numberOfThngs;
    }

    public void setNumberOfThngs(int numberOfThngs) {
        this.numberOfThngs = numberOfThngs;
    }
}
