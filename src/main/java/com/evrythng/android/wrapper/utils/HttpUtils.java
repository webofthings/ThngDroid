/*
 * (c) Copyright 2012 EVRYTHNG Ltd London / Zurich
 * www.evrythng.com
 * 
 */
package com.evrythng.android.wrapper.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * <h1>HttpUtils.java</h1>
 * 
 * <p>
 * TODO Comment this class
 * </p>
 * 
 * @author Dominique Guinard (domguinard)
 * @project evrythng-android-wrapper
 * @package com.evrythng.wrapper.android.utils
 * @copyright 2012 Evrythng Ltd London / Zurich
 **/

public class HttpUtils {

	public static String read(InputStream instream) {
		StringBuilder sb = null;
		try {
			sb = new StringBuilder();
			BufferedReader r = new BufferedReader(new InputStreamReader(instream));
			for (String line = r.readLine(); line != null; line = r.readLine()) {
				sb.append(line);
			}

			instream.close();

		} catch (IOException e) {
		}
		return sb.toString();

	}
}
