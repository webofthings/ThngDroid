/*
 * (c) Copyright 2012 EVRYTHNG Ltd London / Zurich
 * www.evrythng.com
 * 
 */
package com.evrythng.wrapper.android.model;

import java.util.Date;

/**
 * <h1>AbstractModel.java</h1>
 * 
 * Abstract representation for models.
 * 
 * @author Pedro De Almeida (almeidap)
 * @project thng-crud
 * @package com.evrythng.thng.crud.core.model
 * @copyright 2012 Evrythng Ltd London / Zurich
 **/
public abstract class AbstractModel {

	protected String id;

	protected Date createdDate;

	public AbstractModel() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
