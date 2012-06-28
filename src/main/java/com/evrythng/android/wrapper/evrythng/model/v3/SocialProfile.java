/*
 * (c) Copyright 2012 EVRYTHNG Ltd London / Zurich
 * www.evrythng.com
 * 
 */
package com.evrythng.android.wrapper.evrythng.model.v3;


/**
 * <h1>SocialProfile.java</h1>
 * 
 * Model representation for {@link User}'s profile from external social
 * networks.
 * 
 * @author Pedro De Almeida (almeidap)
 * @project thng-crud
 * @package com.evrythng.thng.crud.resource.user.model
 * @copyright 2012 Evrythng Ltd London / Zurich
 **/
public class SocialProfile {

	public enum Provider {
		Facebook, Twitter, GooglePlus
	}

	/**
	 * The provider name of the social network.
	 */
	private Provider provider;

	/**
	 * The user's email in the current {@link SocialProfile}.
	 */
	private String email;

	/**
	 * The user's full name in the current {@link SocialProfile}.
	 */
	private String name;

	/**
	 * Creates a new instance of {@link SocialProfile}.
	 */
	public SocialProfile() {
		/* Allow instantiation through reflection. */
	}

	/**
	 * Creates a new instance of {@link SocialProfile}.
	 */
	public SocialProfile(Provider provider, String name, String email) {
		this.provider = provider;
		this.name = name;
		this.email = email;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
