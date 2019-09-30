package com.backend.rest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.backend.rest.conexion.Conexion;
import com.backend.rest.vo.EquipoVO;


public class EquipoDAO {


	public EquipoVO registrarEquipo(EquipoVO miEquipo) {
		String resultado = "";

		Connection connection = null;
		Conexion conexion = new Conexion();
		PreparedStatement preStatement = null;

		connection = conexion.getConnection();
		String consulta = "INSERT INTO equipo (equserial,numerolinea,marca,descripcion,estado)"
				+ "  VALUES (?,?,?)";
		

		try {
			preStatement = connection.prepareStatement(consulta);
			preStatement.setInt(1, miEquipo.getEquserial());
			preStatement.setInt(2, miEquipo.getNumerolinea());
			preStatement.setString(3, miEquipo.getMarca());
			preStatement.setString(3, miEquipo.getDescripcion());
			preStatement.setString(3, miEquipo.getEstado());
			
			
			
			preStatement.execute();

			resultado = "Registro Exitoso";

		} catch (SQLException e) {
			System.out.println("No se pudo registrar el equipo: " + e.getMessage());
			resultado = "No se pudo registrar el equipo";
		} finally {
			conexion.desconectar();
		}

		return miEquipo;
	}
	
	
	
	public ArrayList<EquipoVO> obtenerListaEquipo() {
		Connection connection = null;
		Conexion miConexion = new Conexion();
		PreparedStatement statement = null;
		ResultSet result = null;

		EquipoVO miEquipo=new EquipoVO();
		ArrayList<EquipoVO> listaLinea = null;
		
		
		
		connection = miConexion.getConnection();

		String consulta = "SELECT * FROM equipo";

		try {
			if (connection != null) {
				listaLinea = new ArrayList<>();
				statement = connection.prepareStatement(consulta);

				result = statement.executeQuery();

				while (result.next() == true) {
					miEquipo = new EquipoVO();
					
					miEquipo.setEquserial(result.getInt("equserial"));
					miEquipo.setNumerolinea(result.getInt("numerolinea"));
					miEquipo.setMarca(result.getString("marca"));	
					miEquipo.setDescripcion(result.getString("descripcion"));	
					miEquipo.setEstado(result.getString("estado"));	
					
					
					
					listaLinea.add(miEquipo);
				}

			}
		} catch (SQLException e) {
			System.out.println("Error en la consulta del equipo: " + e.getMessage());
		} finally {
			miConexion.desconectar();
		}
		return listaLinea;
	}
	
	public EquipoVO actualizarEquipo(EquipoVO miEquipo) {
		String resultado = "";
		Connection connection = null;
		Conexion miConexion = new Conexion();
		connection = miConexion.getConnection();
		try {
			String consulta = "UPDATE equipo "
					+ " SET estado= ?"
					+ " WHERE numerolinea= ? ";
			PreparedStatement preStatement = connection.prepareStatement(consulta);

			preStatement.setString(1, miEquipo.getEstado());
			preStatement.setInt(2, miEquipo.getNumerolinea());
			
			
			
			
			preStatement.executeUpdate();

			resultado = "Se ha Actualizado la linea satisfactoriamente";

			miConexion.desconectar();

		} catch (SQLException e) {
			System.out.println(e);
			resultado = "No se pudo actualizar la linea";
		}
		return miEquipo;
	}
	
	public String eliminarEquipo(String linea) {
		Connection connection = null;
		Conexion miConexion = new Conexion();
		connection = miConexion.getConnection();

		String resp = "";
		try {
			String sentencia = "DELETE FROM equipo WHERE numerolinea= ? ";

			PreparedStatement statement = connection.prepareStatement(sentencia);
			statement.setString(1, linea);

			statement.executeUpdate();

			resp = "El equipo se ha eliminado exitosamente";
			statement.close();
			miConexion.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			resp = "No se pudo eliminar el equipo";
		}
		return resp;
	}
	
	public EquipoVO consultarEquipoIndividual(String equipo) {
		Connection connection = null;
		Conexion miConexion = new Conexion();
		PreparedStatement statement = null;
		ResultSet result = null;

		
		
		
		EquipoVO miEquipo = null;
		System.out.println("equipo: "+equipo);

		connection = miConexion.getConnection();

		String consulta = "SELECT * FROM equipo where numerolinea = '"+equipo+"'";
		System.out.println(consulta);
		try {
			if (connection != null) {
				statement = connection.prepareStatement(consulta);

				result = statement.executeQuery();
				

				if (result.next() == true) {
					miEquipo = new EquipoVO();
					
					miEquipo.setEquserial(result.getInt("equserial"));
					miEquipo.setNumerolinea(result.getInt("numerolinea"));
					miEquipo.setMarca(result.getString("marca"));
					miEquipo.setDescripcion(result.getString("descripcion"));
					miEquipo.setEstado(result.getString("estado"));
					
					
					
					
					
									
				}
			}
		} catch (SQLException e) {
			System.out.println("Error en la consulta del empleado: " + e.getMessage());
		} finally {
			if (miEquipo!=null) {
				System.out.println("Numero linea: "+miEquipo.getNumerolinea());
				miConexion.desconectar();

			}else{
				System.out.println("numero Linea: "+miEquipo);
			}
		}
		
		
		
		return miEquipo;
	}
}

	
	

