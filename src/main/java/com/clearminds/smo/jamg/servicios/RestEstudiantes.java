package com.clearminds.smo.jamg.servicios;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.clearminds.jamg.dtos.Estudiante;
import com.clearminds.jamg.servicios.ServicioEstudiante;

@Path("/estudiantes")
public class RestEstudiantes {
	
	@Path("/insertar")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public void insertar(Estudiante estudiante) {
		try {
			ServicioEstudiante srvEstudiantes = new ServicioEstudiante();
			srvEstudiantes.insertarEstudiante(estudiante);
			System.out.println("Insertando: " + estudiante);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Path("/actualizar")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public void actualizar(Estudiante estudiante) {
		try {
			ServicioEstudiante srvEstudiantes = new ServicioEstudiante();
			srvEstudiantes.actualizarEstudiante(estudiante);
			System.out.println("Insertando: " + estudiante);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
