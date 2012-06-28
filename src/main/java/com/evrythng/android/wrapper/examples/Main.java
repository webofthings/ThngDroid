/*
 * (c) Copyright 2012 EVRYTHNG Ltd London / Zurich
 * www.evrythng.com
 * 
 */
package com.evrythng.android.wrapper.examples;

import com.evrythng.android.wrapper.evrythng.EvrythngV2Wrapper;
import com.evrythng.android.wrapper.evrythng.model.v2.Thng;

/**
 * This is a simple example of how to use the Android library.
 * @author Dominique Guinard (domguinard)
 **/

public class Main {
	//private static String EVRYTHNG_ROOT_URL = "URL_HERE";
	private static String EVRYTHNG_ROOT_URL_V3 = "URL";
	private static String EVRYTHNG_ROOT_URL_V2 = "https://evrythng.net/";
	private static String THNG_LI_URL = "URL";
	private static String API_KEY = "API-KEY";
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EvrythngV2Wrapper oldWrapper = new EvrythngV2Wrapper(EVRYTHNG_ROOT_URL_V2, API_KEY);

		Thng thng = new Thng();
		thng.setName("Test from Android!");
		thng.setDescription("Hello Android World!");

		Thng newThng = oldWrapper.post("thngs", thng, Thng.class);
		Thng getThng = oldWrapper.get(String.format("thngs/%s", newThng.getId()), Thng.class);
		
		
		System.out.println("Created thng: " + newThng.getCreatedAt());
		System.out.println("Got thng: " + getThng.getCreatedAt());
		
//		// Get Adid
//		EvrythngV3Wrapper newWrapper = new EvrythngV3Wrapper(THNG_LI_URL);
//		UrlBinding binding = newWrapper.get("34fYUxcH", UrlBinding.class);
//		
//		// Get properties
//		Property<String> property = oldWrapper.getV2(String.format("thngs/%s/properties/%s", "4fdf251c0b1cdc017400009d", "ProductName"), Property.class);	
//		System.out.println(property.getValue());
//		
//		// Get collection
//		//http://evrythng.net/collections/4fdf2efe0b1cdc01700001e7
//		ThngCollection collect = oldWrapper.getV2(String.format("collections/%s", "4fdf2efe0b1cdc01700001e7"), ThngCollection.class);
//		System.out.println(collect.getDescription());
//		
//		// Add thng to collection
//		ArrayList<String> thngs = new ArrayList<String>();
//		thngs.add("4fdf251c0b1cdc017400009d");
//		ArrayList<String> collectUpdated = oldWrapper.postV2(String.format("collections/%s/thngs", "4fdf2efe0b1cdc01700001e7"), thngs, ArrayList.class);
//		System.out.println(collectUpdated);
//		
//		// Update time
//		//Format formatter 
//		
//		Date now = Calendar.getInstance().getTime();
//		String date = now.getYear() + "/" + now.getMonth() + "/" + now.getDay() + " " + now.getHours() + ":" + now.getMinutes() + 1;
//		Property<String> updatedTime = new Property<String>("ExpiryDate", date);
//		Property<String> propertyUpdated = oldWrapper.putV2(String.format("thngs/%s/properties/%s", "4fdf251c0b1cdc017400009d", "ExpiryDate"), updatedTime, Property.class);
//		System.out.println(propertyUpdated);
//		
//		
//
//		System.out.println(binding.getAdId());
	}

}
