/*
 * (c) Copyright 2012 EVRYTHNG Ltd London / Zurich
 * www.evrythng.com
 * 
 */
package com.evrythng.wrapper.android;

import com.evrythng.wrapper.android.model.Thng;

/**
 * <h1>Main.java</h1>
 * 
 * <p>
 * This is a simple example of how to use the Android library.
 * </p>
 * 
 * @author Dominique Guinard (domguinard)
 * @project evrythng-android-wrapper
 * @package com.evrythng.wrapper.android
 * @copyright 2012 Evrythng Ltd London / Zurich
 **/

public class Main {
	private static String EVRYTHNG_ROOT_URL = "URL_HERE";
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EvrythngSimpleWrapper wrapper = new EvrythngSimpleWrapper(EVRYTHNG_ROOT_URL);

		Thng thng = new Thng();
		thng.setName("Test from Android!");
		thng.setDescription("Hello Android World!");

		Thng newThng = wrapper.post("thngs", thng, Thng.class);
		Thng getThng = wrapper.get(String.format("thngs/%s", newThng.getId()), Thng.class);

		System.out.println("Created thng: " + newThng.getCreatedDate());
		System.out.println("Got thng: " + getThng.getCreatedDate());
	}

}
