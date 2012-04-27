/*
 * (c) Copyright 2012 EVRYTHNG Ltd London / Zurich
 * www.evrythng.com
 * 
 */
package com.evrythng.wrapper.android;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.HttpGet;

/**
 * <h1>EvrythngSimpleWrapper.java</h1>
 *
 * <p> This is a very basic wrapper around the EVRYTHNG APIs. </p>
 *
 * @author Dominique Guinard (domguinard) @project evrythng-android-wrapper
 * @package com.evrythng.wrapper.android @copyright 2012 Evrythng Ltd London /
 * Zurich
 *
 */
public class EvrythngSimpleWrapper {

    private String evrythngRoot;
    private static final String ACCEPT_TYPE = "application/json";
    private static final String CONTENT_TYPE = ACCEPT_TYPE;
    private static final String TAG = "Wrapper";

    public EvrythngSimpleWrapper(String evrythngRootUrl) {
	this.evrythngRoot = evrythngRootUrl;
    }
    private static ObjectMapper mapper = new ObjectMapper();

    public <T> T post(String path, T object, Class<T> cl) {
	HttpClient httpclient = new DefaultHttpClient();
	HttpPost request = new HttpPost(evrythngRoot + path);
	request.addHeader("Content-Type", CONTENT_TYPE);
	request.addHeader("Accept", ACCEPT_TYPE);

	try {
	    request.setEntity(new StringEntity(mapper.writeValueAsString(object)));

	    HttpResponse response = httpclient.execute(request);

	    HttpEntity entity = response.getEntity();
	    return mapper.readValue(entity.getContent(), cl);

	} catch (IllegalStateException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return null;
    }

    public <T> T get(String path, Class<T> cl) {
	HttpClient httpclient = new DefaultHttpClient();
	HttpGet request = new HttpGet(evrythngRoot + path);
	request.addHeader("Accept", "application/json");

	try {
	    HttpResponse response = httpclient.execute(request);

	    HttpEntity entity = response.getEntity();
	    return mapper.readValue(entity.getContent(), cl);

	} catch (IllegalStateException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return null;
    }
}
