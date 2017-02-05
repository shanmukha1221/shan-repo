package com.shan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class RestService {
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg){
		
		String op = "hello " +msg;
		return Response.status(200).entity(op).build();
		
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello(@QueryParam("id") String id,@QueryParam("name") String name){		
		return "hey " +id +" name "+name;
	}
	
	/*@POST
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello(){
		return "<?xml version=\"1.0\"?>" + "<hello> Hello shanmukkkkk" + "</hello>"; 
	}*/
	
	
	/*@GET  
	@Produces(MediaType.TEXT_HTML)  
    public String sayHtmlHello() {  
	  return "<html> " + "<title>" + "Hello Jersey" + "</title>"  
	      + "<body><h1>" + "Hello Jersey HTML" + "</h1></body>" + "</html> ";  
	}  */
	

}
