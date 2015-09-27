/**
 * 
 */
package com.venturesity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author bibul
 *
 */
public class StringChallenge {

	public static final int MAX_STRINGS = 5000;
	public static final int MAX_STRING_LENGTH = 100;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = null;
			Set<String> stringSet = null;
			String[] stringOut = null;
			if((line = br.readLine())!=null) {
				if(isNumericArray(line)) {
					int n = Integer.valueOf(line);
					stringSet = new HashSet<String>(n);
					if(n>0 && n <= MAX_STRINGS) {
						for (int i=0;i<n;i++) {
							if((line = br.readLine()) != null && line.length() <= MAX_STRING_LENGTH) {
								stringSet.add(line);
							}
						}
					}
				}
			}
			if (stringSet != null && stringSet.size() > 0) {
				stringOut = (String[]) stringSet.toArray(new String[0]);
				Arrays.sort(stringOut);
			}
			for (String s : stringOut) {
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println("Unable to read input");
			e.printStackTrace();
		}

	}

	public static boolean isNumericArray(String string) {
	    if (string == null) {
	        return false;
	    }
	    for (char c : string.toCharArray()) {
	        if (c < '0' || c > '9') {
	            return false;
	        }
	    }
	    return true;
	}
}
