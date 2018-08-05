package com.websystique.springboot.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonParser;

public class MainClass {

//	public static void main(String[] args) throws IOException {
//		long startTime = System.currentTimeMillis();
//		System.out.println("===Starting===="+System.currentTimeMillis());
//		String returnLine = stockPrice("ANDHRABANK");
//		
////		String returnLine = getCurrentFromQual("ANDHRABANK");
//
//		
////		JSONObject obj = new JSONObject(returnLine);
////		JSONObject jsonObject = obj.getJSONObject("dataset");
////		
////		JSONArray arr = jsonObject.getJSONArray("data");
////		
////		JSONArray array = arr.getJSONArray(0);
////		
//////		for (int i = 0; i < array.length(); i++)
//////		{
//////		    System.out.println(array.get(i));
//////		}
////		System.out.println("===Ending===="+System.currentTimeMillis());
//		long timeSpent = System.currentTimeMillis() - startTime ;
////		System.out.println("===returnLine==="+array.getDouble(2));
////		System.out.println("===returnLine==="+array.getDouble(4));
//		System.out.println("===Time Spent==="+timeSpent);
//	}

	public static String getCurrentFromQual(String quoteName) {
		// Make a URL to the web page
		String returnLine = "";
		String line = null;
		try {
			URL url;
			url = new URL("https://www.quandl.com/api/v3/datasets/NSE/" + quoteName
					+ ".json?api_key=S9DEPsWt4fHYXVx18rSm&limit=1");

			// Get the input stream through URL Connection
			URLConnection con = url.openConnection();
			InputStream is = con.getInputStream();

			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			// read each line and write to System.out
			while ((line = br.readLine()) != null) {
				// System.out.println(line);
				returnLine = returnLine + "\n" + line;
			}
			
			// Get the input stream through URL Connection
//			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//			conn.setRequestMethod("GET");
//			conn.connect();
//			int responsecode = conn.getResponseCode();
//			if (responsecode != 200) {
//				throw new RuntimeException("HttpResponseCode: " + responsecode);
//			} else {
//				Scanner sc = new Scanner(url.openStream());
//				while (sc.hasNext()) {
//					returnLine += sc.nextLine();
//				}
//				sc.close();
//			}

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

			// System.out.println(returnLine);

			int firstIndex = returnLine.indexOf("\",\"dayHigh\":\"");
			int endIndex = returnLine.indexOf("\",\"exDate\":\"");
			// System.out.println("==============" + firstIndex);
			// System.out.println("==============" + endIndex);
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
					+ quoteName);

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
			// System.out.println("==============" + firstIndex);
			// System.out.println("==============" + endIndex);
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
