package com.evrythng.android.wrapper.evrythng;

import com.evrythng.android.wrapper.AndroidRestApiWrapper;

/*
 * (c) Copyright 2012 EVRYTHNG Ltd London / Zurich
 * www.evrythng.com
 * 
 */


/**
 * 
 * This is a wrapper for the version 2.0 of the EVRYTHNG API.
 * 
 * @author Dominique Guinard (domguinard)
 * @copyright 2012 Evrythng Ltd London / Zurich
 **/
public class EvrythngV2Wrapper extends AndroidRestApiWrapper {
	private static final String ACCEPT_TYPE = "application/vnd.evrythng-v2+json";
	private static final String CONTENT_TYPE = "application/json";

	public EvrythngV2Wrapper(String evrythngRootUrl, String apiKey) {
		super(evrythngRootUrl, ACCEPT_TYPE, CONTENT_TYPE, apiKey);
	}
	
}
