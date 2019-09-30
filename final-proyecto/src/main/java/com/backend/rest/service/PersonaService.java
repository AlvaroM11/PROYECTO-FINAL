package com.backend.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;

import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlRootElement;

import com.backend.rest.dao.PersonaDAO;
import com.backend.rest.vo.PersonaVO;

@XmlRootElement
@Path("/PruebaFinal")
public class PersonaService {


PersonaDAO miDao=new PersonaDAO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listaPersonas() {
	
		return Response
	      .status(200)
	      .header("Access-Control-Allow-Origin", "*")
	      .header("Access-Control-Allow-Credentials", "true")
	      .header("Access-Control-Allow-Headers",
	        "origin, content-type, accept, authorization")
	      .header("Access-Control-Allow-Methods", 
	        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
	      .entity(miDao.obtenerListaPersonas())
	      .build();	
}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response consultaIndividual(@PathParam("id")int id) {
	
		return Response
	      .status(200)
	      .header("Access-Control-Allow-Origin", "*")
	      .header("Access-Control-Allow-Credentials", "true")
	      .header("Access-Control-Allow-Headers",
	        "origin, content-type, accept, authorization")
	      .header("Access-Control-Allow-Methods", 
	        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
	      .entity(miDao.consultarPersonaIndividual(id))
	      .build();	
}
	
	@POST
	@Path("/registrarPersona")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response agregarPersona(PersonaVO miPersonaVO) {
		
		return Response
			      .status(200)
			      .header("Access-Control-Allow-Origin", "*")
			      .header("Access-Control-Allow-Credentials", "true")
			      .header("Access-Control-Allow-Headers",
			        "origin, content-type, accept, authorization")
			      .header("Access-Control-Allow-Methods", 
			        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
			      .entity(miDao.registrarPersona(miPersonaVO))
			      .build();	
	}
	
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response actualizarPersona(@PathParam("id")int id, PersonaVO miPersonaVO) {
		
			return Response
				      .status(200)
				      .header("Access-Control-Allow-Origin", "*")
				      .header("Access-Control-Allow-Credentials", "true")
				      .header("Access-Control-Allow-Headers",
				        "origin, content-type, accept, authorization")
				      .header("Access-Control-Allow-Methods", 
				        "POST, PUT")
				      .entity(miDao.actualizarPersona(miPersonaVO))
				      .build();	
		
		
	}
	
	
	@DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public Response eliminarEquipo(@PathParam("id") int id) {
		return Response
	      .status(200)
	      .header("Access-Control-Allow-Origin", "*")
	      .header("Access-Control-Allow-Credentials", "true")
	      .header("Access-Control-Allow-Headers",
	        "origin, content-type, accept, authorization")
	      .header("Access-Control-Allow-Methods", 
			        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
	      .entity(miDao.eliminarPersona(id))
	      .build();
	}
}
