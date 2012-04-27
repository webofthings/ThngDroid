/*
 * (c) Copyright 2012 EVRYTHNG Ltd London / Zurich
 * www.evrythng.com
 * 
 */
package com.evrythng.wrapper.android.model;

import java.util.List;

/**
 * <h1>UserAccount.java</h1>
 * 
 * Entity representation for user accounts.
 * 
 * @author Pedro De Almeida (almeidap)
 * @project thng-crud
 * @package com.evrythng.thng.crud.resource.user.model
 * @copyright 2012 Evrythng Ltd London / Zurich
 **/
public class User extends AbstractModel {

	/**
	 * The user's unique email address.
	 */
	private String email;

	/**
	 * SHA-256 password.
	 * 
	 * Before encoding, plain passwords are validated against the following
	 * pattern:
	 * <ol>
	 * <li>6 to 30 characters</li>
	 * <li>Only alphanumeric and selected special ({@code !@#$%}) characters
	 * allowed</li>
	 * <li>Can not start with a digit, underscore or special character</li>
	 * <li>Must contain at least one digit</li>
	 * </ol>
	 * <ul>
	 * <li><strong>Matches:</strong> {@code password1} | {@code pa$$word2} |
	 * {@code password!@#$%3}</li>
	 * <li><strong>Non-Matches:</strong> {@code password} | {@code 1stpassword}
	 * | {@code $password#}</li>
	 * </ul>
	 * 
	 * TODO: this sounds too restrictive, define a reference password regex.
	 */
	private String password;

	/**
	 * The user's first name.
	 */
	private String firstName;

	/**
	 * The user's last name.
	 */
	private String lastName;

	/**
	 * The user's timezone offset from <strong>UTC</strong>.
	 * 
	 * @see <a
	 *      href="http://en.wikipedia.org/wiki/Time_zones#List_of_time_zones_and_contained_areas">http://en.wikipedia.org/wiki/Time_zones#List_of_time_zones_and_contained_areas</a>
	 */
	private int timezone;

	/**
	 * The user's locale.
	 * 
	 * @see <a
	 *      href="http://en.wikipedia.org/wiki/ISO_639">http://en.wikipedia.org/wiki/ISO_639</a>
	 */
	private String locale;

	private List<SocialProfile> socialProfiles;

	/* *** Getters / Setters */

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getTimezone() {
		return timezone;
	}

	public void setTimezone(int timezone) {
		this.timezone = timezone;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public List<SocialProfile> getSocialProfiles() {
		return socialProfiles;
	}

	public void setSocialProfiles(List<SocialProfile> socialProfiles) {
		this.socialProfiles = socialProfiles;
	}
}
