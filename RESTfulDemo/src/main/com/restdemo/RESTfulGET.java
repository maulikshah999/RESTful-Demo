package com.restdemo;


import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/get")
public class RESTfulGET {

	@GET
	@Produces("text/html")
	public Response getStartingPage() {

		String output = "<h3> REST Get method </h3>" + "Yupii!! RESTful api running correctly."
				+ " <br><br> <p> DATED: " + new Date().toString() + "<p> <br>";
		
		return Response.status(200).entity(output).build();
	}

}
