/*
 * (c) Copyright 2012 EVRYTHNG Ltd London / Zurich
 * www.evrythng.com
 * 
 */
package com.evrythng.android.wrapper;

import com.evrythng.android.wrapper.utils.LoggerConfigurator;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.log4j.Logger;

/**
 *
 * This class is an API wrapper for Android meant to work
 * with REST APIs supporting JSON.
 *
 * @author Dominique Guinard (domguinard)
 *
 */
public class AndroidRestApiWrapper {

	private String acceptType = "application/json";
	private String contentType = "application/json";
	private String apiRoot;
	private String apiKey;
	private final Logger log = Logger.getLogger(LoggerConfigurator.class);

	public AndroidRestApiWrapper(String apiRootUrl) {
		this.apiRoot = apiRootUrl;
	}

	public AndroidRestApiWrapper(String apiRootUrl, String acceptType, String contentType, String apiKey) {
		this.apiRoot = apiRootUrl;
		this.acceptType = acceptType;
		this.contentType = contentType;
		this.apiKey = apiKey;
	}
	private static ObjectMapper mapper = new ObjectMapper();

	/**
	 * This method calls POST on a resource, i.e., it creates a resource.
	 *
	 * @param <T> Type to be mapped for response
	 * @param path path to the resource
	 * @param object resource to be POSTed
	 * @param cl Class of the POSTed resource
	 * @return The response mapper to the given type
	 */
	public <T> T post(String path, T object, Class<T> cl) {
		HttpClient httpclient = new DefaultHttpClient();
		HttpPost request = new HttpPost(apiRoot + path);
		request.addHeader("Content-Type", getContentType());
		request.addHeader("Accept", getAcceptType());
		addKey(request);

		try {
			logRequest(request.getMethod(), request.getURI());

			request.setEntity(new StringEntity(mapper.writeValueAsString(object)));
			HttpResponse response = httpclient.execute(request);
			HttpEntity entity = response.getEntity();
			return mapper.readValue(entity.getContent(), cl);

		} catch (IllegalStateException e) {
			log.error("Error while POSTting a resource", e);
		} catch (IOException e) {
			log.error("Error while POSTting a resource", e);
		}
		return null;
	}

	/**
	 * This method calls PUT on a resource, i.e., it updates an existing resource.
	 *
	 * @param <T> Type to be mapped for response
	 * @param path path to the resource
	 * @param object resource to be PUT
	 * @param cl Class of the PUT resource
	 * @return The response mapper to the given type
	 */
	public <T> T put(String path, T object, Class<T> cl) {
		HttpClient httpclient = new DefaultHttpClient();
		HttpPut request = new HttpPut(apiRoot + path);
		request.addHeader("Content-Type", getContentType());
		request.addHeader("Accept", getAcceptType());
		addKey(request);

		try {
			logRequest(request.getMethod(), request.getURI());

			request.setEntity(new StringEntity(mapper.writeValueAsString(object)));
			HttpResponse response = httpclient.execute(request);
			HttpEntity entity = response.getEntity();
			return mapper.readValue(entity.getContent(), cl);

		} catch (IllegalStateException e) {
			log.error("Error while PUTting a resource", e);
		} catch (IOException e) {
			log.error("Error while PUTting a resource", e);
		}
		return null;
	}

	/**
	 * This method calls GET on a resource, i.e., it retrieves a resource.
	 * @param <T> Type to be mapped for response
	 * @param path path to the resource
	 * @param object resource to be POSTed
	 * @param cl Class of the POSTed resource
	 * @return The response mapper to the given type
	 */
	public <T> T get(String path, Class<T> cl) {
		HttpClient httpclient = new DefaultHttpClient();
		HttpGet request = new HttpGet(apiRoot + path);
		request.addHeader("Accept", getAcceptType());
		addKey(request);

		try {
			logRequest(request.getMethod(), request.getURI());

			HttpResponse response = httpclient.execute(request);
			HttpEntity entity = response.getEntity();
			return mapper.readValue(entity.getContent(), cl);

		} catch (IllegalStateException e) {
			log.error("Error while GETting a resource", e);
		} catch (IOException e) {
			log.error("Error while GETting a resource", e);
		}
		return null;
	}

	/**
	 * 
	/**
	 * This method calls DELETE on a resource, i.e., it removes a resource.
	 * @param path path to the resource
	 * @return The HttpResponse
	 */
	public HttpResponse delete(String path) {
		HttpClient httpclient = new DefaultHttpClient();
		HttpDelete request = new HttpDelete(apiRoot + path);
		request.addHeader("Accept", getAcceptType());
		addKey(request);

		try {
			logRequest(request.getMethod(), request.getURI());
			return httpclient.execute(request);

		} catch (IllegalStateException e) {
			log.error("Error while DELETting a resource", e);
		} catch (IOException e) {
			log.error("Error while DELETting a resource", e);
		}
		return null;
	}

	/**
	 * Adds an API key to a request.
	 *
	 * @param request
	 * @param key
	 * @return
	 */
	protected HttpRequest addKey(HttpRequest request) {
		if (apiKey != null) {
			request.addHeader("X-Evrythng-Token", apiKey);
		}
		return request;
	}

	protected void printResponse(HttpResponse response) {
		String inputLine;
		HttpEntity entity = response.getEntity();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(entity.getContent()));
			while ((inputLine = in.readLine()) != null) {
				System.out.println(inputLine);
			}
			in.close();
		} catch (IOException e) {
			log.error("Error while printing response", e);
		}
	}

	private void logRequest(String method, URI url) {
		log.debug("Calling" + method + " on: " + url.toASCIIString());
	}

	public String getAcceptType() {
		return acceptType;
	}

	public void setAcceptType(String acceptType) {
		this.acceptType = acceptType;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getApiRoot() {
		return apiRoot;
	}

	public void setApiRoot(String evrythngRoot) {
		this.apiRoot = evrythngRoot;
	}
}
