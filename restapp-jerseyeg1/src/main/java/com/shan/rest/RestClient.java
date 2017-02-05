package com.shan.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

import javax.ws.rs.core.UriBuilder;

public class RestClient {

	static String APPBASEURI = "http://localhost:8080/restapp-jerseyeg1";
	static String APPBASEPOSTURI = "http://localhost:8080/restapp-jerseyeg1/rest/hello?id=123&name=shan";
	
	public static void main(String[] args) throws IOException {
		
		// first way for client request this is provided by Jersey
		/*ClientConfig config =new ClientConfig();    //Jersey config object which is used to add any filters for rest requests
		Client client = ClientBuilder.newClient(config);//ClientBuilder is factory methods class which gives Client object
		WebTarget target= client.target(getBaseURI()); //it relates to targeted the application Base url
		String rs = target.path("rest/hello"). // it resolves the path to which controller
				queryParam("id", "1234").
				queryParam("name", "shan").
				request().
				accept(MediaType.TEXT_PLAIN). 
				get(String.class);   //returns type 
		
		System.out.println(rs);	*/	
		
		//second way for client request  this s provided by Java
		URL url = new URL(APPBASEPOSTURI);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/json");
		
		/*String input = "{\"qty\":100,\"name\":\"iPad 4\"}";

		OutputStream os = conn.getOutputStream();
		os.write(input.getBytes());
		os.flush();*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}
		conn.disconnect();
		
		
		
		
		
		
	}
	
	private static URI getBaseURI() {  
	    return UriBuilder.fromUri(APPBASEURI).build();  
	  }  
}
