package com.clearminds.smo.jamg.servicios;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/estudiantes")
public class RestEstudiantes {
	
	

	@Path("/hola")
	@GET
	public String saludar() {
		return "Hola mundo!!";
	}
}
