package com.websystique.springboot.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MainClass {

//	public static void main(String[] args) throws IOException {
//		System.out.println(stockHigh("ANDHRABANK"));
//	}

	public static String stockHigh(String quoteName) {
		// Make a URL to the web page
		String returnLine = null;
		try {
			URL url;
			String line = null;

			url = new URL("https://www.nseindia.com/live_market/dynaContent/live_watch/get_quote/GetQuote.jsp?symbol="
					+ quoteName + "&illiquid=0&smeFlag=0&itpFlag=0");

			// Get the input stream through URL Connection
			URLConnection con = url.openConnection();
			InputStream is = con.getInputStream();

			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			// read each line and write to System.out
			while ((line = br.readLine()) != null) {
				// System.out.println(line);
				returnLine = returnLine + "\n" + line;
			}
			
//			System.out.println(returnLine);
			
			int firstIndex = returnLine.indexOf("\",\"dayHigh\":\"");
			int endIndex = returnLine.indexOf("\",\"exDate\":\"");
//			System.out.println("==============" + firstIndex);
//			System.out.println("==============" + endIndex);
			returnLine = returnLine.substring(firstIndex + 13, endIndex);
			returnLine = returnLine.replaceAll(",", "");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return returnLine;
	}
	
	public static String stockPrice(String quoteName) {
		// Make a URL to the web page
		String returnLine = null;
		try {
			URL url;
			String line = null;

			url = new URL("https://www.nseindia.com/live_market/dynaContent/live_watch/get_quote/GetQuote.jsp?symbol="
					+ quoteName + "&illiquid=0&smeFlag=0&itpFlag=0");

			// Get the input stream through URL Connection
			URLConnection con = url.openConnection();
			InputStream is = con.getInputStream();

			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			// read each line and write to System.out
			while ((line = br.readLine()) != null) {
				// System.out.println(line);
				returnLine = returnLine + "\n" + line;
			}
			int firstIndex = returnLine.indexOf(",\"lastPrice\":\"");
			int endIndex = returnLine.indexOf("\",\"pChange\":\"");
//			System.out.println("==============" + firstIndex);
//			System.out.println("==============" + endIndex);
			returnLine = returnLine.substring(firstIndex + 14, endIndex);
			returnLine = returnLine.replaceAll(",", "");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return returnLine;
	}

}
