/*
 * (c) Copyright 2012 EVRYTHNG Ltd London / Zurich
 * www.evrythng.com
 * 
 */
package com.evrythng.wrapper.android.model;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * <h1>UrlBinding.java</h1>
 * 
 * <p>
 * POJO representation of a URL binding (shortener).
 * </p>
 * 
 * @author domguinard
 * @project thng-li
 * @package com.evrythng.engine.thngli.store
 * @copyright 2012 Evrythng Ltd London / Zurich
 **/
public class UrlBinding extends AbstractModel {

	private String id;

	private String shortDomain;

	private String shortId;

	private String appUrl;

	private String adId;

	private int hits;

	public UrlBinding() {
		super();
	}

	public UrlBinding(String shortId) {
		this.shortId = shortId;
	}

	public UrlBinding(String shortId, String shortDomain) {
		this.shortId = shortId;
		this.shortDomain = shortDomain;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	public String getShortId() {
		return shortId;
	}

	public void setShortId(String shortId) {
		this.shortId = shortId;
	}

	public String getAppUrl() {
		return appUrl;
	}

	public void setAppUrl(String appUrl) {
		this.appUrl = appUrl;
	}

	public String getAdId() {
		return adId;
	}

	public void setAdId(String adId) {
		this.adId = adId;
	}

	public String getShortDomain() {
		return shortDomain;
	}

	public void setShortDomain(String shortDomain) {
		this.shortDomain = shortDomain;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public URI toRedirectURI() {
		String url = appUrl + "/" + adId;
		if (!url.contains("http://")) {
			url = "http://" + url;
		}
		try {
			return new URI(url);
		} catch (URISyntaxException e) {
			//TODO
		}
		return null;
	}

}
