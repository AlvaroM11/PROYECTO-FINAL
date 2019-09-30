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

import com.backend.rest.dao.EquipoDAO;

import com.backend.rest.vo.EquipoVO;

@XmlRootElement
@Path("/lineaMovil")
public class EquipoService {


	EquipoDAO midao=new EquipoDAO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listaLinea() {
	
		return Response
	      .status(200)
	      .header("Access-Control-Allow-Origin", "*")
	      .header("Access-Control-Allow-Credentials", "true")
	      .header("Access-Control-Allow-Headers",
	        "origin, content-type, accept, authorization")
	      .header("Access-Control-Allow-Methods", 
	        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
	      .entity(midao.obtenerListaEquipo())
	      .build();	
}
	
	@GET
	@Path("/{Equipo}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response consultaIndividual(@PathParam("Equipo") String equipo) {
	
		return Response
	      .status(200)
	      .header("Access-Control-Allow-Origin", "*")
	      .header("Access-Control-Allow-Credentials", "true")
	      .header("Access-Control-Allow-Headers",
	        "origin, content-type, accept, authorization")
	      .header("Access-Control-Allow-Methods", 
	        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
	      .entity(midao.consultarEquipoIndividual(equipo))
	      .build();	
}
	
	
	@POST
	@Path("/registrarEquipo")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response registrarEquipo(EquipoVO miEquipo) {
		
		return Response
			      .status(200)
			      .header("Access-Control-Allow-Origin", "*")
			      .header("Access-Control-Allow-Credentials", "true")
			      .header("Access-Control-Allow-Headers",
			        "origin, content-type, accept, authorization")
			      .header("Access-Control-Allow-Methods", 
			        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
			      .entity(midao.registrarEquipo(miEquipo))
			      .build();	
	}
	
	
	@PUT
	@Path("/{numerolinea}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response actualizarPersona(@PathParam("numerolinea")String miEquipo, EquipoVO miEquipoVo) {
		
			return Response
				      .status(200)
				      .header("Access-Control-Allow-Origin", "*")
				      .header("Access-Control-Allow-Credentials", "true")
				      .header("Access-Control-Allow-Headers",
				        "origin, content-type, accept, authorization")
				      .header("Access-Control-Allow-Methods", 
				        "POST, PUT")
				      .entity(midao.actualizarEquipo(miEquipoVo))
				      .build();	
		
		
	}
	
	
	@DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public Response eliminarEquipo(@PathParam("id") String id) {
		return Response
	      .status(200)
	      .header("Access-Control-Allow-Origin", "*")
	      .header("Access-Control-Allow-Credentials", "true")
	      .header("Access-Control-Allow-Headers",
	        "origin, content-type, accept, authorization")
	      .header("Access-Control-Allow-Methods", 
			        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
	      .entity(midao.eliminarEquipo(id))
	      .build();
		}

	}

