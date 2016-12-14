package com.shan.apitest;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;




public class Appliaction {

	public static void main(String[] args) {
		
		HttpClient httpClient=new DefaultHttpClient();
		
		URI uri = null;
		try {
			uri = new URI("https://api.sitescout.com/oauth");
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String clientIdSerect="BBI-api:mx44JbH5jDW7#";
		String encodedStr = Base64.encodeBase64(clientIdSerect.getBytes()).toString();
		String header="Basic "+encodedStr;
		System.out.println("header: "+header);
		
		HttpPost post=new HttpPost();
		post.setURI(uri);
		post.setHeader("Authorization",header);
		post.setHeader("Content-Type", "application/x-www-form-urlencoded");
		post.setHeader("Accept", "application/json");
		HttpResponse response = null;
		try {
			response = httpClient.execute(post);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("response>>>"+response);
		
		
	}
	
}
