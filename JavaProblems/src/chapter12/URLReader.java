package chapter12;
/*
 * Write a program that counts the number of words in the 
 * Gettysburg Address by Abraham Lincoln.
 */
import java.net.*;

import java.io.*;

public class URLReader {

	public static void main(String[] args) {
		
		try {
			URL address = new URL("http://rmc.library.cornell.edu/gettysburg/good_cause/transcript.html");
			int words = 0;
			
			BufferedReader in = new BufferedReader(new InputStreamReader(address.openStream()));
			
			String input = null;
			while((input = in.readLine()) != null) {
				words++;
				System.out.print(input + " ");
			}
			
			in.close();
			
			System.out.println("There are " +words+ " words in this URL.");
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
