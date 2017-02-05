package com.shan.rest;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ApacheClient {
	
	static String APPBASEURI = "http://localhost:8080/restapp-jerseyeg1";
	static String APPBASEFULLURI = "http://localhost:8080/rest/";

	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		HttpClient httpClient = new DefaultHttpClient();
		HttpGet getRequest = new HttpGet(APPBASEFULLURI);
		
		getRequest.addHeader("accept","text/plain");
		HttpResponse response = httpClient.execute(getRequest);
		
		int statusCode = response.getStatusLine().getStatusCode();
		if(statusCode != 200){
			throw new RuntimeException("Failed with HTTP error code : " + statusCode);
		}
		
		HttpEntity httpEntity = response.getEntity();
		String apiOutPut = EntityUtils.toString(httpEntity);
		System.out.println("output >>>>> "+apiOutPut);
		
		/*String jsonInString = "{\"employees\" : [{\"empId\":\"123\",\"empName\":\"shan\"},{\"empId\":\"123\",\"empName\":\"eswar\"}]}";
		ObjectMapper mapper =new ObjectMapper();
		EmployeeList employees = mapper.readValue(jsonInString, EmployeeList.class);
		
		System.out.println("employee obj "+employees.toString());*/
			
		
	}
}
