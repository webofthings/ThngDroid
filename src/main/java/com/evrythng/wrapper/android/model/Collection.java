/*
 * (c) Copyright 2012 EVRYTHNG Ltd London / Zurich
 * www.evrythng.com
 * 
 */
package com.evrythng.wrapper.android.model;

import java.util.List;

/**
 * <h1>Collection.java</h1>
 * 
 * Model representation for <em>collections</em>.
 * 
 * @author Pedro De Almeida (almeidap)
 * @project thng-crud
 * @package com.evrythng.thng.crud.resource.collection.model
 * @copyright 2012 Evrythng Ltd London / Zurich
 **/
public class Collection extends AbstractModel {

	private String name;

	private String description;

	private List<String> tags;

	/**
	 * Collection of {@link Thng#id} references.
	 */
	private List<String> thngs;

	private String user;

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

	/**
	 * @return a list of tags
	 */
	public List<String> getTags() {
		return tags;
	}

	/**
	 * @param tags
	 *            the tags to set
	 */
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public List<String> getThngs() {
		return thngs;
	}

	public void setThngs(List<String> thngs) {
		this.thngs = thngs;
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
